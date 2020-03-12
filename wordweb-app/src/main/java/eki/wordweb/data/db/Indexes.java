/*
 * This file is generated by jOOQ.
 */
package eki.wordweb.data.db;


import eki.wordweb.data.db.tables.LexicalDecisionData;
import eki.wordweb.data.db.tables.LexicalDecisionResult;
import eki.wordweb.data.db.tables.MviewWwClassifier;
import eki.wordweb.data.db.tables.MviewWwCollocation;
import eki.wordweb.data.db.tables.MviewWwDefinitionSourceLink;
import eki.wordweb.data.db.tables.MviewWwForm;
import eki.wordweb.data.db.tables.MviewWwLexeme;
import eki.wordweb.data.db.tables.MviewWwLexemeFreeformSourceLink;
import eki.wordweb.data.db.tables.MviewWwLexemeRelation;
import eki.wordweb.data.db.tables.MviewWwLexemeSourceLink;
import eki.wordweb.data.db.tables.MviewWwMeaning;
import eki.wordweb.data.db.tables.MviewWwMeaningFreeformSourceLink;
import eki.wordweb.data.db.tables.MviewWwMeaningRelation;
import eki.wordweb.data.db.tables.MviewWwWord;
import eki.wordweb.data.db.tables.MviewWwWordEtymSourceLink;
import eki.wordweb.data.db.tables.MviewWwWordEtymology;
import eki.wordweb.data.db.tables.MviewWwWordRelation;
import eki.wordweb.data.db.tables.MviewWwWordSearch;
import eki.wordweb.data.db.tables.SimilarityJudgementData;
import eki.wordweb.data.db.tables.SimilarityJudgementResult;

import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>public</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index LEXICAL_DECISION_DATA_LANG_IDX = Indexes0.LEXICAL_DECISION_DATA_LANG_IDX;
    public static final Index LEXICAL_DECISION_DATA_PKEY = Indexes0.LEXICAL_DECISION_DATA_PKEY;
    public static final Index LEXICAL_DECISION_RESULT_DATA_ID_IDX = Indexes0.LEXICAL_DECISION_RESULT_DATA_ID_IDX;
    public static final Index LEXICAL_DECISION_RESULT_PKEY = Indexes0.LEXICAL_DECISION_RESULT_PKEY;
    public static final Index MVIEW_WW_CLASSIFIER_NAME_CODE_LANG_TYPE_IDX = Indexes0.MVIEW_WW_CLASSIFIER_NAME_CODE_LANG_TYPE_IDX;
    public static final Index MVIEW_WW_CLASSIFIER_NAME_ORIGIN_CODE_LANG_TYPE_IDX = Indexes0.MVIEW_WW_CLASSIFIER_NAME_ORIGIN_CODE_LANG_TYPE_IDX;
    public static final Index MVIEW_WW_COLLOCATION_COMPLEXITY_IDX = Indexes0.MVIEW_WW_COLLOCATION_COMPLEXITY_IDX;
    public static final Index MVIEW_WW_COLLOCATION_LEXEME_ID_IDX = Indexes0.MVIEW_WW_COLLOCATION_LEXEME_ID_IDX;
    public static final Index MVIEW_WW_COLLOCATION_WORD_ID_IDX = Indexes0.MVIEW_WW_COLLOCATION_WORD_ID_IDX;
    public static final Index MVIEW_WW_DEFINITION_SOURCE_LINK_MEANING_ID_IDX = Indexes0.MVIEW_WW_DEFINITION_SOURCE_LINK_MEANING_ID_IDX;
    public static final Index MVIEW_WW_FORM_DISPLAY_LEVEL_IDX = Indexes0.MVIEW_WW_FORM_DISPLAY_LEVEL_IDX;
    public static final Index MVIEW_WW_FORM_LANG_IDX = Indexes0.MVIEW_WW_FORM_LANG_IDX;
    public static final Index MVIEW_WW_FORM_MODE_IDX = Indexes0.MVIEW_WW_FORM_MODE_IDX;
    public static final Index MVIEW_WW_FORM_VALUE_IDX = Indexes0.MVIEW_WW_FORM_VALUE_IDX;
    public static final Index MVIEW_WW_FORM_WORD_ID_IDX = Indexes0.MVIEW_WW_FORM_WORD_ID_IDX;
    public static final Index MVIEW_WW_FORM_WORD_IDX = Indexes0.MVIEW_WW_FORM_WORD_IDX;
    public static final Index MVIEW_WW_LEXEME_COMPLEXITY_IDX = Indexes0.MVIEW_WW_LEXEME_COMPLEXITY_IDX;
    public static final Index MVIEW_WW_LEXEME_DATASET_CODE_IDX = Indexes0.MVIEW_WW_LEXEME_DATASET_CODE_IDX;
    public static final Index MVIEW_WW_LEXEME_DATASET_TYPE_IDX = Indexes0.MVIEW_WW_LEXEME_DATASET_TYPE_IDX;
    public static final Index MVIEW_WW_LEXEME_LEXEME_ID_IDX = Indexes0.MVIEW_WW_LEXEME_LEXEME_ID_IDX;
    public static final Index MVIEW_WW_LEXEME_MEANING_ID_IDX = Indexes0.MVIEW_WW_LEXEME_MEANING_ID_IDX;
    public static final Index MVIEW_WW_LEXEME_WORD_ID_IDX = Indexes0.MVIEW_WW_LEXEME_WORD_ID_IDX;
    public static final Index MVIEW_WW_LEXEME_FREEFORM_SOURCE_LINK_WORD_ID_IDX = Indexes0.MVIEW_WW_LEXEME_FREEFORM_SOURCE_LINK_WORD_ID_IDX;
    public static final Index MVIEW_WW_LEXEME_RELATION_LEXEME_ID_IDX = Indexes0.MVIEW_WW_LEXEME_RELATION_LEXEME_ID_IDX;
    public static final Index MVIEW_WW_LEXEME_SOURCE_LINK_WORD_ID_IDX = Indexes0.MVIEW_WW_LEXEME_SOURCE_LINK_WORD_ID_IDX;
    public static final Index MVIEW_WW_MEANING_MEANING_ID_IDX = Indexes0.MVIEW_WW_MEANING_MEANING_ID_IDX;
    public static final Index MVIEW_WW_MEANING_FREEFORM_SOURCE_LINK_WORD_ID_IDX = Indexes0.MVIEW_WW_MEANING_FREEFORM_SOURCE_LINK_WORD_ID_IDX;
    public static final Index MVIEW_WW_MEANING_RELATION_MEANING_ID_IDX = Indexes0.MVIEW_WW_MEANING_RELATION_MEANING_ID_IDX;
    public static final Index MVIEW_WW_WORD_DATASET_CODES_GIN_IDX = Indexes0.MVIEW_WW_WORD_DATASET_CODES_GIN_IDX;
    public static final Index MVIEW_WW_WORD_LANG_IDX = Indexes0.MVIEW_WW_WORD_LANG_IDX;
    public static final Index MVIEW_WW_WORD_LEX_DATASET_EXISTS_IDX = Indexes0.MVIEW_WW_WORD_LEX_DATASET_EXISTS_IDX;
    public static final Index MVIEW_WW_WORD_TERM_DATASET_EXISTS_IDX = Indexes0.MVIEW_WW_WORD_TERM_DATASET_EXISTS_IDX;
    public static final Index MVIEW_WW_WORD_VALUE_IDX = Indexes0.MVIEW_WW_WORD_VALUE_IDX;
    public static final Index MVIEW_WW_WORD_VALUE_PREFIX_IDX = Indexes0.MVIEW_WW_WORD_VALUE_PREFIX_IDX;
    public static final Index MVIEW_WW_WORD_WORD_ID_IDX = Indexes0.MVIEW_WW_WORD_WORD_ID_IDX;
    public static final Index MVIEW_WW_WORD_ETYM_SOURCE_LINK_WORD_ID_IDX = Indexes0.MVIEW_WW_WORD_ETYM_SOURCE_LINK_WORD_ID_IDX;
    public static final Index MVIEW_WW_WORD_ETYMOLOGY_WORD_ID_IDX = Indexes0.MVIEW_WW_WORD_ETYMOLOGY_WORD_ID_IDX;
    public static final Index MVIEW_WW_WORD_RELATION_WORD_ID_IDX = Indexes0.MVIEW_WW_WORD_RELATION_WORD_ID_IDX;
    public static final Index MVIEW_WW_WORD_SEARCH_CRIT_IDX = Indexes0.MVIEW_WW_WORD_SEARCH_CRIT_IDX;
    public static final Index MVIEW_WW_WORD_SEARCH_CRIT_PREFIX_IDX = Indexes0.MVIEW_WW_WORD_SEARCH_CRIT_PREFIX_IDX;
    public static final Index MVIEW_WW_WORD_SEARCH_SGROUP_IDX = Indexes0.MVIEW_WW_WORD_SEARCH_SGROUP_IDX;
    public static final Index MVIEW_WW_WORD_SEARCH_SIMPLE_EXISTS_IDX = Indexes0.MVIEW_WW_WORD_SEARCH_SIMPLE_EXISTS_IDX;
    public static final Index MVIEW_WW_WORD_SEARCH_UNACRIT_TRI_IDX = Indexes0.MVIEW_WW_WORD_SEARCH_UNACRIT_TRI_IDX;
    public static final Index SIMILARITY_JUDGEMENT_DATA_DATASET_CODE_IDX = Indexes0.SIMILARITY_JUDGEMENT_DATA_DATASET_CODE_IDX;
    public static final Index SIMILARITY_JUDGEMENT_DATA_LANG_IDX = Indexes0.SIMILARITY_JUDGEMENT_DATA_LANG_IDX;
    public static final Index SIMILARITY_JUDGEMENT_DATA_MEANING_ID_IDX = Indexes0.SIMILARITY_JUDGEMENT_DATA_MEANING_ID_IDX;
    public static final Index SIMILARITY_JUDGEMENT_DATA_PKEY = Indexes0.SIMILARITY_JUDGEMENT_DATA_PKEY;
    public static final Index SIMILARITY_JUDGEMENT_DATA_WORD_IDX = Indexes0.SIMILARITY_JUDGEMENT_DATA_WORD_IDX;
    public static final Index SIMILARITY_JUDGEMENT_RESULT_GAME_KEY_IDX = Indexes0.SIMILARITY_JUDGEMENT_RESULT_GAME_KEY_IDX;
    public static final Index SIMILARITY_JUDGEMENT_RESULT_PAIR11_DATA_ID_IDX = Indexes0.SIMILARITY_JUDGEMENT_RESULT_PAIR11_DATA_ID_IDX;
    public static final Index SIMILARITY_JUDGEMENT_RESULT_PAIR12_DATA_ID_IDX = Indexes0.SIMILARITY_JUDGEMENT_RESULT_PAIR12_DATA_ID_IDX;
    public static final Index SIMILARITY_JUDGEMENT_RESULT_PAIR21_DATA_ID_IDX = Indexes0.SIMILARITY_JUDGEMENT_RESULT_PAIR21_DATA_ID_IDX;
    public static final Index SIMILARITY_JUDGEMENT_RESULT_PAIR22_DATA_ID_IDX = Indexes0.SIMILARITY_JUDGEMENT_RESULT_PAIR22_DATA_ID_IDX;
    public static final Index SIMILARITY_JUDGEMENT_RESULT_PKEY = Indexes0.SIMILARITY_JUDGEMENT_RESULT_PKEY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index LEXICAL_DECISION_DATA_LANG_IDX = Internal.createIndex("lexical_decision_data_lang_idx", LexicalDecisionData.LEXICAL_DECISION_DATA, new OrderField[] { LexicalDecisionData.LEXICAL_DECISION_DATA.LANG }, false);
        public static Index LEXICAL_DECISION_DATA_PKEY = Internal.createIndex("lexical_decision_data_pkey", LexicalDecisionData.LEXICAL_DECISION_DATA, new OrderField[] { LexicalDecisionData.LEXICAL_DECISION_DATA.ID }, true);
        public static Index LEXICAL_DECISION_RESULT_DATA_ID_IDX = Internal.createIndex("lexical_decision_result_data_id_idx", LexicalDecisionResult.LEXICAL_DECISION_RESULT, new OrderField[] { LexicalDecisionResult.LEXICAL_DECISION_RESULT.DATA_ID }, false);
        public static Index LEXICAL_DECISION_RESULT_PKEY = Internal.createIndex("lexical_decision_result_pkey", LexicalDecisionResult.LEXICAL_DECISION_RESULT, new OrderField[] { LexicalDecisionResult.LEXICAL_DECISION_RESULT.ID }, true);
        public static Index MVIEW_WW_CLASSIFIER_NAME_CODE_LANG_TYPE_IDX = Internal.createIndex("mview_ww_classifier_name_code_lang_type_idx", MviewWwClassifier.MVIEW_WW_CLASSIFIER, new OrderField[] { MviewWwClassifier.MVIEW_WW_CLASSIFIER.NAME, MviewWwClassifier.MVIEW_WW_CLASSIFIER.CODE, MviewWwClassifier.MVIEW_WW_CLASSIFIER.LANG, MviewWwClassifier.MVIEW_WW_CLASSIFIER.TYPE }, false);
        public static Index MVIEW_WW_CLASSIFIER_NAME_ORIGIN_CODE_LANG_TYPE_IDX = Internal.createIndex("mview_ww_classifier_name_origin_code_lang_type_idx", MviewWwClassifier.MVIEW_WW_CLASSIFIER, new OrderField[] { MviewWwClassifier.MVIEW_WW_CLASSIFIER.NAME, MviewWwClassifier.MVIEW_WW_CLASSIFIER.ORIGIN, MviewWwClassifier.MVIEW_WW_CLASSIFIER.CODE, MviewWwClassifier.MVIEW_WW_CLASSIFIER.LANG, MviewWwClassifier.MVIEW_WW_CLASSIFIER.TYPE }, false);
        public static Index MVIEW_WW_COLLOCATION_COMPLEXITY_IDX = Internal.createIndex("mview_ww_collocation_complexity_idx", MviewWwCollocation.MVIEW_WW_COLLOCATION, new OrderField[] { MviewWwCollocation.MVIEW_WW_COLLOCATION.COMPLEXITY }, false);
        public static Index MVIEW_WW_COLLOCATION_LEXEME_ID_IDX = Internal.createIndex("mview_ww_collocation_lexeme_id_idx", MviewWwCollocation.MVIEW_WW_COLLOCATION, new OrderField[] { MviewWwCollocation.MVIEW_WW_COLLOCATION.LEXEME_ID }, false);
        public static Index MVIEW_WW_COLLOCATION_WORD_ID_IDX = Internal.createIndex("mview_ww_collocation_word_id_idx", MviewWwCollocation.MVIEW_WW_COLLOCATION, new OrderField[] { MviewWwCollocation.MVIEW_WW_COLLOCATION.WORD_ID }, false);
        public static Index MVIEW_WW_DEFINITION_SOURCE_LINK_MEANING_ID_IDX = Internal.createIndex("mview_ww_definition_source_link_meaning_id_idx", MviewWwDefinitionSourceLink.MVIEW_WW_DEFINITION_SOURCE_LINK, new OrderField[] { MviewWwDefinitionSourceLink.MVIEW_WW_DEFINITION_SOURCE_LINK.MEANING_ID }, false);
        public static Index MVIEW_WW_FORM_DISPLAY_LEVEL_IDX = Internal.createIndex("mview_ww_form_display_level_idx", MviewWwForm.MVIEW_WW_FORM, new OrderField[] { MviewWwForm.MVIEW_WW_FORM.DISPLAY_LEVEL }, false);
        public static Index MVIEW_WW_FORM_LANG_IDX = Internal.createIndex("mview_ww_form_lang_idx", MviewWwForm.MVIEW_WW_FORM, new OrderField[] { MviewWwForm.MVIEW_WW_FORM.LANG }, false);
        public static Index MVIEW_WW_FORM_MODE_IDX = Internal.createIndex("mview_ww_form_mode_idx", MviewWwForm.MVIEW_WW_FORM, new OrderField[] { MviewWwForm.MVIEW_WW_FORM.MODE }, false);
        public static Index MVIEW_WW_FORM_VALUE_IDX = Internal.createIndex("mview_ww_form_value_idx", MviewWwForm.MVIEW_WW_FORM, new OrderField[] { MviewWwForm.MVIEW_WW_FORM.FORM }, false);
        public static Index MVIEW_WW_FORM_WORD_ID_IDX = Internal.createIndex("mview_ww_form_word_id_idx", MviewWwForm.MVIEW_WW_FORM, new OrderField[] { MviewWwForm.MVIEW_WW_FORM.WORD_ID }, false);
        public static Index MVIEW_WW_FORM_WORD_IDX = Internal.createIndex("mview_ww_form_word_idx", MviewWwForm.MVIEW_WW_FORM, new OrderField[] { MviewWwForm.MVIEW_WW_FORM.WORD }, false);
        public static Index MVIEW_WW_LEXEME_COMPLEXITY_IDX = Internal.createIndex("mview_ww_lexeme_complexity_idx", MviewWwLexeme.MVIEW_WW_LEXEME, new OrderField[] { MviewWwLexeme.MVIEW_WW_LEXEME.COMPLEXITY }, false);
        public static Index MVIEW_WW_LEXEME_DATASET_CODE_IDX = Internal.createIndex("mview_ww_lexeme_dataset_code_idx", MviewWwLexeme.MVIEW_WW_LEXEME, new OrderField[] { MviewWwLexeme.MVIEW_WW_LEXEME.DATASET_CODE }, false);
        public static Index MVIEW_WW_LEXEME_DATASET_TYPE_IDX = Internal.createIndex("mview_ww_lexeme_dataset_type_idx", MviewWwLexeme.MVIEW_WW_LEXEME, new OrderField[] { MviewWwLexeme.MVIEW_WW_LEXEME.DATASET_TYPE }, false);
        public static Index MVIEW_WW_LEXEME_LEXEME_ID_IDX = Internal.createIndex("mview_ww_lexeme_lexeme_id_idx", MviewWwLexeme.MVIEW_WW_LEXEME, new OrderField[] { MviewWwLexeme.MVIEW_WW_LEXEME.LEXEME_ID }, false);
        public static Index MVIEW_WW_LEXEME_MEANING_ID_IDX = Internal.createIndex("mview_ww_lexeme_meaning_id_idx", MviewWwLexeme.MVIEW_WW_LEXEME, new OrderField[] { MviewWwLexeme.MVIEW_WW_LEXEME.MEANING_ID }, false);
        public static Index MVIEW_WW_LEXEME_WORD_ID_IDX = Internal.createIndex("mview_ww_lexeme_word_id_idx", MviewWwLexeme.MVIEW_WW_LEXEME, new OrderField[] { MviewWwLexeme.MVIEW_WW_LEXEME.WORD_ID }, false);
        public static Index MVIEW_WW_LEXEME_FREEFORM_SOURCE_LINK_WORD_ID_IDX = Internal.createIndex("mview_ww_lexeme_freeform_source_link_word_id_idx", MviewWwLexemeFreeformSourceLink.MVIEW_WW_LEXEME_FREEFORM_SOURCE_LINK, new OrderField[] { MviewWwLexemeFreeformSourceLink.MVIEW_WW_LEXEME_FREEFORM_SOURCE_LINK.LEXEME_ID }, false);
        public static Index MVIEW_WW_LEXEME_RELATION_LEXEME_ID_IDX = Internal.createIndex("mview_ww_lexeme_relation_lexeme_id_idx", MviewWwLexemeRelation.MVIEW_WW_LEXEME_RELATION, new OrderField[] { MviewWwLexemeRelation.MVIEW_WW_LEXEME_RELATION.LEXEME_ID }, false);
        public static Index MVIEW_WW_LEXEME_SOURCE_LINK_WORD_ID_IDX = Internal.createIndex("mview_ww_lexeme_source_link_word_id_idx", MviewWwLexemeSourceLink.MVIEW_WW_LEXEME_SOURCE_LINK, new OrderField[] { MviewWwLexemeSourceLink.MVIEW_WW_LEXEME_SOURCE_LINK.LEXEME_ID }, false);
        public static Index MVIEW_WW_MEANING_MEANING_ID_IDX = Internal.createIndex("mview_ww_meaning_meaning_id_idx", MviewWwMeaning.MVIEW_WW_MEANING, new OrderField[] { MviewWwMeaning.MVIEW_WW_MEANING.MEANING_ID }, false);
        public static Index MVIEW_WW_MEANING_FREEFORM_SOURCE_LINK_WORD_ID_IDX = Internal.createIndex("mview_ww_meaning_freeform_source_link_word_id_idx", MviewWwMeaningFreeformSourceLink.MVIEW_WW_MEANING_FREEFORM_SOURCE_LINK, new OrderField[] { MviewWwMeaningFreeformSourceLink.MVIEW_WW_MEANING_FREEFORM_SOURCE_LINK.MEANING_ID }, false);
        public static Index MVIEW_WW_MEANING_RELATION_MEANING_ID_IDX = Internal.createIndex("mview_ww_meaning_relation_meaning_id_idx", MviewWwMeaningRelation.MVIEW_WW_MEANING_RELATION, new OrderField[] { MviewWwMeaningRelation.MVIEW_WW_MEANING_RELATION.MEANING_ID }, false);
        public static Index MVIEW_WW_WORD_DATASET_CODES_GIN_IDX = Internal.createIndex("mview_ww_word_dataset_codes_gin_idx", MviewWwWord.MVIEW_WW_WORD, new OrderField[] { MviewWwWord.MVIEW_WW_WORD.DATASET_CODES }, false);
        public static Index MVIEW_WW_WORD_LANG_IDX = Internal.createIndex("mview_ww_word_lang_idx", MviewWwWord.MVIEW_WW_WORD, new OrderField[] { MviewWwWord.MVIEW_WW_WORD.LANG }, false);
        public static Index MVIEW_WW_WORD_LEX_DATASET_EXISTS_IDX = Internal.createIndex("mview_ww_word_lex_dataset_exists_idx", MviewWwWord.MVIEW_WW_WORD, new OrderField[] { MviewWwWord.MVIEW_WW_WORD.LEX_DATASET_EXISTS }, false);
        public static Index MVIEW_WW_WORD_TERM_DATASET_EXISTS_IDX = Internal.createIndex("mview_ww_word_term_dataset_exists_idx", MviewWwWord.MVIEW_WW_WORD, new OrderField[] { MviewWwWord.MVIEW_WW_WORD.TERM_DATASET_EXISTS }, false);
        public static Index MVIEW_WW_WORD_VALUE_IDX = Internal.createIndex("mview_ww_word_value_idx", MviewWwWord.MVIEW_WW_WORD, new OrderField[] { MviewWwWord.MVIEW_WW_WORD.WORD }, false);
        public static Index MVIEW_WW_WORD_VALUE_PREFIX_IDX = Internal.createIndex("mview_ww_word_value_prefix_idx", MviewWwWord.MVIEW_WW_WORD, new OrderField[] { MviewWwWord.MVIEW_WW_WORD.WORD }, false);
        public static Index MVIEW_WW_WORD_WORD_ID_IDX = Internal.createIndex("mview_ww_word_word_id_idx", MviewWwWord.MVIEW_WW_WORD, new OrderField[] { MviewWwWord.MVIEW_WW_WORD.WORD_ID }, false);
        public static Index MVIEW_WW_WORD_ETYM_SOURCE_LINK_WORD_ID_IDX = Internal.createIndex("mview_ww_word_etym_source_link_word_id_idx", MviewWwWordEtymSourceLink.MVIEW_WW_WORD_ETYM_SOURCE_LINK, new OrderField[] { MviewWwWordEtymSourceLink.MVIEW_WW_WORD_ETYM_SOURCE_LINK.WORD_ID }, false);
        public static Index MVIEW_WW_WORD_ETYMOLOGY_WORD_ID_IDX = Internal.createIndex("mview_ww_word_etymology_word_id_idx", MviewWwWordEtymology.MVIEW_WW_WORD_ETYMOLOGY, new OrderField[] { MviewWwWordEtymology.MVIEW_WW_WORD_ETYMOLOGY.WORD_ID }, false);
        public static Index MVIEW_WW_WORD_RELATION_WORD_ID_IDX = Internal.createIndex("mview_ww_word_relation_word_id_idx", MviewWwWordRelation.MVIEW_WW_WORD_RELATION, new OrderField[] { MviewWwWordRelation.MVIEW_WW_WORD_RELATION.WORD_ID }, false);
        public static Index MVIEW_WW_WORD_SEARCH_CRIT_IDX = Internal.createIndex("mview_ww_word_search_crit_idx", MviewWwWordSearch.MVIEW_WW_WORD_SEARCH, new OrderField[] { MviewWwWordSearch.MVIEW_WW_WORD_SEARCH.CRIT }, false);
        public static Index MVIEW_WW_WORD_SEARCH_CRIT_PREFIX_IDX = Internal.createIndex("mview_ww_word_search_crit_prefix_idx", MviewWwWordSearch.MVIEW_WW_WORD_SEARCH, new OrderField[] { MviewWwWordSearch.MVIEW_WW_WORD_SEARCH.CRIT }, false);
        public static Index MVIEW_WW_WORD_SEARCH_SGROUP_IDX = Internal.createIndex("mview_ww_word_search_sgroup_idx", MviewWwWordSearch.MVIEW_WW_WORD_SEARCH, new OrderField[] { MviewWwWordSearch.MVIEW_WW_WORD_SEARCH.SGROUP }, false);
        public static Index MVIEW_WW_WORD_SEARCH_SIMPLE_EXISTS_IDX = Internal.createIndex("mview_ww_word_search_simple_exists_idx", MviewWwWordSearch.MVIEW_WW_WORD_SEARCH, new OrderField[] { MviewWwWordSearch.MVIEW_WW_WORD_SEARCH.SIMPLE_EXISTS }, false);
        public static Index MVIEW_WW_WORD_SEARCH_UNACRIT_TRI_IDX = Internal.createIndex("mview_ww_word_search_unacrit_tri_idx", MviewWwWordSearch.MVIEW_WW_WORD_SEARCH, new OrderField[] { MviewWwWordSearch.MVIEW_WW_WORD_SEARCH.UNACRIT }, false);
        public static Index SIMILARITY_JUDGEMENT_DATA_DATASET_CODE_IDX = Internal.createIndex("similarity_judgement_data_dataset_code_idx", SimilarityJudgementData.SIMILARITY_JUDGEMENT_DATA, new OrderField[] { SimilarityJudgementData.SIMILARITY_JUDGEMENT_DATA.DATASET_CODE }, false);
        public static Index SIMILARITY_JUDGEMENT_DATA_LANG_IDX = Internal.createIndex("similarity_judgement_data_lang_idx", SimilarityJudgementData.SIMILARITY_JUDGEMENT_DATA, new OrderField[] { SimilarityJudgementData.SIMILARITY_JUDGEMENT_DATA.LANG }, false);
        public static Index SIMILARITY_JUDGEMENT_DATA_MEANING_ID_IDX = Internal.createIndex("similarity_judgement_data_meaning_id_idx", SimilarityJudgementData.SIMILARITY_JUDGEMENT_DATA, new OrderField[] { SimilarityJudgementData.SIMILARITY_JUDGEMENT_DATA.MEANING_ID }, false);
        public static Index SIMILARITY_JUDGEMENT_DATA_PKEY = Internal.createIndex("similarity_judgement_data_pkey", SimilarityJudgementData.SIMILARITY_JUDGEMENT_DATA, new OrderField[] { SimilarityJudgementData.SIMILARITY_JUDGEMENT_DATA.ID }, true);
        public static Index SIMILARITY_JUDGEMENT_DATA_WORD_IDX = Internal.createIndex("similarity_judgement_data_word_idx", SimilarityJudgementData.SIMILARITY_JUDGEMENT_DATA, new OrderField[] { SimilarityJudgementData.SIMILARITY_JUDGEMENT_DATA.WORD }, false);
        public static Index SIMILARITY_JUDGEMENT_RESULT_GAME_KEY_IDX = Internal.createIndex("similarity_judgement_result_game_key_idx", SimilarityJudgementResult.SIMILARITY_JUDGEMENT_RESULT, new OrderField[] { SimilarityJudgementResult.SIMILARITY_JUDGEMENT_RESULT.GAME_KEY }, false);
        public static Index SIMILARITY_JUDGEMENT_RESULT_PAIR11_DATA_ID_IDX = Internal.createIndex("similarity_judgement_result_pair11_data_id_idx", SimilarityJudgementResult.SIMILARITY_JUDGEMENT_RESULT, new OrderField[] { SimilarityJudgementResult.SIMILARITY_JUDGEMENT_RESULT.PAIR11_DATA_ID }, false);
        public static Index SIMILARITY_JUDGEMENT_RESULT_PAIR12_DATA_ID_IDX = Internal.createIndex("similarity_judgement_result_pair12_data_id_idx", SimilarityJudgementResult.SIMILARITY_JUDGEMENT_RESULT, new OrderField[] { SimilarityJudgementResult.SIMILARITY_JUDGEMENT_RESULT.PAIR12_DATA_ID }, false);
        public static Index SIMILARITY_JUDGEMENT_RESULT_PAIR21_DATA_ID_IDX = Internal.createIndex("similarity_judgement_result_pair21_data_id_idx", SimilarityJudgementResult.SIMILARITY_JUDGEMENT_RESULT, new OrderField[] { SimilarityJudgementResult.SIMILARITY_JUDGEMENT_RESULT.PAIR21_DATA_ID }, false);
        public static Index SIMILARITY_JUDGEMENT_RESULT_PAIR22_DATA_ID_IDX = Internal.createIndex("similarity_judgement_result_pair22_data_id_idx", SimilarityJudgementResult.SIMILARITY_JUDGEMENT_RESULT, new OrderField[] { SimilarityJudgementResult.SIMILARITY_JUDGEMENT_RESULT.PAIR22_DATA_ID }, false);
        public static Index SIMILARITY_JUDGEMENT_RESULT_PKEY = Internal.createIndex("similarity_judgement_result_pkey", SimilarityJudgementResult.SIMILARITY_JUDGEMENT_RESULT, new OrderField[] { SimilarityJudgementResult.SIMILARITY_JUDGEMENT_RESULT.ID }, true);
    }
}
