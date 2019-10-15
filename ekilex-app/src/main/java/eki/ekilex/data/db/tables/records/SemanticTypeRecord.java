/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables.records;


import eki.ekilex.data.db.tables.SemanticType;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


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
public class SemanticTypeRecord extends UpdatableRecordImpl<SemanticTypeRecord> implements Record3<String, String[], Long> {

    private static final long serialVersionUID = 786317167;

    /**
     * Setter for <code>public.semantic_type.code</code>.
     */
    public void setCode(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.semantic_type.code</code>.
     */
    public String getCode() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.semantic_type.datasets</code>.
     */
    public void setDatasets(String... value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.semantic_type.datasets</code>.
     */
    public String[] getDatasets() {
        return (String[]) get(1);
    }

    /**
     * Setter for <code>public.semantic_type.order_by</code>.
     */
    public void setOrderBy(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.semantic_type.order_by</code>.
     */
    public Long getOrderBy() {
        return (Long) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String[], Long> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String[], Long> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return SemanticType.SEMANTIC_TYPE.CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field2() {
        return SemanticType.SEMANTIC_TYPE.DATASETS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return SemanticType.SEMANTIC_TYPE.ORDER_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] component2() {
        return getDatasets();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getOrderBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value2() {
        return getDatasets();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getOrderBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SemanticTypeRecord value1(String value) {
        setCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SemanticTypeRecord value2(String... value) {
        setDatasets(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SemanticTypeRecord value3(Long value) {
        setOrderBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SemanticTypeRecord values(String value1, String[] value2, Long value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SemanticTypeRecord
     */
    public SemanticTypeRecord() {
        super(SemanticType.SEMANTIC_TYPE);
    }

    /**
     * Create a detached, initialised SemanticTypeRecord
     */
    public SemanticTypeRecord(String code, String[] datasets, Long orderBy) {
        super(SemanticType.SEMANTIC_TYPE);

        set(0, code);
        set(1, datasets);
        set(2, orderBy);
    }
}