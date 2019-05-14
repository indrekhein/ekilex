/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables;


import eki.ekilex.data.db.Indexes;
import eki.ekilex.data.db.Keys;
import eki.ekilex.data.db.Public;
import eki.ekilex.data.db.tables.records.MeaningProcessLogRecord;

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
public class MeaningProcessLog extends TableImpl<MeaningProcessLogRecord> {

    private static final long serialVersionUID = 201198440;

    /**
     * The reference instance of <code>public.meaning_process_log</code>
     */
    public static final MeaningProcessLog MEANING_PROCESS_LOG = new MeaningProcessLog();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MeaningProcessLogRecord> getRecordType() {
        return MeaningProcessLogRecord.class;
    }

    /**
     * The column <code>public.meaning_process_log.id</code>.
     */
    public final TableField<MeaningProcessLogRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('meaning_process_log_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.meaning_process_log.meaning_id</code>.
     */
    public final TableField<MeaningProcessLogRecord, Long> MEANING_ID = createField("meaning_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.meaning_process_log.process_log_id</code>.
     */
    public final TableField<MeaningProcessLogRecord, Long> PROCESS_LOG_ID = createField("process_log_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>public.meaning_process_log</code> table reference
     */
    public MeaningProcessLog() {
        this(DSL.name("meaning_process_log"), null);
    }

    /**
     * Create an aliased <code>public.meaning_process_log</code> table reference
     */
    public MeaningProcessLog(String alias) {
        this(DSL.name(alias), MEANING_PROCESS_LOG);
    }

    /**
     * Create an aliased <code>public.meaning_process_log</code> table reference
     */
    public MeaningProcessLog(Name alias) {
        this(alias, MEANING_PROCESS_LOG);
    }

    private MeaningProcessLog(Name alias, Table<MeaningProcessLogRecord> aliased) {
        this(alias, aliased, null);
    }

    private MeaningProcessLog(Name alias, Table<MeaningProcessLogRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> MeaningProcessLog(Table<O> child, ForeignKey<O, MeaningProcessLogRecord> key) {
        super(child, key, MEANING_PROCESS_LOG);
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
        return Arrays.<Index>asList(Indexes.MEANING_PROCESS_LOG_LOG_ID_IDX, Indexes.MEANING_PROCESS_LOG_MEANING_ID_IDX, Indexes.MEANING_PROCESS_LOG_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<MeaningProcessLogRecord, Long> getIdentity() {
        return Keys.IDENTITY_MEANING_PROCESS_LOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MeaningProcessLogRecord> getPrimaryKey() {
        return Keys.MEANING_PROCESS_LOG_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MeaningProcessLogRecord>> getKeys() {
        return Arrays.<UniqueKey<MeaningProcessLogRecord>>asList(Keys.MEANING_PROCESS_LOG_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<MeaningProcessLogRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<MeaningProcessLogRecord, ?>>asList(Keys.MEANING_PROCESS_LOG__MEANING_PROCESS_LOG_MEANING_ID_FKEY, Keys.MEANING_PROCESS_LOG__MEANING_PROCESS_LOG_PROCESS_LOG_ID_FKEY);
    }

    public Meaning meaning() {
        return new Meaning(this, Keys.MEANING_PROCESS_LOG__MEANING_PROCESS_LOG_MEANING_ID_FKEY);
    }

    public ProcessLog processLog() {
        return new ProcessLog(this, Keys.MEANING_PROCESS_LOG__MEANING_PROCESS_LOG_PROCESS_LOG_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MeaningProcessLog as(String alias) {
        return new MeaningProcessLog(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MeaningProcessLog as(Name alias) {
        return new MeaningProcessLog(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MeaningProcessLog rename(String name) {
        return new MeaningProcessLog(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MeaningProcessLog rename(Name name) {
        return new MeaningProcessLog(name, null);
    }
}
