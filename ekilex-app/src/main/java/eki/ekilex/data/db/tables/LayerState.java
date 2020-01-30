/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables;


import eki.ekilex.data.db.Indexes;
import eki.ekilex.data.db.Keys;
import eki.ekilex.data.db.Public;
import eki.ekilex.data.db.tables.records.LayerStateRecord;

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
public class LayerState extends TableImpl<LayerStateRecord> {

    private static final long serialVersionUID = -1617641498;

    /**
     * The reference instance of <code>public.layer_state</code>
     */
    public static final LayerState LAYER_STATE = new LayerState();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LayerStateRecord> getRecordType() {
        return LayerStateRecord.class;
    }

    /**
     * The column <code>public.layer_state.id</code>.
     */
    public final TableField<LayerStateRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('layer_state_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.layer_state.lexeme_id</code>.
     */
    public final TableField<LayerStateRecord, Long> LEXEME_ID = createField("lexeme_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.layer_state.layer_name</code>.
     */
    public final TableField<LayerStateRecord, String> LAYER_NAME = createField("layer_name", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>public.layer_state.process_state_code</code>.
     */
    public final TableField<LayerStateRecord, String> PROCESS_STATE_CODE = createField("process_state_code", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * Create a <code>public.layer_state</code> table reference
     */
    public LayerState() {
        this(DSL.name("layer_state"), null);
    }

    /**
     * Create an aliased <code>public.layer_state</code> table reference
     */
    public LayerState(String alias) {
        this(DSL.name(alias), LAYER_STATE);
    }

    /**
     * Create an aliased <code>public.layer_state</code> table reference
     */
    public LayerState(Name alias) {
        this(alias, LAYER_STATE);
    }

    private LayerState(Name alias, Table<LayerStateRecord> aliased) {
        this(alias, aliased, null);
    }

    private LayerState(Name alias, Table<LayerStateRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> LayerState(Table<O> child, ForeignKey<O, LayerStateRecord> key) {
        super(child, key, LAYER_STATE);
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
        return Arrays.<Index>asList(Indexes.LAYER_STATE_LAYER_NAME_IDX, Indexes.LAYER_STATE_LEXEME_ID_IDX, Indexes.LAYER_STATE_LEXEME_ID_LAYER_NAME_KEY, Indexes.LAYER_STATE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<LayerStateRecord, Long> getIdentity() {
        return Keys.IDENTITY_LAYER_STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LayerStateRecord> getPrimaryKey() {
        return Keys.LAYER_STATE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LayerStateRecord>> getKeys() {
        return Arrays.<UniqueKey<LayerStateRecord>>asList(Keys.LAYER_STATE_PKEY, Keys.LAYER_STATE_LEXEME_ID_LAYER_NAME_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<LayerStateRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<LayerStateRecord, ?>>asList(Keys.LAYER_STATE__LAYER_STATE_LEXEME_ID_FKEY, Keys.LAYER_STATE__LAYER_STATE_PROCESS_STATE_CODE_FKEY);
    }

    public Lexeme lexeme() {
        return new Lexeme(this, Keys.LAYER_STATE__LAYER_STATE_LEXEME_ID_FKEY);
    }

    public ProcessState processState() {
        return new ProcessState(this, Keys.LAYER_STATE__LAYER_STATE_PROCESS_STATE_CODE_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LayerState as(String alias) {
        return new LayerState(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LayerState as(Name alias) {
        return new LayerState(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public LayerState rename(String name) {
        return new LayerState(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public LayerState rename(Name name) {
        return new LayerState(name, null);
    }
}