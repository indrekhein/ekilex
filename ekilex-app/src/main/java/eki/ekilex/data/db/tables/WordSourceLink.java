/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables;


import eki.ekilex.data.db.Indexes;
import eki.ekilex.data.db.Keys;
import eki.ekilex.data.db.Public;
import eki.ekilex.data.db.tables.records.WordSourceLinkRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class WordSourceLink extends TableImpl<WordSourceLinkRecord> {

    private static final long serialVersionUID = 1041585415;

    /**
     * The reference instance of <code>public.word_source_link</code>
     */
    public static final WordSourceLink WORD_SOURCE_LINK = new WordSourceLink();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<WordSourceLinkRecord> getRecordType() {
        return WordSourceLinkRecord.class;
    }

    /**
     * The column <code>public.word_source_link.id</code>.
     */
    public final TableField<WordSourceLinkRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('word_source_link_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.word_source_link.word_id</code>.
     */
    public final TableField<WordSourceLinkRecord, Long> WORD_ID = createField("word_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.word_source_link.source_id</code>.
     */
    public final TableField<WordSourceLinkRecord, Long> SOURCE_ID = createField("source_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.word_source_link.type</code>.
     */
    public final TableField<WordSourceLinkRecord, String> TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>public.word_source_link.name</code>.
     */
    public final TableField<WordSourceLinkRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.word_source_link.value</code>.
     */
    public final TableField<WordSourceLinkRecord, String> VALUE = createField("value", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.word_source_link.process_state_code</code>.
     */
    public final TableField<WordSourceLinkRecord, String> PROCESS_STATE_CODE = createField("process_state_code", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>public.word_source_link.order_by</code>.
     */
    public final TableField<WordSourceLinkRecord, Long> ORDER_BY = createField("order_by", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('word_source_link_order_by_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>public.word_source_link</code> table reference
     */
    public WordSourceLink() {
        this(DSL.name("word_source_link"), null);
    }

    /**
     * Create an aliased <code>public.word_source_link</code> table reference
     */
    public WordSourceLink(String alias) {
        this(DSL.name(alias), WORD_SOURCE_LINK);
    }

    /**
     * Create an aliased <code>public.word_source_link</code> table reference
     */
    public WordSourceLink(Name alias) {
        this(alias, WORD_SOURCE_LINK);
    }

    private WordSourceLink(Name alias, Table<WordSourceLinkRecord> aliased) {
        this(alias, aliased, null);
    }

    private WordSourceLink(Name alias, Table<WordSourceLinkRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> WordSourceLink(Table<O> child, ForeignKey<O, WordSourceLinkRecord> key) {
        super(child, key, WORD_SOURCE_LINK);
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
        return Arrays.<Index>asList(Indexes.WORD_SOURCE_LINK_PKEY, Indexes.WORD_SOURCE_LINK_SOURCE_ID_IDX, Indexes.WORD_SOURCE_LINK_WORD_ID_IDX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<WordSourceLinkRecord, Long> getIdentity() {
        return Keys.IDENTITY_WORD_SOURCE_LINK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<WordSourceLinkRecord> getPrimaryKey() {
        return Keys.WORD_SOURCE_LINK_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<WordSourceLinkRecord>> getKeys() {
        return Arrays.<UniqueKey<WordSourceLinkRecord>>asList(Keys.WORD_SOURCE_LINK_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<WordSourceLinkRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<WordSourceLinkRecord, ?>>asList(Keys.WORD_SOURCE_LINK__WORD_SOURCE_LINK_WORD_ID_FKEY, Keys.WORD_SOURCE_LINK__WORD_SOURCE_LINK_SOURCE_ID_FKEY, Keys.WORD_SOURCE_LINK__WORD_SOURCE_LINK_PROCESS_STATE_CODE_FKEY);
    }

    public Word word() {
        return new Word(this, Keys.WORD_SOURCE_LINK__WORD_SOURCE_LINK_WORD_ID_FKEY);
    }

    public Source source() {
        return new Source(this, Keys.WORD_SOURCE_LINK__WORD_SOURCE_LINK_SOURCE_ID_FKEY);
    }

    public ProcessState processState() {
        return new ProcessState(this, Keys.WORD_SOURCE_LINK__WORD_SOURCE_LINK_PROCESS_STATE_CODE_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WordSourceLink as(String alias) {
        return new WordSourceLink(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WordSourceLink as(Name alias) {
        return new WordSourceLink(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public WordSourceLink rename(String name) {
        return new WordSourceLink(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public WordSourceLink rename(Name name) {
        return new WordSourceLink(name, null);
    }
}