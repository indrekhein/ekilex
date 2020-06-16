/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables;


import eki.ekilex.data.db.Indexes;
import eki.ekilex.data.db.Keys;
import eki.ekilex.data.db.Public;
import eki.ekilex.data.db.tables.records.LexemeTagRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LexemeTag extends TableImpl<LexemeTagRecord> {

    private static final long serialVersionUID = 1387960994;

    /**
     * The reference instance of <code>public.lexeme_tag</code>
     */
    public static final LexemeTag LEXEME_TAG = new LexemeTag();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LexemeTagRecord> getRecordType() {
        return LexemeTagRecord.class;
    }

    /**
     * The column <code>public.lexeme_tag.id</code>.
     */
    public final TableField<LexemeTagRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('lexeme_tag_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.lexeme_tag.lexeme_id</code>.
     */
    public final TableField<LexemeTagRecord, Long> LEXEME_ID = createField(DSL.name("lexeme_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.lexeme_tag.tag_name</code>.
     */
    public final TableField<LexemeTagRecord, String> TAG_NAME = createField(DSL.name("tag_name"), org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>public.lexeme_tag.created_on</code>.
     */
    public final TableField<LexemeTagRecord, Timestamp> CREATED_ON = createField(DSL.name("created_on"), org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("statement_timestamp()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>public.lexeme_tag</code> table reference
     */
    public LexemeTag() {
        this(DSL.name("lexeme_tag"), null);
    }

    /**
     * Create an aliased <code>public.lexeme_tag</code> table reference
     */
    public LexemeTag(String alias) {
        this(DSL.name(alias), LEXEME_TAG);
    }

    /**
     * Create an aliased <code>public.lexeme_tag</code> table reference
     */
    public LexemeTag(Name alias) {
        this(alias, LEXEME_TAG);
    }

    private LexemeTag(Name alias, Table<LexemeTagRecord> aliased) {
        this(alias, aliased, null);
    }

    private LexemeTag(Name alias, Table<LexemeTagRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> LexemeTag(Table<O> child, ForeignKey<O, LexemeTagRecord> key) {
        super(child, key, LEXEME_TAG);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.LEXEME_TAG_LEXEME_ID_IDX, Indexes.LEXEME_TAG_TAG_NAME_IDX);
    }

    @Override
    public Identity<LexemeTagRecord, Long> getIdentity() {
        return Keys.IDENTITY_LEXEME_TAG;
    }

    @Override
    public UniqueKey<LexemeTagRecord> getPrimaryKey() {
        return Keys.LEXEME_TAG_PKEY;
    }

    @Override
    public List<UniqueKey<LexemeTagRecord>> getKeys() {
        return Arrays.<UniqueKey<LexemeTagRecord>>asList(Keys.LEXEME_TAG_PKEY, Keys.LEXEME_TAG_LEXEME_ID_TAG_NAME_KEY);
    }

    @Override
    public List<ForeignKey<LexemeTagRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<LexemeTagRecord, ?>>asList(Keys.LEXEME_TAG__LEXEME_TAG_LEXEME_ID_FKEY, Keys.LEXEME_TAG__LEXEME_TAG_TAG_NAME_FKEY);
    }

    public Lexeme lexeme() {
        return new Lexeme(this, Keys.LEXEME_TAG__LEXEME_TAG_LEXEME_ID_FKEY);
    }

    public Tag tag() {
        return new Tag(this, Keys.LEXEME_TAG__LEXEME_TAG_TAG_NAME_FKEY);
    }

    @Override
    public LexemeTag as(String alias) {
        return new LexemeTag(DSL.name(alias), this);
    }

    @Override
    public LexemeTag as(Name alias) {
        return new LexemeTag(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public LexemeTag rename(String name) {
        return new LexemeTag(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public LexemeTag rename(Name name) {
        return new LexemeTag(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, Long, String, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
