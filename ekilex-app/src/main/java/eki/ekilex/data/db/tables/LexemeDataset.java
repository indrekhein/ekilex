/*
 * This file is generated by jOOQ.
*/
package eki.ekilex.data.db.tables;


import eki.ekilex.data.db.Indexes;
import eki.ekilex.data.db.Keys;
import eki.ekilex.data.db.Public;
import eki.ekilex.data.db.tables.records.LexemeDatasetRecord;

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
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LexemeDataset extends TableImpl<LexemeDatasetRecord> {

    private static final long serialVersionUID = 55731389;

    /**
     * The reference instance of <code>public.lexeme_dataset</code>
     */
    public static final LexemeDataset LEXEME_DATASET = new LexemeDataset();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LexemeDatasetRecord> getRecordType() {
        return LexemeDatasetRecord.class;
    }

    /**
     * The column <code>public.lexeme_dataset.lexeme_id</code>.
     */
    public final TableField<LexemeDatasetRecord, Long> LEXEME_ID = createField("lexeme_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.lexeme_dataset.dataset_code</code>.
     */
    public final TableField<LexemeDatasetRecord, String> DATASET_CODE = createField("dataset_code", org.jooq.impl.SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * Create a <code>public.lexeme_dataset</code> table reference
     */
    public LexemeDataset() {
        this(DSL.name("lexeme_dataset"), null);
    }

    /**
     * Create an aliased <code>public.lexeme_dataset</code> table reference
     */
    public LexemeDataset(String alias) {
        this(DSL.name(alias), LEXEME_DATASET);
    }

    /**
     * Create an aliased <code>public.lexeme_dataset</code> table reference
     */
    public LexemeDataset(Name alias) {
        this(alias, LEXEME_DATASET);
    }

    private LexemeDataset(Name alias, Table<LexemeDatasetRecord> aliased) {
        this(alias, aliased, null);
    }

    private LexemeDataset(Name alias, Table<LexemeDatasetRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.LEXEME_DATASET_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LexemeDatasetRecord> getPrimaryKey() {
        return Keys.LEXEME_DATASET_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LexemeDatasetRecord>> getKeys() {
        return Arrays.<UniqueKey<LexemeDatasetRecord>>asList(Keys.LEXEME_DATASET_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<LexemeDatasetRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<LexemeDatasetRecord, ?>>asList(Keys.LEXEME_DATASET__LEXEME_DATASET_LEXEME_ID_FKEY, Keys.LEXEME_DATASET__LEXEME_DATASET_DATASET_CODE_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LexemeDataset as(String alias) {
        return new LexemeDataset(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LexemeDataset as(Name alias) {
        return new LexemeDataset(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public LexemeDataset rename(String name) {
        return new LexemeDataset(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public LexemeDataset rename(Name name) {
        return new LexemeDataset(name, null);
    }
}
