/*
 * This file is generated by jOOQ.
 */
package eki.wordweb.data.db.tables.records;


import eki.wordweb.data.db.tables.MviewWwLexeme;
import eki.wordweb.data.db.udt.records.TypeFreeformRecord;
import eki.wordweb.data.db.udt.records.TypeLangComplexityRecord;
import eki.wordweb.data.db.udt.records.TypeMeaningWordRecord;
import eki.wordweb.data.db.udt.records.TypeUsageRecord;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record21;
import org.jooq.Row21;
import org.jooq.impl.TableRecordImpl;


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
public class MviewWwLexemeRecord extends TableRecordImpl<MviewWwLexemeRecord> implements Record21<Long, Long, Long, String, String, Integer, Integer, BigDecimal, String, Long, TypeLangComplexityRecord[], String[], String[], String[], TypeMeaningWordRecord[], String[], TypeFreeformRecord[], TypeFreeformRecord[], TypeFreeformRecord[], TypeUsageRecord[], String[]> {

    private static final long serialVersionUID = 232878070;

    /**
     * Setter for <code>public.mview_ww_lexeme.lexeme_id</code>.
     */
    public void setLexemeId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.mview_ww_lexeme.lexeme_id</code>.
     */
    public Long getLexemeId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.mview_ww_lexeme.word_id</code>.
     */
    public void setWordId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.mview_ww_lexeme.word_id</code>.
     */
    public Long getWordId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.mview_ww_lexeme.meaning_id</code>.
     */
    public void setMeaningId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.mview_ww_lexeme.meaning_id</code>.
     */
    public Long getMeaningId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>public.mview_ww_lexeme.dataset_type</code>.
     */
    public void setDatasetType(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.mview_ww_lexeme.dataset_type</code>.
     */
    public String getDatasetType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.mview_ww_lexeme.dataset_code</code>.
     */
    public void setDatasetCode(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.mview_ww_lexeme.dataset_code</code>.
     */
    public String getDatasetCode() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.mview_ww_lexeme.level1</code>.
     */
    public void setLevel1(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.mview_ww_lexeme.level1</code>.
     */
    public Integer getLevel1() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>public.mview_ww_lexeme.level2</code>.
     */
    public void setLevel2(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.mview_ww_lexeme.level2</code>.
     */
    public Integer getLevel2() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>public.mview_ww_lexeme.weight</code>.
     */
    public void setWeight(BigDecimal value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.mview_ww_lexeme.weight</code>.
     */
    public BigDecimal getWeight() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>public.mview_ww_lexeme.complexity</code>.
     */
    public void setComplexity(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.mview_ww_lexeme.complexity</code>.
     */
    public String getComplexity() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.mview_ww_lexeme.lex_order_by</code>.
     */
    public void setLexOrderBy(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.mview_ww_lexeme.lex_order_by</code>.
     */
    public Long getLexOrderBy() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>public.mview_ww_lexeme.lang_complexities</code>.
     */
    public void setLangComplexities(TypeLangComplexityRecord... value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.mview_ww_lexeme.lang_complexities</code>.
     */
    public TypeLangComplexityRecord[] getLangComplexities() {
        return (TypeLangComplexityRecord[]) get(10);
    }

    /**
     * Setter for <code>public.mview_ww_lexeme.register_codes</code>.
     */
    public void setRegisterCodes(String... value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.mview_ww_lexeme.register_codes</code>.
     */
    public String[] getRegisterCodes() {
        return (String[]) get(11);
    }

    /**
     * Setter for <code>public.mview_ww_lexeme.pos_codes</code>.
     */
    public void setPosCodes(String... value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.mview_ww_lexeme.pos_codes</code>.
     */
    public String[] getPosCodes() {
        return (String[]) get(12);
    }

    /**
     * Setter for <code>public.mview_ww_lexeme.deriv_codes</code>.
     */
    public void setDerivCodes(String... value) {
        set(13, value);
    }

    /**
     * Getter for <code>public.mview_ww_lexeme.deriv_codes</code>.
     */
    public String[] getDerivCodes() {
        return (String[]) get(13);
    }

    /**
     * Setter for <code>public.mview_ww_lexeme.meaning_words</code>.
     */
    public void setMeaningWords(TypeMeaningWordRecord... value) {
        set(14, value);
    }

    /**
     * Getter for <code>public.mview_ww_lexeme.meaning_words</code>.
     */
    public TypeMeaningWordRecord[] getMeaningWords() {
        return (TypeMeaningWordRecord[]) get(14);
    }

    /**
     * Setter for <code>public.mview_ww_lexeme.advice_notes</code>.
     */
    public void setAdviceNotes(String... value) {
        set(15, value);
    }

    /**
     * Getter for <code>public.mview_ww_lexeme.advice_notes</code>.
     */
    public String[] getAdviceNotes() {
        return (String[]) get(15);
    }

    /**
     * Setter for <code>public.mview_ww_lexeme.public_notes</code>.
     */
    public void setPublicNotes(TypeFreeformRecord... value) {
        set(16, value);
    }

    /**
     * Getter for <code>public.mview_ww_lexeme.public_notes</code>.
     */
    public TypeFreeformRecord[] getPublicNotes() {
        return (TypeFreeformRecord[]) get(16);
    }

    /**
     * Setter for <code>public.mview_ww_lexeme.grammars</code>.
     */
    public void setGrammars(TypeFreeformRecord... value) {
        set(17, value);
    }

    /**
     * Getter for <code>public.mview_ww_lexeme.grammars</code>.
     */
    public TypeFreeformRecord[] getGrammars() {
        return (TypeFreeformRecord[]) get(17);
    }

    /**
     * Setter for <code>public.mview_ww_lexeme.governments</code>.
     */
    public void setGovernments(TypeFreeformRecord... value) {
        set(18, value);
    }

    /**
     * Getter for <code>public.mview_ww_lexeme.governments</code>.
     */
    public TypeFreeformRecord[] getGovernments() {
        return (TypeFreeformRecord[]) get(18);
    }

    /**
     * Setter for <code>public.mview_ww_lexeme.usages</code>.
     */
    public void setUsages(TypeUsageRecord... value) {
        set(19, value);
    }

    /**
     * Getter for <code>public.mview_ww_lexeme.usages</code>.
     */
    public TypeUsageRecord[] getUsages() {
        return (TypeUsageRecord[]) get(19);
    }

    /**
     * Setter for <code>public.mview_ww_lexeme.od_lexeme_recommendations</code>.
     */
    public void setOdLexemeRecommendations(String... value) {
        set(20, value);
    }

    /**
     * Getter for <code>public.mview_ww_lexeme.od_lexeme_recommendations</code>.
     */
    public String[] getOdLexemeRecommendations() {
        return (String[]) get(20);
    }

    // -------------------------------------------------------------------------
    // Record21 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row21<Long, Long, Long, String, String, Integer, Integer, BigDecimal, String, Long, TypeLangComplexityRecord[], String[], String[], String[], TypeMeaningWordRecord[], String[], TypeFreeformRecord[], TypeFreeformRecord[], TypeFreeformRecord[], TypeUsageRecord[], String[]> fieldsRow() {
        return (Row21) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row21<Long, Long, Long, String, String, Integer, Integer, BigDecimal, String, Long, TypeLangComplexityRecord[], String[], String[], String[], TypeMeaningWordRecord[], String[], TypeFreeformRecord[], TypeFreeformRecord[], TypeFreeformRecord[], TypeUsageRecord[], String[]> valuesRow() {
        return (Row21) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return MviewWwLexeme.MVIEW_WW_LEXEME.LEXEME_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return MviewWwLexeme.MVIEW_WW_LEXEME.WORD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return MviewWwLexeme.MVIEW_WW_LEXEME.MEANING_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return MviewWwLexeme.MVIEW_WW_LEXEME.DATASET_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return MviewWwLexeme.MVIEW_WW_LEXEME.DATASET_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return MviewWwLexeme.MVIEW_WW_LEXEME.LEVEL1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return MviewWwLexeme.MVIEW_WW_LEXEME.LEVEL2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field8() {
        return MviewWwLexeme.MVIEW_WW_LEXEME.WEIGHT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return MviewWwLexeme.MVIEW_WW_LEXEME.COMPLEXITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field10() {
        return MviewWwLexeme.MVIEW_WW_LEXEME.LEX_ORDER_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<TypeLangComplexityRecord[]> field11() {
        return MviewWwLexeme.MVIEW_WW_LEXEME.LANG_COMPLEXITIES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field12() {
        return MviewWwLexeme.MVIEW_WW_LEXEME.REGISTER_CODES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field13() {
        return MviewWwLexeme.MVIEW_WW_LEXEME.POS_CODES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field14() {
        return MviewWwLexeme.MVIEW_WW_LEXEME.DERIV_CODES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<TypeMeaningWordRecord[]> field15() {
        return MviewWwLexeme.MVIEW_WW_LEXEME.MEANING_WORDS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field16() {
        return MviewWwLexeme.MVIEW_WW_LEXEME.ADVICE_NOTES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<TypeFreeformRecord[]> field17() {
        return MviewWwLexeme.MVIEW_WW_LEXEME.PUBLIC_NOTES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<TypeFreeformRecord[]> field18() {
        return MviewWwLexeme.MVIEW_WW_LEXEME.GRAMMARS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<TypeFreeformRecord[]> field19() {
        return MviewWwLexeme.MVIEW_WW_LEXEME.GOVERNMENTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<TypeUsageRecord[]> field20() {
        return MviewWwLexeme.MVIEW_WW_LEXEME.USAGES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field21() {
        return MviewWwLexeme.MVIEW_WW_LEXEME.OD_LEXEME_RECOMMENDATIONS;
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
    public Long component3() {
        return getMeaningId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getDatasetType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getDatasetCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getLevel1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getLevel2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component8() {
        return getWeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getComplexity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component10() {
        return getLexOrderBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeLangComplexityRecord[] component11() {
        return getLangComplexities();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] component12() {
        return getRegisterCodes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] component13() {
        return getPosCodes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] component14() {
        return getDerivCodes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeMeaningWordRecord[] component15() {
        return getMeaningWords();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] component16() {
        return getAdviceNotes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeFreeformRecord[] component17() {
        return getPublicNotes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeFreeformRecord[] component18() {
        return getGrammars();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeFreeformRecord[] component19() {
        return getGovernments();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeUsageRecord[] component20() {
        return getUsages();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] component21() {
        return getOdLexemeRecommendations();
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
    public Long value3() {
        return getMeaningId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getDatasetType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getDatasetCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getLevel1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getLevel2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value8() {
        return getWeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getComplexity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value10() {
        return getLexOrderBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeLangComplexityRecord[] value11() {
        return getLangComplexities();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value12() {
        return getRegisterCodes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value13() {
        return getPosCodes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value14() {
        return getDerivCodes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeMeaningWordRecord[] value15() {
        return getMeaningWords();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value16() {
        return getAdviceNotes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeFreeformRecord[] value17() {
        return getPublicNotes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeFreeformRecord[] value18() {
        return getGrammars();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeFreeformRecord[] value19() {
        return getGovernments();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeUsageRecord[] value20() {
        return getUsages();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value21() {
        return getOdLexemeRecommendations();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwLexemeRecord value1(Long value) {
        setLexemeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwLexemeRecord value2(Long value) {
        setWordId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwLexemeRecord value3(Long value) {
        setMeaningId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwLexemeRecord value4(String value) {
        setDatasetType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwLexemeRecord value5(String value) {
        setDatasetCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwLexemeRecord value6(Integer value) {
        setLevel1(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwLexemeRecord value7(Integer value) {
        setLevel2(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwLexemeRecord value8(BigDecimal value) {
        setWeight(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwLexemeRecord value9(String value) {
        setComplexity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwLexemeRecord value10(Long value) {
        setLexOrderBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwLexemeRecord value11(TypeLangComplexityRecord... value) {
        setLangComplexities(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwLexemeRecord value12(String... value) {
        setRegisterCodes(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwLexemeRecord value13(String... value) {
        setPosCodes(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwLexemeRecord value14(String... value) {
        setDerivCodes(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwLexemeRecord value15(TypeMeaningWordRecord... value) {
        setMeaningWords(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwLexemeRecord value16(String... value) {
        setAdviceNotes(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwLexemeRecord value17(TypeFreeformRecord... value) {
        setPublicNotes(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwLexemeRecord value18(TypeFreeformRecord... value) {
        setGrammars(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwLexemeRecord value19(TypeFreeformRecord... value) {
        setGovernments(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwLexemeRecord value20(TypeUsageRecord... value) {
        setUsages(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwLexemeRecord value21(String... value) {
        setOdLexemeRecommendations(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwLexemeRecord values(Long value1, Long value2, Long value3, String value4, String value5, Integer value6, Integer value7, BigDecimal value8, String value9, Long value10, TypeLangComplexityRecord[] value11, String[] value12, String[] value13, String[] value14, TypeMeaningWordRecord[] value15, String[] value16, TypeFreeformRecord[] value17, TypeFreeformRecord[] value18, TypeFreeformRecord[] value19, TypeUsageRecord[] value20, String[] value21) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MviewWwLexemeRecord
     */
    public MviewWwLexemeRecord() {
        super(MviewWwLexeme.MVIEW_WW_LEXEME);
    }

    /**
     * Create a detached, initialised MviewWwLexemeRecord
     */
    public MviewWwLexemeRecord(Long lexemeId, Long wordId, Long meaningId, String datasetType, String datasetCode, Integer level1, Integer level2, BigDecimal weight, String complexity, Long lexOrderBy, TypeLangComplexityRecord[] langComplexities, String[] registerCodes, String[] posCodes, String[] derivCodes, TypeMeaningWordRecord[] meaningWords, String[] adviceNotes, TypeFreeformRecord[] publicNotes, TypeFreeformRecord[] grammars, TypeFreeformRecord[] governments, TypeUsageRecord[] usages, String[] odLexemeRecommendations) {
        super(MviewWwLexeme.MVIEW_WW_LEXEME);

        set(0, lexemeId);
        set(1, wordId);
        set(2, meaningId);
        set(3, datasetType);
        set(4, datasetCode);
        set(5, level1);
        set(6, level2);
        set(7, weight);
        set(8, complexity);
        set(9, lexOrderBy);
        set(10, langComplexities);
        set(11, registerCodes);
        set(12, posCodes);
        set(13, derivCodes);
        set(14, meaningWords);
        set(15, adviceNotes);
        set(16, publicNotes);
        set(17, grammars);
        set(18, governments);
        set(19, usages);
        set(20, odLexemeRecommendations);
    }
}
