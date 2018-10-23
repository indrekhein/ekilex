/*
 * This file is generated by jOOQ.
*/
package eki.ekilex.data.db.tables.records;


import eki.ekilex.data.db.tables.CollocationFreeform;

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
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CollocationFreeformRecord extends UpdatableRecordImpl<CollocationFreeformRecord> implements Record3<Long, Long, Long> {

    private static final long serialVersionUID = 1468845822;

    /**
     * Setter for <code>public.collocation_freeform.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.collocation_freeform.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.collocation_freeform.collocation_id</code>.
     */
    public void setCollocationId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.collocation_freeform.collocation_id</code>.
     */
    public Long getCollocationId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.collocation_freeform.freeform_id</code>.
     */
    public void setFreeformId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.collocation_freeform.freeform_id</code>.
     */
    public Long getFreeformId() {
        return (Long) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Long, Long, Long> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Long, Long, Long> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return CollocationFreeform.COLLOCATION_FREEFORM.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return CollocationFreeform.COLLOCATION_FREEFORM.COLLOCATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return CollocationFreeform.COLLOCATION_FREEFORM.FREEFORM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getCollocationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getFreeformId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getCollocationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getFreeformId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollocationFreeformRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollocationFreeformRecord value2(Long value) {
        setCollocationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollocationFreeformRecord value3(Long value) {
        setFreeformId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollocationFreeformRecord values(Long value1, Long value2, Long value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CollocationFreeformRecord
     */
    public CollocationFreeformRecord() {
        super(CollocationFreeform.COLLOCATION_FREEFORM);
    }

    /**
     * Create a detached, initialised CollocationFreeformRecord
     */
    public CollocationFreeformRecord(Long id, Long collocationId, Long freeformId) {
        super(CollocationFreeform.COLLOCATION_FREEFORM);

        set(0, id);
        set(1, collocationId);
        set(2, freeformId);
    }
}
