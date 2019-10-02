create type type_word as (lexeme_id bigint, meaning_id bigint, value text, lang char(3), lex_complexity varchar(100), word_type_codes varchar(100) array);
create type type_lang_complexity as (lang char(3), complexity varchar(100));
create type type_definition as (lexeme_id bigint, meaning_id bigint, value text, value_prese text, lang char(3), complexity varchar(100));
create type type_domain as (origin varchar(100), code varchar(100));
create type type_usage as (usage text, usage_prese text, usage_lang char(3), complexity varchar(100), usage_type_code varchar(100), usage_translations text array, usage_definitions text array, usage_authors text array);
create type type_public_note as (value text, complexity varchar(100));
create type type_grammar as (value text, complexity varchar(100));
create type type_government as (value text, complexity varchar(100));
create type type_colloc_member as (lexeme_id bigint, word_id bigint, word text, form text, homonym_nr integer, word_exists boolean, conjunct varchar(100), weight numeric(14,4));
create type type_word_etym_relation as (word_etym_rel_id bigint, comment text, is_questionable boolean, is_compound boolean, related_word_id bigint);
create type type_word_relation as (word_id bigint, word text, word_lang char(3), homonym_nr integer, lex_complexities varchar(100) array, word_type_codes varchar(100) array, word_rel_type_code varchar(100));
create type type_lexeme_relation as (lexeme_id bigint, word_id bigint, word text, word_lang char(3), homonym_nr integer, complexity varchar(100), lex_rel_type_code varchar(100));
create type type_meaning_relation as (meaning_id bigint, lexeme_id bigint, word_id bigint, word text, word_lang char(3), homonym_nr integer, complexity varchar(100), meaning_rel_type_code varchar(100));

-- words - OK
create view view_ww_word 
as
select w.word_id,
       w.word,
       w.word_class,
       w.lang,
       w.homonym_nr,
       wt.word_type_codes,
       w.morph_code,
       w.display_morph_code,
       w.aspect_code,
       lc.lang_complexities,
       mc.meaning_count,
       mw.meaning_words,
       wd.definitions
from (select w.id as word_id,
             array_to_string(array_agg(distinct f.value),',','*') as word,
             w.word_class,
             w.lang,
             w.homonym_nr,
             w.morph_code,
             w.display_morph_code,
             w.aspect_code
      from word as w
        join paradigm as p on p.word_id = w.id
        join form as f on f.paradigm_id = p.id and f.mode = 'WORD'
      where exists (select l.id
                    from lexeme as l
                    where (l.word_id = w.id and l.dataset_code = 'sss'))
      group by w.id) as w
  inner join (select mc.word_id,
                     count(mc.meaning_id) meaning_count
              from (select l.word_id,
                           l.meaning_id
                    from lexeme l
                    where l.dataset_code = 'sss'
                    group by l.word_id,
                             l.meaning_id) mc
              group by mc.word_id) mc on mc.word_id = w.word_id
  left outer join (select wt.word_id,
                          array_agg(wt.word_type_code order by wt.order_by) word_type_codes
                   from word_word_type wt
                   group by wt.word_id) wt on wt.word_id = w.word_id
  left outer join (select mw.word_id,
                          array_agg(row (mw.hw_lex_id,mw.hw_meaning_id,mw.mw_value,mw.mw_lang,mw.mw_lex_complexity,mw.mw_word_type_codes)::type_word order by mw.hw_lex_level1,mw.hw_lex_level2,mw.hw_lex_level3,mw.hw_lex_order_by,mw.mw_lex_order_by) meaning_words
                   from (select l1.word_id,
                                l1.id hw_lex_id,
                                l1.meaning_id hw_meaning_id,
                                l1.level1 hw_lex_level1,
                                l1.level2 hw_lex_level2,
                                l1.level3 hw_lex_level3,
                                l1.order_by hw_lex_order_by,
                                f2.value mw_value,
                                w2.lang mw_lang,
                                l2.complexity mw_lex_complexity,
                                (select array_agg(wt.word_type_code order by wt.order_by)
                                 from word_word_type wt
                                 where wt.word_id = w2.id
                                 group by wt.word_id) mw_word_type_codes,
                                l2.order_by mw_lex_order_by
                         from lexeme l1
                           inner join lexeme l2 on l2.meaning_id = l1.meaning_id and l2.word_id != l1.word_id and l2.dataset_code = 'sss'
                           inner join word w2 on w2.id = l2.word_id
                           inner join paradigm p2 on p2.word_id = w2.id
                           inner join form f2 on f2.paradigm_id = p2.id and f2.mode = 'WORD'
                         where l1.dataset_code = 'sss') mw
                   group by mw.word_id) mw on mw.word_id = w.word_id
  left outer join (select lc.word_id,
                          array_agg(distinct row(lc.lang, lc.complexity)::type_lang_complexity) lang_complexities
                   from ((select l1.word_id,
                                 w2.lang,
                                 l2.complexity
                          from lexeme l1
                            inner join lexeme l2 on l2.meaning_id = l1.meaning_id and l2.dataset_code = l1.dataset_code and l2.word_id != l1.word_id
                            inner join word w2 on w2.id = l2.word_id
                          where l1.dataset_code = 'sss')
                          union all
                          (select l.word_id,
                                  ff.lang,
                                  ff.complexity
                          from lexeme l,
                               lexeme_freeform lff,
                               freeform ff
                          where l.dataset_code = 'sss'
                          and lff.lexeme_id = l.id
                          and lff.freeform_id = ff.id
                          and ff.type in ('USAGE', 'GRAMMAR', 'GOVERNMENT', 'PUBLIC_NOTE'))
                          union all
                          (select l.word_id,
                                  ut.lang,
                                  u.complexity
                          from lexeme l,
                               lexeme_freeform lff,
                               freeform u,
                               freeform ut
                          where l.dataset_code = 'sss'
                          and lff.lexeme_id = l.id
                          and lff.freeform_id = u.id
                          and u.type = 'USAGE'
                          and ut.parent_id = u.id
                          and ut.type = 'USAGE_TRANSLATION')
                          union all
                          (select l.word_id,
                                  d.lang,
                                  d.complexity
                          from lexeme l,
                               definition d
                          where l.dataset_code = 'sss'
                          and l.meaning_id = d.meaning_id)
                          union all
                          (select r.word1_id word_id,
                                  w2.lang,
                                  l2.complexity
                          from word_relation r,
                               lexeme l2,
                               word w2
                          where w2.id = r.word2_id
                          and l2.word_id = w2.id
                          and l2.dataset_code = 'sss')) lc
                   group by lc.word_id) lc on lc.word_id = w.word_id
  left outer join (select wd.word_id,
                          array_agg(row (wd.lexeme_id,wd.meaning_id,wd.value,wd.value_prese,wd.lang,wd.complexity)::type_definition order by wd.level1,wd.level2,wd.level3,wd.lex_order_by,wd.d_order_by) definitions
                   from (select l.word_id,
                                l.id lexeme_id,
                                l.meaning_id,
                                l.level1,
                                l.level2,
                                l.level3,
                                l.order_by lex_order_by,
                                d.value,
                                d.value_prese,
                                d.lang,
                                d.complexity,
                                d.order_by d_order_by
                         from lexeme l
                           inner join definition d on d.meaning_id = l.meaning_id
                         where l.dataset_code = 'sss') wd
                   group by wd.word_id) wd
               on wd.word_id = w.word_id;

-- as words - OK
create view view_ww_as_word 
as
select w.id word_id,
       f1.value word,
       f2.value as_word
from word w,
     paradigm p,
     form f1,
     form f2
where p.word_id = w.id
and   f1.paradigm_id = p.id
and   f2.paradigm_id = p.id
and   f1.mode = 'WORD'
and   f2.mode = 'AS_WORD'
and   exists (select l.id
              from lexeme as l
              where (l.word_id = w.id and l.dataset_code = 'sss'));

-- word forms - OK
create view view_ww_form 
as
select w.id word_id,
       fw.value word,
       w.lang,
       p.id paradigm_id,
       p.inflection_type,
       ff.id form_id,
       ff.mode,
       ff.morph_group1,
       ff.morph_group2,
       ff.morph_group3,
       ff.display_level,
       ff.morph_code,
       ff.morph_exists,
       ff.value form,
       ff.components,
       ff.display_form,
       ff.vocal_form,
       ff.audio_file,
       ff.order_by
from word w,
     paradigm p,
     form ff,
     form fw
where p.word_id = w.id
and   ff.paradigm_id = p.id
and   fw.paradigm_id = p.id
and   fw.mode = 'WORD'
and   ff.display_level > 0
and   exists (select l.id
              from lexeme as l
              where (l.word_id = w.id and l.dataset_code = 'sss'))
order by p.id,
         ff.order_by,
         ff.id;

-- lexeme meanings - OK
create view view_ww_meaning 
as
select m.id meaning_id,
       case
         when 'SIMPLE' = any (m.complexities) then 'SIMPLE'
         when 'DETAIL' = any (m.complexities) then 'DETAIL'
         else null
       end complexity,
       m_dom.domain_codes,
       m_img.image_files,
       m_spp.systematic_polysemy_patterns,
       m_smt.semantic_types,
       m_lcm.learner_comments,
       d.definitions
from (select m.id,
             (select array_agg(distinct l.complexity)
              from lexeme l
              where l.meaning_id = m.id
              group by l.meaning_id) as complexities
      from meaning m
      where exists (select l.id
                    from lexeme as l
                    where (l.meaning_id = m.id and l.dataset_code = 'sss'))) m
  left outer join (select m_dom.meaning_id,
                          array_agg(row (m_dom.domain_origin,m_dom.domain_code)::type_domain order by m_dom.order_by) domain_codes
                   from meaning_domain m_dom
                   group by m_dom.meaning_id) m_dom on m_dom.meaning_id = m.id
  left outer join (select d.meaning_id,
                          array_agg(row (null,d.meaning_id,d.value,d.value_prese,d.lang,d.complexity)::type_definition order by d.order_by) definitions
                   from definition d
                   where d.complexity in ('SIMPLE1', 'SIMPLE2', 'DETAIL1', 'DETAIL2')
                   group by d.meaning_id) d on d.meaning_id = m.id
  left outer join (select mf.meaning_id,
                          array_agg(ff.value_text order by ff.order_by) image_files
                   from meaning_freeform mf,
                        freeform ff
                   where mf.freeform_id = ff.id
                   and   ff.type = 'IMAGE_FILE'
                   group by mf.meaning_id) m_img on m_img.meaning_id = m.id
  left outer join (select mf.meaning_id,
                          array_agg(ff.value_text order by ff.order_by) systematic_polysemy_patterns
                   from meaning_freeform mf,
                        freeform ff
                   where mf.freeform_id = ff.id
                   and   ff.type = 'SYSTEMATIC_POLYSEMY_PATTERN'
                   group by mf.meaning_id) m_spp on m_spp.meaning_id = m.id
  left outer join (select mf.meaning_id,
                          array_agg(ff.value_text order by ff.order_by) semantic_types
                   from meaning_freeform mf,
                        freeform ff
                   where mf.freeform_id = ff.id
                   and   ff.type = 'SEMANTIC_TYPE'
                   group by mf.meaning_id) m_smt on m_smt.meaning_id = m.id
  left outer join (select mf.meaning_id,
                          array_agg(ff.value_prese order by ff.order_by) learner_comments
                   from meaning_freeform mf,
                        freeform ff
                   where mf.freeform_id = ff.id
                   and   ff.type = 'LEARNER_COMMENT'
                   group by mf.meaning_id) m_lcm on m_lcm.meaning_id = m.id
order by m.id;

-- lexeme details - OK
create view view_ww_lexeme 
as
select l.id lexeme_id,
       l.word_id,
       l.meaning_id,
       l.level1,
       l.level2,
       l.level3,
       l.complexity,
       l.order_by lex_order_by,
       l_reg.register_codes,
       l_pos.pos_codes,
       l_der.deriv_codes,
       anote.advice_notes,
       pnote.public_notes,
       gramm.grammars,
       gov.governments,
       usg.usages,
       lc.lang_complexities
from lexeme l
  left outer join (select l_reg.lexeme_id,
                          array_agg(l_reg.register_code order by l_reg.order_by) register_codes
                   from lexeme_register l_reg
                   group by l_reg.lexeme_id) l_reg on l_reg.lexeme_id = l.id
  left outer join (select l_pos.lexeme_id,
                          array_agg(l_pos.pos_code order by l_pos.order_by) pos_codes
                   from lexeme_pos l_pos
                   group by l_pos.lexeme_id) l_pos on l_pos.lexeme_id = l.id
  left outer join (select l_der.lexeme_id,
                          array_agg(l_der.deriv_code) deriv_codes
                   from lexeme_deriv l_der
                   group by l_der.lexeme_id) l_der on l_der.lexeme_id = l.id
  left outer join (select lf.lexeme_id,
                          array_agg(ff.value_text order by ff.order_by) advice_notes
                   from lexeme_freeform lf,
                        freeform ff
                   where lf.freeform_id = ff.id
                   and   ff.type = 'ADVICE_NOTE'
                   group by lf.lexeme_id) anote on anote.lexeme_id = l.id
  left outer join (select lf.lexeme_id,
                          array_agg(row (ff.value_prese,ff.complexity)::type_public_note order by ff.order_by) public_notes
                   from lexeme_freeform lf,
                        freeform ff
                   where lf.freeform_id = ff.id
                   and   ff.type = 'PUBLIC_NOTE'
                   group by lf.lexeme_id) pnote on pnote.lexeme_id = l.id
  left outer join (select lf.lexeme_id,
                          array_agg(row (ff.value_text,ff.complexity)::type_grammar order by ff.order_by) grammars
                   from lexeme_freeform lf,
                        freeform ff
                   where lf.freeform_id = ff.id
                   and   ff.type = 'GRAMMAR'
                   group by lf.lexeme_id) gramm on gramm.lexeme_id = l.id
  left outer join (select lf.lexeme_id,
                          array_agg(row (ff.value_text,ff.complexity)::type_government order by ff.order_by) governments
                   from lexeme_freeform lf,
                        freeform ff
                   where lf.freeform_id = ff.id
                   and   ff.type = 'GOVERNMENT'
                   group by lf.lexeme_id) gov on gov.lexeme_id = l.id
  left outer join (select u.lexeme_id,
                          array_agg(row (u.usage,u.usage_prese,u.usage_lang,u.complexity,u.usage_type_code,u.usage_translations,u.usage_definitions,u.usage_authors)::type_usage order by u.order_by) usages
                   from (select lf.lexeme_id,
                                u.value_text USAGE,
                                u.value_prese usage_prese,
                                u.lang usage_lang,
                                u.complexity,
                                u.order_by,
                                utp.classif_code usage_type_code,
                                ut.usage_translations,
                                ud.usage_definitions,
                                ua.usage_authors
                         from lexeme_freeform lf
                           inner join freeform u on lf.freeform_id = u.id and u.type = 'USAGE'
                           left outer join freeform utp on utp.parent_id = u.id and utp.type = 'USAGE_TYPE'
                           left outer join (select ut.parent_id usage_id,
                                                   array_agg(ut.value_prese order by ut.order_by) usage_translations
                                            from freeform ut
                                            where ut.type = 'USAGE_TRANSLATION'
                                            group by ut.parent_id) ut on ut.usage_id = u.id
                           left outer join (select ud.parent_id usage_id,
                                                   array_agg(ud.value_prese order by ud.order_by) usage_definitions
                                            from freeform ud
                                            where ud.type = 'USAGE_DEFINITION'
                                            group by ud.parent_id) ud on ud.usage_id = u.id
                           left outer join (select uasl.freeform_id usage_id,
                                                   array_agg((uasl.type || '|' || uas.person_name) order by uasl.order_by) usage_authors
                                            from freeform_source_link uasl
                                              inner join (select s.id,
                                                                 array_to_string(array_agg(ff.value_text),', ','*') person_name
                                                          from source s,
                                                               source_freeform sff,
                                                               freeform ff
                                                          where s.type = 'PERSON'
                                                          and   sff.source_id = s.id
                                                          and   sff.freeform_id = ff.id
                                                          and   ff.type = 'SOURCE_NAME'
                                                          group by s.id) uas on uas.id = uasl.source_id
                                            group by uasl.freeform_id) ua on ua.usage_id = u.id) u
                   group by u.lexeme_id) usg on usg.lexeme_id = l.id
  left outer join (select lc.id,
                          array_agg(distinct row (lc.lang,lc.complexity)::type_lang_complexity) lang_complexities
                   from ((select l1.id,
                                 w2.lang,
                                 l2.complexity
                          from lexeme l1
                            inner join lexeme l2 on l2.meaning_id = l1.meaning_id and l2.dataset_code = l1.dataset_code and l2.word_id != l1.word_id
                            inner join word w2 on w2.id = l2.word_id)
                          union all
                          (select l.id,
                                 ff.lang,
                                 ff.complexity
                          from lexeme l,
                               lexeme_freeform lff,
                               freeform ff
                          where lff.lexeme_id = l.id
                          and   lff.freeform_id = ff.id
                          and   ff.type in ('USAGE', 'GRAMMAR', 'GOVERNMENT', 'PUBLIC_NOTE'))
                          union all
                          (select l.id,
                                 ut.lang,
                                 u.complexity
                          from lexeme l,
                               lexeme_freeform lff,
                               freeform u,
                               freeform ut
                          where lff.lexeme_id = l.id
                          and   lff.freeform_id = u.id
                          and   u.type = 'USAGE'
                          and   ut.parent_id = u.id
                          and   ut.type = 'USAGE_TRANSLATION')
                          union all
                          (select l.id,
                                 d.lang,
                                 d.complexity
                          from lexeme l,
                               definition d
                          where l.meaning_id = d.meaning_id)
                          union all
                          (select l1.id,
                                 w2.lang,
                                 l2.complexity
                          from lex_relation r,
                               lexeme l1,
                               lexeme l2,
                               word w2
                          where r.lexeme1_id = l1.id
                          and   r.lexeme2_id = l2.id
                          and   l2.dataset_code = l1.dataset_code
                          and   w2.id = l2.word_id)
                          union all
                          (select l1.id,
                                 w1.lang,
                                 l1.complexity
                          from lexeme l1,
                               word w1
                          where w1.id = l1.word_id
                          and   not exists (select l2.id
                                            from lexeme l2
                                            where l2.meaning_id = l1.meaning_id
                                            and   l2.dataset_code = l1.dataset_code
                                            and   l2.id != l1.id)
                          and   not exists (select d.id
                                            from definition d
                                            where d.meaning_id = l1.meaning_id)
                          and   not exists (select ff.id
                                            from lexeme_freeform lff,
                                                 freeform ff
                                            where lff.lexeme_id = l1.id
                                            and   lff.freeform_id = ff.id
                                            and   ff.type in ('USAGE', 'GRAMMAR', 'GOVERNMENT', 'PUBLIC_NOTE')))) lc
                   group by lc.id) lc
               on lc.id = l.id
where l.dataset_code = 'sss'
order by l.id;

-- collocations - ?
create view view_ww_collocation 
as
select l1.id as lexeme_id,
       l1.word_id,
       pgr1.id as pos_group_id,
       pgr1.pos_group_code,
       pgr1.order_by as pos_group_order_by,
       rgr1.id as rel_group_id,
       rgr1.name as rel_group_name,
       rgr1.order_by as rel_group_order_by,
       lc1.group_order as colloc_group_order,
       c.id as colloc_id,
       c.value as colloc_value,
       c.definition as colloc_definition,
       c.usages as colloc_usages,
       array_agg(row (lw2.lexeme_id,lw2.word_id,lw2.word,lc2.member_form,lw2.homonym_nr,lw2.word_exists,lc2.conjunct,lc2.weight)::type_colloc_member order by lc2.member_order) as colloc_members,
       c.complexity
from collocation as c
  inner join lex_colloc as lc1 on lc1.collocation_id = c.id
  inner join lex_colloc as lc2 on lc2.collocation_id = c.id
  inner join lexeme as l1 on l1.id = lc1.lexeme_id
  inner join (select distinct l2.id lexeme_id,
                     l2.word_id,
                     f2.value word,
                     w2.homonym_nr,
                     (f2.mode = 'WORD') word_exists
              from lexeme as l2,
                   word as w2,
                   paradigm as p2,
                   form as f2
              where l2.word_id = w2.id
              and   p2.word_id = w2.id
              and   f2.paradigm_id = p2.id
              and   f2.mode in ('WORD', 'UNKNOWN')) lw2 on lw2.lexeme_id = lc2.lexeme_id
  inner join lex_colloc_rel_group as rgr1 on lc1.rel_group_id = rgr1.id
  inner join lex_colloc_pos_group as pgr1 on pgr1.id = rgr1.pos_group_id
where l1.dataset_code = 'sss'
group by l1.id,
         c.id,
         pgr1.id,
         rgr1.id,
         lc1.id
order by l1.level1,
         l1.level2,
         l1.level3,
         pgr1.order_by,
         rgr1.order_by,
         lc1.group_order,
         c.id;

-- etymology - OK
create view view_ww_word_etymology
as
with recursive word_etym_recursion (word_id, word_etym_word_id, word_etym_id, word_etym_rel_id, related_word_id) as
(
  (select we.word_id,
          we.word_id word_etym_word_id,
          we.id word_etym_id,
          wer.id word_etym_rel_id,
          wer.related_word_id
   from word_etymology we
     left outer join word_etymology_relation wer on wer.word_etym_id = we.id
   order by we.order_by,
            wer.order_by)
   union all
   (select rec.word_id,
           we.word_id word_etym_word_id,
           we.id word_etym_id,
           wer.id word_etym_rel_id,
           wer.related_word_id
    from word_etym_recursion rec
      inner join word_etymology we on we.word_id = rec.related_word_id
      left outer join word_etymology_relation wer on wer.word_etym_id = we.id
    order by we.order_by,
             wer.order_by)
)
select rec.word_id,
       rec.word_etym_id,
       rec.word_etym_word_id,
       f2.value word,
       w2.lang word_lang,
       mw2.meaning_words,
       we.etymology_type_code,
       we.etymology_year,
       we.comment_prese word_etym_comment,
       we.is_questionable word_etym_is_questionable,
       we.order_by word_etym_order_by,
       wesl.word_etym_sources,
       array_agg(row(wer.id,wer.comment_prese,wer.is_questionable,wer.is_compound,wer.related_word_id)::type_word_etym_relation order by wer.order_by) word_etym_relations
from word_etym_recursion rec
  inner join word_etymology we on we.id = rec.word_etym_id
  left outer join word_etymology_relation wer on wer.id = rec.word_etym_rel_id
  left outer join word w2 on w2.id = rec.word_etym_word_id
  left outer join paradigm p2 on p2.word_id = w2.id
  left outer join form f2 on f2.paradigm_id = p2.id and f2.mode = 'WORD'
  left outer join (select l1.word_id,
                          array_agg(distinct f2.value) meaning_words
                   from lexeme l1,
                        meaning m,
                        lexeme l2,
                        word w2,
                        paradigm p2,
                        form f2
                   where l1.meaning_id = m.id
                   and   l2.meaning_id = m.id
                   and   l1.word_id != l2.word_id
                   and   l2.dataset_code = 'ety'
                   and   l2.word_id = w2.id
                   and   p2.word_id = w2.id
                   and   w2.lang = 'est'
                   and   f2.paradigm_id = p2.id
                   and   f2.mode = 'WORD'
                   group by l1.word_id) mw2 on mw2.word_id = rec.word_etym_word_id
  left outer join (select wesl.word_etym_id,
                          array_agg(wesl.value order by wesl.order_by) word_etym_sources
                   from word_etymology_source_link wesl
                   group by wesl.word_etym_id) wesl on wesl.word_etym_id = rec.word_etym_id
group by rec.word_id,
         rec.word_etym_id,
         rec.word_etym_word_id,
         mw2.meaning_words,
         wesl.word_etym_sources,
         we.id,
         w2.id,
         p2.id,
         f2.id
order by rec.word_id,
         we.order_by;

-- word relations - OK
create view view_ww_word_relation 
as
select w.id word_id,
       wr.related_words,
       wg.word_group_id,
       wg.word_rel_type_code,
       wg.word_group_members
from word w
  left outer join (select w1.id word_id,
                          array_agg(row (wr.related_word_id,wr.related_word,wr.related_word_lang,wr.related_word_homonym_nr,wr.lex_complexities,wr.word_type_codes,wr.word_rel_type_code)::type_word_relation order by wr.word_rel_order_by) related_words
                   from word w1
                     inner join (select distinct r.word1_id,
                                        r.word2_id related_word_id,
                                        r.word_rel_type_code,
                                        r.order_by word_rel_order_by,
                                        w2.word related_word,
                                        w2.lang related_word_lang,
                                        w2.homonym_nr related_word_homonym_nr,
                                        (select array_agg(distinct lc.complexity)
                                         from lexeme lc
                                         where lc.word_id = w2.id
                                         and lc.dataset_code = 'sss'
                                         group by lc.word_id) as lex_complexities,
                                        (select array_agg(wt.word_type_code order by wt.order_by)
                                         from word_word_type wt
                                         where wt.word_id = w2.id
                                         group by wt.word_id) word_type_codes
                                 from word_relation r,
                                      (select w.id,
                                              (array_agg(distinct f.value)) [1] as word,
                                              w.lang,
                                              w.homonym_nr
                                       from word as w
                                         join paradigm as p on p.word_id = w.id
                                         join form as f on f.paradigm_id = p.id and f.mode = 'WORD'
                                       where exists (select l.id
                                                     from lexeme as l
                                                     where (l.word_id = w.id and l.dataset_code = 'sss'))
                                       group by w.id) as w2
                                 where r.word2_id = w2.id) wr on wr.word1_id = w1.id
                   group by w1.id) wr on wr.word_id = w.id
  left outer join (select wg.word_id,
                          wg.word_group_id,
                          wg.word_rel_type_code,
                          array_agg(row (wg.group_member_word_id,wg.group_member_word,wg.group_member_word_lang,wg.group_member_homonym_nr,wg.lex_complexities,wg.word_type_codes,wg.word_rel_type_code)::type_word_relation order by wg.group_member_order_by) word_group_members
                   from (select distinct w1.id word_id,
                                wg.id word_group_id,
                                wg.word_rel_type_code,
                                w2.id group_member_word_id,
                                w2.word group_member_word,
                                w2.lang group_member_word_lang,
                                w2.homonym_nr group_member_homonym_nr,
                                (select array_agg(distinct lc.complexity)
                                 from lexeme lc
                                 where lc.word_id = w2.id
                                 and lc.dataset_code = 'sss'
                                 group by lc.word_id) as lex_complexities,
                                (select array_agg(wt.word_type_code order by wt.order_by)
                                 from word_word_type wt
                                 where wt.word_id = w2.id
                                 group by wt.word_id) word_type_codes,
                                wgm2.order_by group_member_order_by
                         from word w1,
                              (select w.id,
                                      (array_agg(distinct f.value)) [1] as word,
                                      w.lang,
                                      w.homonym_nr
                               from word as w
                                 join paradigm as p on p.word_id = w.id
                                 join form as f on f.paradigm_id = p.id and f.mode = 'WORD'
                               where exists (select l.id
                                             from lexeme as l
                                             where (l.word_id = w.id and l.dataset_code = 'sss'))
                               group by w.id) as w2,
                              word_group wg,
                              word_group_member wgm1,
                              word_group_member wgm2
                         where wgm1.word_group_id = wg.id
                         and   wgm2.word_group_id = wg.id
                         and   wgm1.word_id = w1.id
                         and   wgm2.word_id = w2.id
                         and   w1.id != w2.id) wg
                   group by wg.word_id,
                            wg.word_group_id,
                            wg.word_rel_type_code) wg on wg.word_id = w.id
where (wr.related_words is not null or wg.word_group_members is not null)
and   exists (select l.id
              from lexeme l
              where l.word_id = w.id
              and   l.dataset_code = 'sss');


-- lexeme relations - OK
create view view_ww_lexeme_relation 
as
select r.lexeme1_id lexeme_id,
       array_agg(row (l2.related_lexeme_id,l2.related_word_id,l2.related_word,l2.related_word_lang,l2.related_word_homonym_nr,l2.complexity,r.lex_rel_type_code)::type_lexeme_relation order by r.order_by) related_lexemes
from lex_relation r
  inner join (select l2.id related_lexeme_id,
                     w2.id related_word_id,
                     w2.lang related_word_lang,
                     w2.homonym_nr related_word_homonym_nr,
                     f2.value related_word,
                     l2.complexity
              from lexeme l2,
                   word w2,
                   paradigm p2,
                   form f2
              where f2.mode = 'WORD'
              and   f2.paradigm_id = p2.id
              and   p2.word_id = w2.id
              and   l2.word_id = w2.id
              group by l2.id,
                       w2.id,
                       f2.value) l2 on l2.related_lexeme_id = r.lexeme2_id
where exists (select l.id
              from lexeme l
              where l.id = r.lexeme1_id
              and   l.dataset_code = 'sss')
group by r.lexeme1_id;


-- meaning relations - OK
create view view_ww_meaning_relation 
as
select m1.id meaning_id,
       array_agg(row (m2.meaning_id,m2.lexeme_id,m2.word_id,m2.word,m2.word_lang,m2.homonym_nr,m2.complexity,r.meaning_rel_type_code)::type_meaning_relation order by r.order_by) related_meanings
from meaning m1,
     meaning_relation r,
     (select distinct l2.meaning_id,
             l2.id lexeme_id,
             l2.word_id,
             f2.value word,
             w2.lang word_lang,
             w2.homonym_nr,
             l2.complexity
      from lexeme l2,
           word w2,
           paradigm p2,
           form f2
      where f2.mode = 'WORD'
      and   f2.paradigm_id = p2.id
      and   p2.word_id = w2.id
      and   l2.word_id = w2.id
      and   l2.dataset_code = 'sss') m2
where r.meaning1_id = m1.id
and   r.meaning2_id = m2.meaning_id
and   exists (select l.id
              from lexeme as l
              where (l.meaning_id = m1.id and l.dataset_code = 'sss'))
group by m1.id;


-- lexical decision game data - OK
create view view_ww_lexical_decision_data 
as
select w.word,
       w.lang,
       w.is_word
from ((select w.word,
              w.lang,
              true is_word
       from (select distinct f.value word,
                    w.lang
             from word w,
                  paradigm p,
                  form f
             where p.word_id = w.id
             and   f.paradigm_id = p.id
             and   f.mode = 'WORD'
             and   exists (select l.id
                           from lexeme as l
                           where (l.word_id = w.id and l.complexity = 'SIMPLE'))
             and   f.value not like '% %'
             and   length(f.value) > 2) w
       order by random()) 
       union all
       (select nw.word,
              nw.lang,
              false is_word
       from game_nonword nw
       order by random())) w
order by random();

-- similarity judgement game data - NOT!
create view view_ww_similarity_judgement_data
as
select
  w.meaning_id,
  w.word,
  w.lang,
  w.dataset_code
from
((select 
       w.meaning_id,
       w.word,
       w.lang,
       'qq2' dataset_code
from (select distinct l.meaning_id,
             f.value word,
             w.lang
      from word w,
           paradigm p,
           form f,
           lexeme l
      where p.word_id = w.id
      and   f.paradigm_id = p.id
      and   f.mode = 'WORD'
      and   f.value not like '% %'
      and   length(f.value) > 2
      and   l.word_id = w.id
      and   l.dataset_code = 'qq2') w
order by random())
union all 
(select 
       w.meaning_id,
       w.word,
       w.lang,
       'ev2' dataset_code
from (select distinct l.meaning_id,
             f.value word,
             w.lang
      from word w,
           paradigm p,
           form f,
           lexeme l
      where p.word_id = w.id
      and   f.paradigm_id = p.id
      and   f.mode = 'WORD'
      and   f.value not like '% %'
      and   length(f.value) > 2
      and   l.word_id = w.id
      and   l.dataset_code = 'ev2') w
where not exists (select w2.id
                  from word w2,
                       paradigm p2,
                       form f2,
                       lexeme l2
                  where p2.word_id = w2.id
                  and   f2.paradigm_id = p2.id
                  and   f2.mode = 'WORD'
                  and   l2.word_id = w2.id
                  and   l2.dataset_code = 'qq2'
                  and   w.word = f2.value)
order by random())
union all
(select 
       w.meaning_id,
       w.word,
       w.lang,
       'psv' dataset_code
from (select distinct l.meaning_id,
             f.value word,
             w.lang
      from word w,
           paradigm p,
           form f,
           lexeme l
      where p.word_id = w.id
      and   f.paradigm_id = p.id
      and   f.mode = 'WORD'
      and   f.value not like '% %'
      and   length(f.value) > 2
      and   l.word_id = w.id
      and   l.dataset_code = 'psv') w
order by random())) w;

-- datasets, classifiers
create view view_ww_dataset
  as
    (select
       code,
       name,
       description,
       'est'::char(3) as lang,
       order_by
     from dataset
     where code = 'sss'
     order by order_by
    );

create view view_ww_classifier
  as
	((select
		'LANGUAGE' as name,
		null as origin,
		c.code,
		cl.value,
		cl.lang,
		c.order_by
	from 
		language c,
		language_label cl
	where 
		c.code = cl.code
		and cl.type = 'wordweb'
	order by c.order_by)
	union all 
	(select
		'MORPH' as name,
		null as origin,
		c.code,
		cl.value,
		cl.lang,
		c.order_by
	from 
		morph c,
		morph_label cl
	where 
		c.code = cl.code
		and cl.type = 'wordweb'
	order by c.order_by)
	union all
	(select
		'DISPLAY_MORPH' as name,
		null as origin,
		c.code,
		cl.value,
		cl.lang,
		c.order_by
	from 
		display_morph c,
		display_morph_label cl
	where 
		c.code = cl.code
		and cl.type = 'wordweb'
	order by c.order_by)
	union all
	(select
		'WORD_TYPE' as name,
		null as origin,
		c.code,
		cl.value,
		cl.lang,
		c.order_by
	from 
		word_type c,
		word_type_label cl
	where 
		c.code = cl.code
		and cl.type = 'wordweb'
	order by c.order_by)
	union all
	(select
		'ASPECT' as name,
		null as origin,
		c.code,
		cl.value,
		cl.lang,
		c.order_by
	from 
		aspect c,
		aspect_label cl
	where 
		c.code = cl.code
		and cl.type = 'wordweb'
	order by c.order_by)
	union all
	(select
		'POS' as name,
		null as origin,
		c.code,
		cl.value,
		cl.lang,
		c.order_by
	from 
		pos c,
		pos_label cl
	where 
		c.code = cl.code
		and cl.type = 'wordweb'
	order by c.order_by)
	union all
	(select
		'REGISTER' as name,
		null as origin,
		c.code,
		cl.value,
		cl.lang,
		c.order_by
	from 
		register c,
		register_label cl
	where 
		c.code = cl.code
		and cl.type = 'wordweb'
	order by c.order_by)
	union all
	(select
		'DERIV' as name,
		null as origin,
		c.code,
		cl.value,
		cl.lang,
		c.order_by
	from 
		deriv c,
		deriv_label cl
	where 
		c.code = cl.code
		and cl.type = 'wordweb'
	order by c.order_by)
	union all
	(select
		'DOMAIN' as name,
		c.origin,
		c.code,
		cl.value,
		cl.lang,
		c.order_by
	from 
		domain c,
		domain_label cl
	where 
		c.code = cl.code
		and c.origin = cl.origin
		and cl.type = 'descrip'
	order by c.order_by)
	union all
	(select
		'USAGE_TYPE' as name,
		null as origin,
		c.code,
		cl.value,
		cl.lang,
		c.order_by
	from 
		usage_type c,
		usage_type_label cl
	where 
		c.code = cl.code
		and cl.type = 'wordweb'
	order by c.order_by)
	union all
	(select
		'POS_GROUP' as name,
		null as origin,
		c.code,
		cl.value,
		cl.lang,
		c.order_by
	from 
		pos_group c,
		pos_group_label cl
	where 
		c.code = cl.code
		and cl.type = 'wordweb'
	order by c.order_by)
	union all
	(select
		'WORD_REL_TYPE' as name,
		null as origin,
		c.code,
		cl.value,
		cl.lang,
		c.order_by
	from 
		word_rel_type c,
		word_rel_type_label cl
	where 
		c.code = cl.code
		and cl.type = 'wordweb'
	order by c.order_by)
	union all
	(select
		'LEX_REL_TYPE' as name,
		null as origin,
		c.code,
		cl.value,
		cl.lang,
		c.order_by
	from 
		lex_rel_type c,
		lex_rel_type_label cl
	where 
		c.code = cl.code
		and cl.type = 'wordweb'
	order by c.order_by)
	union all
	(select
		'MEANING_REL_TYPE' as name,
		null as origin,
		c.code,
		cl.value,
		cl.lang,
		c.order_by
	from 
		meaning_rel_type c,
		meaning_rel_type_label cl
	where 
		c.code = cl.code
		and cl.type = 'wordweb'
	order by c.order_by)
);

