/*
 * This file is generated by jOOQ.
*/
package eki.eve.db.tables.records;


import eki.eve.db.tables.Form;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FormRecord extends UpdatableRecordImpl<FormRecord> implements Record8<Long, Long, String, String, String[], String, String, Boolean> {

    private static final long serialVersionUID = 74760678;

    /**
     * Setter for <code>public.form.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.form.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.form.paradigm_id</code>.
     */
    public void setParadigmId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.form.paradigm_id</code>.
     */
    public Long getParadigmId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.form.morph_code</code>.
     */
    public void setMorphCode(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.form.morph_code</code>.
     */
    public String getMorphCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.form.value</code>.
     */
    public void setValue(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.form.value</code>.
     */
    public String getValue() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.form.components</code>.
     */
    public void setComponents(String... value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.form.components</code>.
     */
    public String[] getComponents() {
        return (String[]) get(4);
    }

    /**
     * Setter for <code>public.form.display_form</code>.
     */
    public void setDisplayForm(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.form.display_form</code>.
     */
    public String getDisplayForm() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.form.vocal_form</code>.
     */
    public void setVocalForm(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.form.vocal_form</code>.
     */
    public String getVocalForm() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.form.is_word</code>.
     */
    public void setIsWord(Boolean value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.form.is_word</code>.
     */
    public Boolean getIsWord() {
        return (Boolean) get(7);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Long, Long, String, String, String[], String, String, Boolean> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Long, Long, String, String, String[], String, String, Boolean> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Form.FORM.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return Form.FORM.PARADIGM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Form.FORM.MORPH_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Form.FORM.VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field5() {
        return Form.FORM.COMPONENTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Form.FORM.DISPLAY_FORM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Form.FORM.VOCAL_FORM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field8() {
        return Form.FORM.IS_WORD;
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
        return getParadigmId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getMorphCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value5() {
        return getComponents();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getDisplayForm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getVocalForm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value8() {
        return getIsWord();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FormRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FormRecord value2(Long value) {
        setParadigmId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FormRecord value3(String value) {
        setMorphCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FormRecord value4(String value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FormRecord value5(String... value) {
        setComponents(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FormRecord value6(String value) {
        setDisplayForm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FormRecord value7(String value) {
        setVocalForm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FormRecord value8(Boolean value) {
        setIsWord(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FormRecord values(Long value1, Long value2, String value3, String value4, String[] value5, String value6, String value7, Boolean value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FormRecord
     */
    public FormRecord() {
        super(Form.FORM);
    }

    /**
     * Create a detached, initialised FormRecord
     */
    public FormRecord(Long id, Long paradigmId, String morphCode, String value, String[] components, String displayForm, String vocalForm, Boolean isWord) {
        super(Form.FORM);

        set(0, id);
        set(1, paradigmId);
        set(2, morphCode);
        set(3, value);
        set(4, components);
        set(5, displayForm);
        set(6, vocalForm);
        set(7, isWord);
    }
}
