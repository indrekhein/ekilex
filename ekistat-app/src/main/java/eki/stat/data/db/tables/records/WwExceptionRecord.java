/*
 * This file is generated by jOOQ.
 */
package eki.stat.data.db.tables.records;


import eki.stat.data.db.tables.WwException;

import java.sql.Timestamp;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class WwExceptionRecord extends UpdatableRecordImpl<WwExceptionRecord> implements Record4<Long, String, String, Timestamp> {

    private static final long serialVersionUID = 1598881261;

    /**
     * Setter for <code>public.ww_exception.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.ww_exception.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.ww_exception.exception_name</code>.
     */
    public void setExceptionName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.ww_exception.exception_name</code>.
     */
    public String getExceptionName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.ww_exception.exception_message</code>.
     */
    public void setExceptionMessage(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.ww_exception.exception_message</code>.
     */
    public String getExceptionMessage() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.ww_exception.event_on</code>.
     */
    public void setEventOn(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.ww_exception.event_on</code>.
     */
    public Timestamp getEventOn() {
        return (Timestamp) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, String, String, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Long, String, String, Timestamp> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return WwException.WW_EXCEPTION.ID;
    }

    @Override
    public Field<String> field2() {
        return WwException.WW_EXCEPTION.EXCEPTION_NAME;
    }

    @Override
    public Field<String> field3() {
        return WwException.WW_EXCEPTION.EXCEPTION_MESSAGE;
    }

    @Override
    public Field<Timestamp> field4() {
        return WwException.WW_EXCEPTION.EVENT_ON;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getExceptionName();
    }

    @Override
    public String component3() {
        return getExceptionMessage();
    }

    @Override
    public Timestamp component4() {
        return getEventOn();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getExceptionName();
    }

    @Override
    public String value3() {
        return getExceptionMessage();
    }

    @Override
    public Timestamp value4() {
        return getEventOn();
    }

    @Override
    public WwExceptionRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public WwExceptionRecord value2(String value) {
        setExceptionName(value);
        return this;
    }

    @Override
    public WwExceptionRecord value3(String value) {
        setExceptionMessage(value);
        return this;
    }

    @Override
    public WwExceptionRecord value4(Timestamp value) {
        setEventOn(value);
        return this;
    }

    @Override
    public WwExceptionRecord values(Long value1, String value2, String value3, Timestamp value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached WwExceptionRecord
     */
    public WwExceptionRecord() {
        super(WwException.WW_EXCEPTION);
    }

    /**
     * Create a detached, initialised WwExceptionRecord
     */
    public WwExceptionRecord(Long id, String exceptionName, String exceptionMessage, Timestamp eventOn) {
        super(WwException.WW_EXCEPTION);

        set(0, id);
        set(1, exceptionName);
        set(2, exceptionMessage);
        set(3, eventOn);
    }
}