/*
 * This file is generated by jOOQ.
*/
package eki.wordweb.data.db.tables;


import eki.wordweb.data.db.Indexes;
import eki.wordweb.data.db.Public;
import eki.wordweb.data.db.tables.records.MviewWwLexemeRelationRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MviewWwLexemeRelation extends TableImpl<MviewWwLexemeRelationRecord> {

    private static final long serialVersionUID = -242262522;

    /**
     * The reference instance of <code>public.mview_ww_lexeme_relation</code>
     */
    public static final MviewWwLexemeRelation MVIEW_WW_LEXEME_RELATION = new MviewWwLexemeRelation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MviewWwLexemeRelationRecord> getRecordType() {
        return MviewWwLexemeRelationRecord.class;
    }

    /**
     * The column <code>public.mview_ww_lexeme_relation.lexeme1_id</code>.
     */
    public final TableField<MviewWwLexemeRelationRecord, Long> LEXEME1_ID = createField("lexeme1_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.mview_ww_lexeme_relation.word1</code>.
     */
    public final TableField<MviewWwLexemeRelationRecord, String> WORD1 = createField("word1", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.mview_ww_lexeme_relation.lang1</code>.
     */
    public final TableField<MviewWwLexemeRelationRecord, String> LANG1 = createField("lang1", org.jooq.impl.SQLDataType.CHAR(3), this, "");

    /**
     * The column <code>public.mview_ww_lexeme_relation.lexeme2_id</code>.
     */
    public final TableField<MviewWwLexemeRelationRecord, Long> LEXEME2_ID = createField("lexeme2_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.mview_ww_lexeme_relation.word2</code>.
     */
    public final TableField<MviewWwLexemeRelationRecord, String> WORD2 = createField("word2", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.mview_ww_lexeme_relation.lang2</code>.
     */
    public final TableField<MviewWwLexemeRelationRecord, String> LANG2 = createField("lang2", org.jooq.impl.SQLDataType.CHAR(3), this, "");

    /**
     * The column <code>public.mview_ww_lexeme_relation.lex_rel_type_code</code>.
     */
    public final TableField<MviewWwLexemeRelationRecord, String> LEX_REL_TYPE_CODE = createField("lex_rel_type_code", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>public.mview_ww_lexeme_relation.order_by</code>.
     */
    public final TableField<MviewWwLexemeRelationRecord, Long> ORDER_BY = createField("order_by", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>public.mview_ww_lexeme_relation</code> table reference
     */
    public MviewWwLexemeRelation() {
        this(DSL.name("mview_ww_lexeme_relation"), null);
    }

    /**
     * Create an aliased <code>public.mview_ww_lexeme_relation</code> table reference
     */
    public MviewWwLexemeRelation(String alias) {
        this(DSL.name(alias), MVIEW_WW_LEXEME_RELATION);
    }

    /**
     * Create an aliased <code>public.mview_ww_lexeme_relation</code> table reference
     */
    public MviewWwLexemeRelation(Name alias) {
        this(alias, MVIEW_WW_LEXEME_RELATION);
    }

    private MviewWwLexemeRelation(Name alias, Table<MviewWwLexemeRelationRecord> aliased) {
        this(alias, aliased, null);
    }

    private MviewWwLexemeRelation(Name alias, Table<MviewWwLexemeRelationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.MVIEW_WW_LEXEME_RELATION_LEX1_ID_IDX, Indexes.MVIEW_WW_LEXEME_RELATION_LEX2_ID_IDX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwLexemeRelation as(String alias) {
        return new MviewWwLexemeRelation(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwLexemeRelation as(Name alias) {
        return new MviewWwLexemeRelation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MviewWwLexemeRelation rename(String name) {
        return new MviewWwLexemeRelation(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MviewWwLexemeRelation rename(Name name) {
        return new MviewWwLexemeRelation(name, null);
    }
}
