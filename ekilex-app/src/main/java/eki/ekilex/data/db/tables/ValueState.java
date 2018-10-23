/*
 * This file is generated by jOOQ.
*/
package eki.ekilex.data.db.tables;


import eki.ekilex.data.db.Indexes;
import eki.ekilex.data.db.Keys;
import eki.ekilex.data.db.Public;
import eki.ekilex.data.db.tables.records.ValueStateRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Index;
import org.jooq.Name;
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
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ValueState extends TableImpl<ValueStateRecord> {

    private static final long serialVersionUID = -2042392846;

    /**
     * The reference instance of <code>public.value_state</code>
     */
    public static final ValueState VALUE_STATE = new ValueState();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ValueStateRecord> getRecordType() {
        return ValueStateRecord.class;
    }

    /**
     * The column <code>public.value_state.code</code>.
     */
    public final TableField<ValueStateRecord, String> CODE = createField("code", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>public.value_state.datasets</code>.
     */
    public final TableField<ValueStateRecord, String[]> DATASETS = createField("datasets", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this, "");

    /**
     * Create a <code>public.value_state</code> table reference
     */
    public ValueState() {
        this(DSL.name("value_state"), null);
    }

    /**
     * Create an aliased <code>public.value_state</code> table reference
     */
    public ValueState(String alias) {
        this(DSL.name(alias), VALUE_STATE);
    }

    /**
     * Create an aliased <code>public.value_state</code> table reference
     */
    public ValueState(Name alias) {
        this(alias, VALUE_STATE);
    }

    private ValueState(Name alias, Table<ValueStateRecord> aliased) {
        this(alias, aliased, null);
    }

    private ValueState(Name alias, Table<ValueStateRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.VALUE_STATE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ValueStateRecord> getPrimaryKey() {
        return Keys.VALUE_STATE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ValueStateRecord>> getKeys() {
        return Arrays.<UniqueKey<ValueStateRecord>>asList(Keys.VALUE_STATE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ValueState as(String alias) {
        return new ValueState(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ValueState as(Name alias) {
        return new ValueState(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ValueState rename(String name) {
        return new ValueState(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ValueState rename(Name name) {
        return new ValueState(name, null);
    }
}
