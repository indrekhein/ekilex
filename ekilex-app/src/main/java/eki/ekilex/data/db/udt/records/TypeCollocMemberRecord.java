/*
 * This file is generated by jOOQ.
*/
package eki.ekilex.data.db.udt.records;


import eki.ekilex.data.db.udt.TypeCollocMember;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UDTRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TypeCollocMemberRecord extends UDTRecordImpl<TypeCollocMemberRecord> implements Record7<Long, Long, String, String, String, Integer, BigDecimal> {

    private static final long serialVersionUID = -1190576362;

    /**
     * Setter for <code>public.type_colloc_member.lexeme_id</code>.
     */
    public void setLexemeId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.type_colloc_member.lexeme_id</code>.
     */
    public Long getLexemeId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.type_colloc_member.word_id</code>.
     */
    public void setWordId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.type_colloc_member.word_id</code>.
     */
    public Long getWordId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.type_colloc_member.word</code>.
     */
    public void setWord(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.type_colloc_member.word</code>.
     */
    public String getWord() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.type_colloc_member.form</code>.
     */
    public void setForm(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.type_colloc_member.form</code>.
     */
    public String getForm() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.type_colloc_member.conjunct</code>.
     */
    public void setConjunct(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.type_colloc_member.conjunct</code>.
     */
    public String getConjunct() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.type_colloc_member.homonym_nr</code>.
     */
    public void setHomonymNr(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.type_colloc_member.homonym_nr</code>.
     */
    public Integer getHomonymNr() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>public.type_colloc_member.weight</code>.
     */
    public void setWeight(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.type_colloc_member.weight</code>.
     */
    public BigDecimal getWeight() {
        return (BigDecimal) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, Long, String, String, String, Integer, BigDecimal> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, Long, String, String, String, Integer, BigDecimal> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TypeCollocMember.LEXEME_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return TypeCollocMember.WORD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TypeCollocMember.WORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TypeCollocMember.FORM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TypeCollocMember.CONJUNCT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return TypeCollocMember.HOMONYM_NR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field7() {
        return TypeCollocMember.WEIGHT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getLexemeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getWordId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getWord();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getForm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getConjunct();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getHomonymNr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component7() {
        return getWeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getLexemeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getWordId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getWord();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getForm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getConjunct();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getHomonymNr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value7() {
        return getWeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeCollocMemberRecord value1(Long value) {
        setLexemeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeCollocMemberRecord value2(Long value) {
        setWordId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeCollocMemberRecord value3(String value) {
        setWord(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeCollocMemberRecord value4(String value) {
        setForm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeCollocMemberRecord value5(String value) {
        setConjunct(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeCollocMemberRecord value6(Integer value) {
        setHomonymNr(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeCollocMemberRecord value7(BigDecimal value) {
        setWeight(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeCollocMemberRecord values(Long value1, Long value2, String value3, String value4, String value5, Integer value6, BigDecimal value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TypeCollocMemberRecord
     */
    public TypeCollocMemberRecord() {
        super(TypeCollocMember.TYPE_COLLOC_MEMBER);
    }

    /**
     * Create a detached, initialised TypeCollocMemberRecord
     */
    public TypeCollocMemberRecord(Long lexemeId, Long wordId, String word, String form, String conjunct, Integer homonymNr, BigDecimal weight) {
        super(TypeCollocMember.TYPE_COLLOC_MEMBER);

        set(0, lexemeId);
        set(1, wordId);
        set(2, word);
        set(3, form);
        set(4, conjunct);
        set(5, homonymNr);
        set(6, weight);
    }
}
