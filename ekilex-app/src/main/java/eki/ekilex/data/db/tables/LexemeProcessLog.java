/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables;


import eki.ekilex.data.db.Indexes;
import eki.ekilex.data.db.Keys;
import eki.ekilex.data.db.Public;
import eki.ekilex.data.db.tables.records.LexemeProcessLogRecord;

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
public class LexemeProcessLog extends TableImpl<LexemeProcessLogRecord> {

    private static final long serialVersionUID = -534579763;

    /**
     * The reference instance of <code>public.lexeme_process_log</code>
     */
    public static final LexemeProcessLog LEXEME_PROCESS_LOG = new LexemeProcessLog();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LexemeProcessLogRecord> getRecordType() {
        return LexemeProcessLogRecord.class;
    }

    /**
     * The column <code>public.lexeme_process_log.id</code>.
     */
    public final TableField<LexemeProcessLogRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('lexeme_process_log_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.lexeme_process_log.lexeme_id</code>.
     */
    public final TableField<LexemeProcessLogRecord, Long> LEXEME_ID = createField("lexeme_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.lexeme_process_log.process_log_id</code>.
     */
    public final TableField<LexemeProcessLogRecord, Long> PROCESS_LOG_ID = createField("process_log_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>public.lexeme_process_log</code> table reference
     */
    public LexemeProcessLog() {
        this(DSL.name("lexeme_process_log"), null);
    }

    /**
     * Create an aliased <code>public.lexeme_process_log</code> table reference
     */
    public LexemeProcessLog(String alias) {
        this(DSL.name(alias), LEXEME_PROCESS_LOG);
    }

    /**
     * Create an aliased <code>public.lexeme_process_log</code> table reference
     */
    public LexemeProcessLog(Name alias) {
        this(alias, LEXEME_PROCESS_LOG);
    }

    private LexemeProcessLog(Name alias, Table<LexemeProcessLogRecord> aliased) {
        this(alias, aliased, null);
    }

    private LexemeProcessLog(Name alias, Table<LexemeProcessLogRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> LexemeProcessLog(Table<O> child, ForeignKey<O, LexemeProcessLogRecord> key) {
        super(child, key, LEXEME_PROCESS_LOG);
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
        return Arrays.<Index>asList(Indexes.LEXEME_PROCESS_LOG_LEXEME_ID_IDX, Indexes.LEXEME_PROCESS_LOG_LOG_ID_IDX, Indexes.LEXEME_PROCESS_LOG_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<LexemeProcessLogRecord, Long> getIdentity() {
        return Keys.IDENTITY_LEXEME_PROCESS_LOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LexemeProcessLogRecord> getPrimaryKey() {
        return Keys.LEXEME_PROCESS_LOG_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LexemeProcessLogRecord>> getKeys() {
        return Arrays.<UniqueKey<LexemeProcessLogRecord>>asList(Keys.LEXEME_PROCESS_LOG_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<LexemeProcessLogRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<LexemeProcessLogRecord, ?>>asList(Keys.LEXEME_PROCESS_LOG__LEXEME_PROCESS_LOG_LEXEME_ID_FKEY, Keys.LEXEME_PROCESS_LOG__LEXEME_PROCESS_LOG_PROCESS_LOG_ID_FKEY);
    }

    public Lexeme lexeme() {
        return new Lexeme(this, Keys.LEXEME_PROCESS_LOG__LEXEME_PROCESS_LOG_LEXEME_ID_FKEY);
    }

    public ProcessLog processLog() {
        return new ProcessLog(this, Keys.LEXEME_PROCESS_LOG__LEXEME_PROCESS_LOG_PROCESS_LOG_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LexemeProcessLog as(String alias) {
        return new LexemeProcessLog(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LexemeProcessLog as(Name alias) {
        return new LexemeProcessLog(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public LexemeProcessLog rename(String name) {
        return new LexemeProcessLog(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public LexemeProcessLog rename(Name name) {
        return new LexemeProcessLog(name, null);
    }
}
