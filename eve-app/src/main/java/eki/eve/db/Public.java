/*
 * This file is generated by jOOQ.
*/
package eki.eve.db;


import eki.eve.db.tables.Dataset;
import eki.eve.db.tables.Definition;
import eki.eve.db.tables.Deriv;
import eki.eve.db.tables.DerivLabel;
import eki.eve.db.tables.Domain;
import eki.eve.db.tables.DomainLabel;
import eki.eve.db.tables.EkiUser;
import eki.eve.db.tables.Form;
import eki.eve.db.tables.Gender;
import eki.eve.db.tables.GenderLabel;
import eki.eve.db.tables.Grammar;
import eki.eve.db.tables.LabelType;
import eki.eve.db.tables.Lang;
import eki.eve.db.tables.LangLabel;
import eki.eve.db.tables.LexRelType;
import eki.eve.db.tables.LexRelTypeLabel;
import eki.eve.db.tables.LexRelation;
import eki.eve.db.tables.Lexeme;
import eki.eve.db.tables.LexemeDeriv;
import eki.eve.db.tables.LexemeDomain;
import eki.eve.db.tables.LexemePos;
import eki.eve.db.tables.LexemeRegister;
import eki.eve.db.tables.Meaning;
import eki.eve.db.tables.Morph;
import eki.eve.db.tables.MorphLabel;
import eki.eve.db.tables.Paradigm;
import eki.eve.db.tables.Pos;
import eki.eve.db.tables.PosLabel;
import eki.eve.db.tables.Rection;
import eki.eve.db.tables.Register;
import eki.eve.db.tables.RegisterLabel;
import eki.eve.db.tables.Usage;
import eki.eve.db.tables.Word;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Sequence;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Public extends SchemaImpl {

    private static final long serialVersionUID = 2058223184;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public.dataset</code>.
     */
    public final Dataset DATASET = eki.eve.db.tables.Dataset.DATASET;

    /**
     * The table <code>public.definition</code>.
     */
    public final Definition DEFINITION = eki.eve.db.tables.Definition.DEFINITION;

    /**
     * The table <code>public.deriv</code>.
     */
    public final Deriv DERIV = eki.eve.db.tables.Deriv.DERIV;

    /**
     * The table <code>public.deriv_label</code>.
     */
    public final DerivLabel DERIV_LABEL = eki.eve.db.tables.DerivLabel.DERIV_LABEL;

    /**
     * The table <code>public.domain</code>.
     */
    public final Domain DOMAIN = eki.eve.db.tables.Domain.DOMAIN;

    /**
     * The table <code>public.domain_label</code>.
     */
    public final DomainLabel DOMAIN_LABEL = eki.eve.db.tables.DomainLabel.DOMAIN_LABEL;

    /**
     * The table <code>public.eki_user</code>.
     */
    public final EkiUser EKI_USER = eki.eve.db.tables.EkiUser.EKI_USER;

    /**
     * The table <code>public.form</code>.
     */
    public final Form FORM = eki.eve.db.tables.Form.FORM;

    /**
     * The table <code>public.gender</code>.
     */
    public final Gender GENDER = eki.eve.db.tables.Gender.GENDER;

    /**
     * The table <code>public.gender_label</code>.
     */
    public final GenderLabel GENDER_LABEL = eki.eve.db.tables.GenderLabel.GENDER_LABEL;

    /**
     * The table <code>public.grammar</code>.
     */
    public final Grammar GRAMMAR = eki.eve.db.tables.Grammar.GRAMMAR;

    /**
     * The table <code>public.label_type</code>.
     */
    public final LabelType LABEL_TYPE = eki.eve.db.tables.LabelType.LABEL_TYPE;

    /**
     * The table <code>public.lang</code>.
     */
    public final Lang LANG = eki.eve.db.tables.Lang.LANG;

    /**
     * The table <code>public.lang_label</code>.
     */
    public final LangLabel LANG_LABEL = eki.eve.db.tables.LangLabel.LANG_LABEL;

    /**
     * The table <code>public.lex_rel_type</code>.
     */
    public final LexRelType LEX_REL_TYPE = eki.eve.db.tables.LexRelType.LEX_REL_TYPE;

    /**
     * The table <code>public.lex_rel_type_label</code>.
     */
    public final LexRelTypeLabel LEX_REL_TYPE_LABEL = eki.eve.db.tables.LexRelTypeLabel.LEX_REL_TYPE_LABEL;

    /**
     * The table <code>public.lex_relation</code>.
     */
    public final LexRelation LEX_RELATION = eki.eve.db.tables.LexRelation.LEX_RELATION;

    /**
     * The table <code>public.lexeme</code>.
     */
    public final Lexeme LEXEME = eki.eve.db.tables.Lexeme.LEXEME;

    /**
     * The table <code>public.lexeme_deriv</code>.
     */
    public final LexemeDeriv LEXEME_DERIV = eki.eve.db.tables.LexemeDeriv.LEXEME_DERIV;

    /**
     * The table <code>public.lexeme_domain</code>.
     */
    public final LexemeDomain LEXEME_DOMAIN = eki.eve.db.tables.LexemeDomain.LEXEME_DOMAIN;

    /**
     * The table <code>public.lexeme_pos</code>.
     */
    public final LexemePos LEXEME_POS = eki.eve.db.tables.LexemePos.LEXEME_POS;

    /**
     * The table <code>public.lexeme_register</code>.
     */
    public final LexemeRegister LEXEME_REGISTER = eki.eve.db.tables.LexemeRegister.LEXEME_REGISTER;

    /**
     * The table <code>public.meaning</code>.
     */
    public final Meaning MEANING = eki.eve.db.tables.Meaning.MEANING;

    /**
     * The table <code>public.morph</code>.
     */
    public final Morph MORPH = eki.eve.db.tables.Morph.MORPH;

    /**
     * The table <code>public.morph_label</code>.
     */
    public final MorphLabel MORPH_LABEL = eki.eve.db.tables.MorphLabel.MORPH_LABEL;

    /**
     * The table <code>public.paradigm</code>.
     */
    public final Paradigm PARADIGM = eki.eve.db.tables.Paradigm.PARADIGM;

    /**
     * The table <code>public.pos</code>.
     */
    public final Pos POS = eki.eve.db.tables.Pos.POS;

    /**
     * The table <code>public.pos_label</code>.
     */
    public final PosLabel POS_LABEL = eki.eve.db.tables.PosLabel.POS_LABEL;

    /**
     * The table <code>public.rection</code>.
     */
    public final Rection RECTION = eki.eve.db.tables.Rection.RECTION;

    /**
     * The table <code>public.register</code>.
     */
    public final Register REGISTER = eki.eve.db.tables.Register.REGISTER;

    /**
     * The table <code>public.register_label</code>.
     */
    public final RegisterLabel REGISTER_LABEL = eki.eve.db.tables.RegisterLabel.REGISTER_LABEL;

    /**
     * The table <code>public.usage</code>.
     */
    public final Usage USAGE = eki.eve.db.tables.Usage.USAGE;

    /**
     * The table <code>public.word</code>.
     */
    public final Word WORD = eki.eve.db.tables.Word.WORD;

    /**
     * No further instances allowed
     */
    private Public() {
        super("public", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Sequence<?>> getSequences() {
        List result = new ArrayList();
        result.addAll(getSequences0());
        return result;
    }

    private final List<Sequence<?>> getSequences0() {
        return Arrays.<Sequence<?>>asList(
            Sequences.DEFINITION_ID_SEQ,
            Sequences.EKI_USER_ID_SEQ,
            Sequences.FORM_ID_SEQ,
            Sequences.GRAMMAR_ID_SEQ,
            Sequences.LEX_RELATION_ID_SEQ,
            Sequences.LEXEME_DERIV_ID_SEQ,
            Sequences.LEXEME_DOMAIN_ID_SEQ,
            Sequences.LEXEME_ID_SEQ,
            Sequences.LEXEME_POS_ID_SEQ,
            Sequences.LEXEME_REGISTER_ID_SEQ,
            Sequences.MEANING_ID_SEQ,
            Sequences.PARADIGM_ID_SEQ,
            Sequences.RECTION_ID_SEQ,
            Sequences.USAGE_ID_SEQ,
            Sequences.WORD_ID_SEQ);
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Dataset.DATASET,
            Definition.DEFINITION,
            Deriv.DERIV,
            DerivLabel.DERIV_LABEL,
            Domain.DOMAIN,
            DomainLabel.DOMAIN_LABEL,
            EkiUser.EKI_USER,
            Form.FORM,
            Gender.GENDER,
            GenderLabel.GENDER_LABEL,
            Grammar.GRAMMAR,
            LabelType.LABEL_TYPE,
            Lang.LANG,
            LangLabel.LANG_LABEL,
            LexRelType.LEX_REL_TYPE,
            LexRelTypeLabel.LEX_REL_TYPE_LABEL,
            LexRelation.LEX_RELATION,
            Lexeme.LEXEME,
            LexemeDeriv.LEXEME_DERIV,
            LexemeDomain.LEXEME_DOMAIN,
            LexemePos.LEXEME_POS,
            LexemeRegister.LEXEME_REGISTER,
            Meaning.MEANING,
            Morph.MORPH,
            MorphLabel.MORPH_LABEL,
            Paradigm.PARADIGM,
            Pos.POS,
            PosLabel.POS_LABEL,
            Rection.RECTION,
            Register.REGISTER,
            RegisterLabel.REGISTER_LABEL,
            Usage.USAGE,
            Word.WORD);
    }
}
