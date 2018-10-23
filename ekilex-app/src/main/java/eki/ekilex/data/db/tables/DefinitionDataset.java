/*
 * This file is generated by jOOQ.
*/
package eki.ekilex.data.db.tables;


import eki.ekilex.data.db.Indexes;
import eki.ekilex.data.db.Keys;
import eki.ekilex.data.db.Public;
import eki.ekilex.data.db.tables.records.DefinitionDatasetRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class DefinitionDataset extends TableImpl<DefinitionDatasetRecord> {

    private static final long serialVersionUID = -623163001;

    /**
     * The reference instance of <code>public.definition_dataset</code>
     */
    public static final DefinitionDataset DEFINITION_DATASET = new DefinitionDataset();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DefinitionDatasetRecord> getRecordType() {
        return DefinitionDatasetRecord.class;
    }

    /**
     * The column <code>public.definition_dataset.definition_id</code>.
     */
    public final TableField<DefinitionDatasetRecord, Long> DEFINITION_ID = createField("definition_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.definition_dataset.dataset_code</code>.
     */
    public final TableField<DefinitionDatasetRecord, String> DATASET_CODE = createField("dataset_code", org.jooq.impl.SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * Create a <code>public.definition_dataset</code> table reference
     */
    public DefinitionDataset() {
        this(DSL.name("definition_dataset"), null);
    }

    /**
     * Create an aliased <code>public.definition_dataset</code> table reference
     */
    public DefinitionDataset(String alias) {
        this(DSL.name(alias), DEFINITION_DATASET);
    }

    /**
     * Create an aliased <code>public.definition_dataset</code> table reference
     */
    public DefinitionDataset(Name alias) {
        this(alias, DEFINITION_DATASET);
    }

    private DefinitionDataset(Name alias, Table<DefinitionDatasetRecord> aliased) {
        this(alias, aliased, null);
    }

    private DefinitionDataset(Name alias, Table<DefinitionDatasetRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.DEFINITION_DATASET_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DefinitionDatasetRecord> getPrimaryKey() {
        return Keys.DEFINITION_DATASET_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DefinitionDatasetRecord>> getKeys() {
        return Arrays.<UniqueKey<DefinitionDatasetRecord>>asList(Keys.DEFINITION_DATASET_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<DefinitionDatasetRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<DefinitionDatasetRecord, ?>>asList(Keys.DEFINITION_DATASET__DEFINITION_DATASET_DEFINITION_ID_FKEY, Keys.DEFINITION_DATASET__DEFINITION_DATASET_DATASET_CODE_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DefinitionDataset as(String alias) {
        return new DefinitionDataset(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DefinitionDataset as(Name alias) {
        return new DefinitionDataset(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DefinitionDataset rename(String name) {
        return new DefinitionDataset(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DefinitionDataset rename(Name name) {
        return new DefinitionDataset(name, null);
    }
}
