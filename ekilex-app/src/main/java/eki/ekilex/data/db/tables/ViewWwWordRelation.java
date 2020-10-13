/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables;


import eki.ekilex.data.db.Public;
import eki.ekilex.data.db.tables.records.ViewWwWordRelationRecord;
import eki.ekilex.data.db.udt.records.TypeWordRelationRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewWwWordRelation extends TableImpl<ViewWwWordRelationRecord> {

    private static final long serialVersionUID = -301473089;

    /**
     * The reference instance of <code>public.view_ww_word_relation</code>
     */
    public static final ViewWwWordRelation VIEW_WW_WORD_RELATION = new ViewWwWordRelation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewWwWordRelationRecord> getRecordType() {
        return ViewWwWordRelationRecord.class;
    }

    /**
     * The column <code>public.view_ww_word_relation.word_id</code>.
     */
    public final TableField<ViewWwWordRelationRecord, Long> WORD_ID = createField(DSL.name("word_id"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.view_ww_word_relation.related_words</code>.
     */
    public final TableField<ViewWwWordRelationRecord, TypeWordRelationRecord[]> RELATED_WORDS = createField(DSL.name("related_words"), eki.ekilex.data.db.udt.TypeWordRelation.TYPE_WORD_RELATION.getDataType().getArrayDataType(), this, "");

    /**
     * The column <code>public.view_ww_word_relation.word_group_members</code>.
     */
    public final TableField<ViewWwWordRelationRecord, TypeWordRelationRecord[]> WORD_GROUP_MEMBERS = createField(DSL.name("word_group_members"), eki.ekilex.data.db.udt.TypeWordRelation.TYPE_WORD_RELATION.getDataType().getArrayDataType(), this, "");

    /**
     * Create a <code>public.view_ww_word_relation</code> table reference
     */
    public ViewWwWordRelation() {
        this(DSL.name("view_ww_word_relation"), null);
    }

    /**
     * Create an aliased <code>public.view_ww_word_relation</code> table reference
     */
    public ViewWwWordRelation(String alias) {
        this(DSL.name(alias), VIEW_WW_WORD_RELATION);
    }

    /**
     * Create an aliased <code>public.view_ww_word_relation</code> table reference
     */
    public ViewWwWordRelation(Name alias) {
        this(alias, VIEW_WW_WORD_RELATION);
    }

    private ViewWwWordRelation(Name alias, Table<ViewWwWordRelationRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewWwWordRelation(Name alias, Table<ViewWwWordRelationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("create view \"view_ww_word_relation\" as  SELECT w.id AS word_id,\n    wr.related_words,\n    wg.word_group_members\n   FROM ((word w\n     LEFT JOIN ( SELECT w1.id AS word_id,\n            array_agg(ROW(NULL::bigint, wr_1.word_rel_type_code, (wr_1.relation_status)::character varying(100), wr_1.word_rel_order_by, wr_1.related_word_id, (' '::text || wr_1.related_word), (' '::text || wr_1.related_word_prese), wr_1.related_word_homonym_nr, wr_1.related_word_homonyms_exist, wr_1.related_word_lang, wr_1.related_word_aspect_code, (wr_1.word_type_codes)::character varying(100)[], (wr_1.lex_complexities)::character varying(100)[])::type_word_relation ORDER BY wr_1.word_rel_order_by) AS related_words\n           FROM (word w1\n             JOIN ( SELECT DISTINCT r.word1_id,\n                    r.word2_id AS related_word_id,\n                    r.word_rel_type_code,\n                    COALESCE(r.relation_status, 'UNDEFINED'::character varying) AS relation_status,\n                    r.order_by AS word_rel_order_by,\n                    w2.word AS related_word,\n                    w2.word_prese AS related_word_prese,\n                    w2.homonym_nr AS related_word_homonym_nr,\n                    ( SELECT (max(wh.homonym_nr) > 1)\n                           FROM word wh,\n                            paradigm ph,\n                            form fh\n                          WHERE ((wh.lang = w2.lang) AND (ph.word_id = wh.id) AND (fh.paradigm_id = ph.id) AND ((fh.mode)::text = 'WORD'::text) AND (fh.value = w2.word) AND (EXISTS ( SELECT l.id\n                                   FROM lexeme l,\n                                    dataset ds\n                                  WHERE (((l.type)::text = 'PRIMARY'::text) AND (l.is_public = true) AND ((ds.code)::text = (l.dataset_code)::text) AND (ds.is_public = true) AND (l.word_id = wh.id)))))) AS related_word_homonyms_exist,\n                    w2.lang AS related_word_lang,\n                    w2.aspect_code AS related_word_aspect_code,\n                    w2.word_type_codes,\n                    ( SELECT array_agg(DISTINCT lc.complexity) AS array_agg\n                           FROM lexeme lc,\n                            dataset ds\n                          WHERE ((lc.word_id = w2.id) AND ((lc.type)::text = 'PRIMARY'::text) AND (lc.is_public = true) AND ((ds.code)::text = (lc.dataset_code)::text) AND (ds.is_public = true))\n                          GROUP BY lc.word_id) AS lex_complexities\n                   FROM word_relation r,\n                    ( SELECT w_1.id,\n                            (array_agg(DISTINCT f.value))[1] AS word,\n                            (array_agg(DISTINCT f.value_prese))[1] AS word_prese,\n                            w_1.homonym_nr,\n                            w_1.lang,\n                            w_1.aspect_code,\n                            array_agg(wt.word_type_code ORDER BY wt.order_by) AS word_type_codes\n                           FROM (((word w_1\n                             JOIN paradigm p ON ((p.word_id = w_1.id)))\n                             JOIN form f ON (((f.paradigm_id = p.id) AND ((f.mode)::text = 'WORD'::text))))\n                             LEFT JOIN word_word_type wt ON ((wt.word_id = w_1.id)))\n                          WHERE (EXISTS ( SELECT l.id\n                                   FROM lexeme l,\n                                    dataset ds\n                                  WHERE (((l.type)::text = 'PRIMARY'::text) AND (l.is_public = true) AND ((ds.code)::text = (l.dataset_code)::text) AND (ds.is_public = true) AND (l.word_id = w_1.id))))\n                          GROUP BY w_1.id) w2\n                  WHERE (r.word2_id = w2.id)) wr_1 ON ((wr_1.word1_id = w1.id)))\n          GROUP BY w1.id) wr ON ((wr.word_id = w.id)))\n     LEFT JOIN ( SELECT wg_1.word_id,\n            array_agg(ROW(wg_1.word_group_id, wg_1.word_rel_type_code, NULL::character varying(100), wg_1.group_member_order_by, wg_1.group_member_word_id, (' '::text || wg_1.group_member_word), (' '::text || wg_1.group_member_word_prese), wg_1.group_member_homonym_nr, wg_1.group_member_homonyms_exist, wg_1.group_member_word_lang, wg_1.group_member_aspect_code, (wg_1.word_type_codes)::character varying(100)[], (wg_1.lex_complexities)::character varying(100)[])::type_word_relation ORDER BY wg_1.word_group_id, wg_1.group_member_order_by) AS word_group_members\n           FROM ( SELECT DISTINCT w1.id AS word_id,\n                    wg_2.id AS word_group_id,\n                    wg_2.word_rel_type_code,\n                    w2.id AS group_member_word_id,\n                    w2.word AS group_member_word,\n                    w2.word_prese AS group_member_word_prese,\n                    w2.homonym_nr AS group_member_homonym_nr,\n                    ( SELECT (max(wh.homonym_nr) > 1)\n                           FROM word wh,\n                            paradigm ph,\n                            form fh\n                          WHERE ((wh.lang = w2.lang) AND (ph.word_id = wh.id) AND (fh.paradigm_id = ph.id) AND ((fh.mode)::text = 'WORD'::text) AND (fh.value = w2.word) AND (EXISTS ( SELECT l.id\n                                   FROM lexeme l,\n                                    dataset ds\n                                  WHERE (((l.type)::text = 'PRIMARY'::text) AND (l.is_public = true) AND ((ds.code)::text = (l.dataset_code)::text) AND (ds.is_public = true) AND (l.word_id = wh.id)))))) AS group_member_homonyms_exist,\n                    w2.lang AS group_member_word_lang,\n                    w2.aspect_code AS group_member_aspect_code,\n                    w2.word_type_codes,\n                    ( SELECT array_agg(DISTINCT lc.complexity) AS array_agg\n                           FROM lexeme lc,\n                            dataset ds\n                          WHERE ((lc.word_id = w2.id) AND ((lc.type)::text = 'PRIMARY'::text) AND (lc.is_public = true) AND ((ds.code)::text = (lc.dataset_code)::text) AND (ds.is_public = true))\n                          GROUP BY lc.word_id) AS lex_complexities,\n                    wgm2.order_by AS group_member_order_by\n                   FROM word w1,\n                    ( SELECT w_1.id,\n                            (array_agg(DISTINCT f.value))[1] AS word,\n                            (array_agg(DISTINCT f.value_prese))[1] AS word_prese,\n                            w_1.homonym_nr,\n                            w_1.lang,\n                            w_1.aspect_code,\n                            array_agg(wt.word_type_code ORDER BY wt.order_by) AS word_type_codes\n                           FROM (((word w_1\n                             JOIN paradigm p ON ((p.word_id = w_1.id)))\n                             JOIN form f ON (((f.paradigm_id = p.id) AND ((f.mode)::text = 'WORD'::text))))\n                             LEFT JOIN word_word_type wt ON ((wt.word_id = w_1.id)))\n                          WHERE (EXISTS ( SELECT l.id\n                                   FROM lexeme l,\n                                    dataset ds\n                                  WHERE ((l.word_id = w_1.id) AND ((l.type)::text = 'PRIMARY'::text) AND (l.is_public = true) AND ((ds.code)::text = (l.dataset_code)::text) AND (ds.is_public = true))))\n                          GROUP BY w_1.id) w2,\n                    word_group wg_2,\n                    word_group_member wgm1,\n                    word_group_member wgm2\n                  WHERE ((wgm1.word_group_id = wg_2.id) AND (wgm2.word_group_id = wg_2.id) AND (wgm1.word_id = w1.id) AND (wgm2.word_id = w2.id) AND (w1.id <> w2.id))) wg_1\n          GROUP BY wg_1.word_id) wg ON ((wg.word_id = w.id)))\n  WHERE (((wr.related_words IS NOT NULL) OR (wg.word_group_members IS NOT NULL)) AND (EXISTS ( SELECT l.id\n           FROM lexeme l,\n            dataset ds\n          WHERE ((l.word_id = w.id) AND ((l.type)::text = 'PRIMARY'::text) AND (l.is_public = true) AND ((ds.code)::text = (l.dataset_code)::text) AND (ds.is_public = true)))));"));
    }

    public <O extends Record> ViewWwWordRelation(Table<O> child, ForeignKey<O, ViewWwWordRelationRecord> key) {
        super(child, key, VIEW_WW_WORD_RELATION);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public ViewWwWordRelation as(String alias) {
        return new ViewWwWordRelation(DSL.name(alias), this);
    }

    @Override
    public ViewWwWordRelation as(Name alias) {
        return new ViewWwWordRelation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewWwWordRelation rename(String name) {
        return new ViewWwWordRelation(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewWwWordRelation rename(Name name) {
        return new ViewWwWordRelation(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, TypeWordRelationRecord[], TypeWordRelationRecord[]> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
