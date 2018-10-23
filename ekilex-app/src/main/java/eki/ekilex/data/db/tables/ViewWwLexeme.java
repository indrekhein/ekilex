/*
 * This file is generated by jOOQ.
*/
package eki.ekilex.data.db.tables;


import eki.ekilex.data.db.Public;
import eki.ekilex.data.db.tables.records.ViewWwLexemeRecord;
import eki.ekilex.data.db.udt.records.TypeUsageRecord;

import javax.annotation.Generated;

import org.jooq.Field;
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
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewWwLexeme extends TableImpl<ViewWwLexemeRecord> {

    private static final long serialVersionUID = -2063113483;

    /**
     * The reference instance of <code>public.view_ww_lexeme</code>
     */
    public static final ViewWwLexeme VIEW_WW_LEXEME = new ViewWwLexeme();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewWwLexemeRecord> getRecordType() {
        return ViewWwLexemeRecord.class;
    }

    /**
     * The column <code>public.view_ww_lexeme.lexeme_id</code>.
     */
    public final TableField<ViewWwLexemeRecord, Long> LEXEME_ID = createField("lexeme_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.view_ww_lexeme.word_id</code>.
     */
    public final TableField<ViewWwLexemeRecord, Long> WORD_ID = createField("word_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.view_ww_lexeme.meaning_id</code>.
     */
    public final TableField<ViewWwLexemeRecord, Long> MEANING_ID = createField("meaning_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.view_ww_lexeme.dataset_code</code>.
     */
    public final TableField<ViewWwLexemeRecord, String> DATASET_CODE = createField("dataset_code", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>public.view_ww_lexeme.ds_order_by</code>.
     */
    public final TableField<ViewWwLexemeRecord, Long> DS_ORDER_BY = createField("ds_order_by", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.view_ww_lexeme.level1</code>.
     */
    public final TableField<ViewWwLexemeRecord, Integer> LEVEL1 = createField("level1", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.view_ww_lexeme.level2</code>.
     */
    public final TableField<ViewWwLexemeRecord, Integer> LEVEL2 = createField("level2", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.view_ww_lexeme.level3</code>.
     */
    public final TableField<ViewWwLexemeRecord, Integer> LEVEL3 = createField("level3", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.view_ww_lexeme.lex_order_by</code>.
     */
    public final TableField<ViewWwLexemeRecord, Long> LEX_ORDER_BY = createField("lex_order_by", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.view_ww_lexeme.register_codes</code>.
     */
    public final TableField<ViewWwLexemeRecord, String[]> REGISTER_CODES = createField("register_codes", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this, "");

    /**
     * The column <code>public.view_ww_lexeme.pos_codes</code>.
     */
    public final TableField<ViewWwLexemeRecord, String[]> POS_CODES = createField("pos_codes", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this, "");

    /**
     * The column <code>public.view_ww_lexeme.deriv_codes</code>.
     */
    public final TableField<ViewWwLexemeRecord, String[]> DERIV_CODES = createField("deriv_codes", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this, "");

    /**
     * The column <code>public.view_ww_lexeme.advice_notes</code>.
     */
    public final TableField<ViewWwLexemeRecord, String[]> ADVICE_NOTES = createField("advice_notes", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this, "");

    /**
     * The column <code>public.view_ww_lexeme.public_notes</code>.
     */
    public final TableField<ViewWwLexemeRecord, String[]> PUBLIC_NOTES = createField("public_notes", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this, "");

    /**
     * The column <code>public.view_ww_lexeme.grammars</code>.
     */
    public final TableField<ViewWwLexemeRecord, String[]> GRAMMARS = createField("grammars", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this, "");

    /**
     * The column <code>public.view_ww_lexeme.governments</code>.
     */
    public final TableField<ViewWwLexemeRecord, String[]> GOVERNMENTS = createField("governments", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this, "");

    /**
     * The column <code>public.view_ww_lexeme.usages</code>.
     */
    public final TableField<ViewWwLexemeRecord, TypeUsageRecord[]> USAGES = createField("usages", eki.ekilex.data.db.udt.TypeUsage.TYPE_USAGE.getDataType().getArrayDataType(), this, "");

    /**
     * Create a <code>public.view_ww_lexeme</code> table reference
     */
    public ViewWwLexeme() {
        this(DSL.name("view_ww_lexeme"), null);
    }

    /**
     * Create an aliased <code>public.view_ww_lexeme</code> table reference
     */
    public ViewWwLexeme(String alias) {
        this(DSL.name(alias), VIEW_WW_LEXEME);
    }

    /**
     * Create an aliased <code>public.view_ww_lexeme</code> table reference
     */
    public ViewWwLexeme(Name alias) {
        this(alias, VIEW_WW_LEXEME);
    }

    private ViewWwLexeme(Name alias, Table<ViewWwLexemeRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewWwLexeme(Name alias, Table<ViewWwLexemeRecord> aliased, Field<?>[] parameters) {
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
    public ViewWwLexeme as(String alias) {
        return new ViewWwLexeme(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewWwLexeme as(Name alias) {
        return new ViewWwLexeme(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewWwLexeme rename(String name) {
        return new ViewWwLexeme(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewWwLexeme rename(Name name) {
        return new ViewWwLexeme(name, null);
    }
}
