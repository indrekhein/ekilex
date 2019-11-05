package eki.ekilex.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.util.UriUtils;

import eki.ekilex.constant.SystemConstant;
import eki.ekilex.constant.WebConstant;
import eki.ekilex.data.Word;
import eki.ekilex.data.WordDetails;
import eki.ekilex.data.WordLexeme;
import eki.ekilex.service.CompositionService;
import eki.ekilex.service.LexSearchService;
import eki.ekilex.service.LookupService;
import eki.ekilex.web.util.SearchHelper;
import com.fasterxml.jackson.databind.ObjectMapper;

@ConditionalOnWebApplication
@Controller
@SessionAttributes(WebConstant.SESSION_BEAN)
public class LexEditController extends AbstractPageController implements SystemConstant {

	private static final Logger logger = LoggerFactory.getLogger(LexEditController.class);

	@Autowired
	private LexSearchService lexSearchService;

	@Autowired
	private SearchHelper searchHelper;

	@Autowired
	private CompositionService compositionService;

	@Autowired
	private LookupService lookupService;

	@RequestMapping(LEX_JOIN_URI + "/{targetLexemeId}")
	public String search(@PathVariable("targetLexemeId") Long targetLexemeId, @RequestParam(name = "searchFilter", required = false) String searchFilter,
			Model model) {

		List<String> userPreferredDatasetCodes = getUserPreferredDatasetCodes();
		Long userId = userService.getAuthenticatedUser().getId();

		WordLexeme targetLexeme = lexSearchService.getWordLexeme(targetLexemeId);
		Long sourceLexemeMeaningId = targetLexeme.getMeaningId();
		String targetLexemeWord = targetLexeme.getWords()[0];
		if (searchFilter == null) {
			searchFilter = targetLexemeWord;
		}

		Optional<Integer> wordHomonymNumber;
		if (StringUtils.equals(searchFilter, targetLexemeWord)) {
			Integer sourceHomonymNumber = targetLexeme.getWordHomonymNumber();
			wordHomonymNumber = Optional.of(sourceHomonymNumber);
		} else {
			wordHomonymNumber = Optional.empty();
		}

		List<WordLexeme> sourceLexemes = lookupService
				.getWordLexemesOfJoinCandidates(searchFilter, userPreferredDatasetCodes, wordHomonymNumber, sourceLexemeMeaningId, userId);

		model.addAttribute("targetLexeme", targetLexeme);
		model.addAttribute("searchFilter", searchFilter);
		model.addAttribute("sourceLexemes", sourceLexemes);

		return LEX_JOIN_PAGE;
	}

	@PostMapping(VALIDATE_LEX_JOIN_URI)
	@ResponseBody
	public String validateJoin(@RequestParam("targetLexemeId") Long targetLexemeId, @RequestParam("sourceLexemeIds") List<Long> sourceLexemeIds)
			throws Exception {

		Map<String, String> response = new HashMap<>();

		List<Long> meaningIds = new ArrayList<>();
		Long targeLexemeMeaningId = lookupService.getMeaningId(targetLexemeId);
		meaningIds.add(targeLexemeMeaningId);
		sourceLexemeIds.forEach(lexemeId -> {
			Long meaningId = lookupService.getMeaningId(lexemeId);
			meaningIds.add(meaningId);
		});
		Map<String, Integer[]> invalidWords = lookupService.getMeaningsWordsWithMultipleHomonymNumbers(meaningIds);

		if (MapUtils.isNotEmpty(invalidWords)) {
			String message = "Tähendusi ei saa ühendada, sest ühendatavatel tähendustel on järgnevad samakujulised, aga erineva homonüüminumbriga keelendid:";

			Iterator<Map.Entry<String, Integer[]>> wordIterator = invalidWords.entrySet().iterator();
			while (wordIterator.hasNext()) {
				String wordValue = wordIterator.next().getKey();
				message += " " + wordValue;
				wordIterator.remove();
				if (wordIterator.hasNext()) {
					message += ",";
				} else {
					message += ".";
				}
			}

			message += " Palun ühendage enne tähenduste ühendamist need homonüümid.";
			response.put("status", "invalid");
			response.put("message", message);
		} else {
			response.put("status", "valid");
		}
		ObjectMapper jsonMapper = new ObjectMapper();
		return jsonMapper.writeValueAsString(response);
	}

	@PostMapping(LEX_JOIN_URI)
	public String join(@RequestParam("targetLexemeId") Long targetLexemeId, @RequestParam("sourceLexemeIds") List<Long> sourceLexemeIds) {

		compositionService.joinLexemes(targetLexemeId, sourceLexemeIds);

		WordLexeme lexeme = lexSearchService.getWordLexeme(targetLexemeId);
		List<String> datasets = getUserPreferredDatasetCodes();
		String firstWordValue = lexeme.getWords()[0];
		String searchUri = searchHelper.composeSearchUri(datasets, firstWordValue);

		return "redirect:" + LEX_SEARCH_URI + searchUri;
	}

	@GetMapping("/lexseparate/{lexemeId}")
	public String separate(@PathVariable("lexemeId") Long lexemeId) {

		WordLexeme lexeme = lexSearchService.getWordLexeme(lexemeId);
		compositionService.separateLexemeMeanings(lexemeId);

		List<String> datasets = getUserPreferredDatasetCodes();
		String firstWordValue = lexeme.getWords()[0];
		String searchUri = searchHelper.composeSearchUri(datasets, firstWordValue);

		return "redirect:" + LEX_SEARCH_URI + searchUri;
	}

	@ResponseBody
	@PostMapping("/duplicatelexeme/{lexemeId}")
	public String duplicateLexemeAndMeaning(@PathVariable("lexemeId") Long lexemeId) throws Exception {

		String userName = userService.getAuthenticatedUser().getName();
		List<Long> clonedLexemeIds = new ArrayList<>();
		try {
			clonedLexemeIds = compositionService.duplicateLexemeAndMeaningWithSameDatasetLexemes(lexemeId, userName);
		} catch (Exception ignore) {
			logger.error("", ignore);
		}

		Map<String, String> response = new HashMap<>();
		if (CollectionUtils.isNotEmpty(clonedLexemeIds)) {
			response.put("message", "Lekseemi duplikaat lisatud");
			response.put("status", "ok");
		} else {
			response.put("message", "Duplikaadi lisamine ebaõnnestus");
			response.put("status", "error");
		}

		ObjectMapper jsonMapper = new ObjectMapper();
		return jsonMapper.writeValueAsString(response);
	}

	@ResponseBody
	@PostMapping("/duplicateemptylexeme/{lexemeId}")
	public String duplicateEmptyLexemeAndMeaning(@PathVariable("lexemeId") Long lexemeId) throws Exception {

		String userName = userService.getAuthenticatedUser().getName();
		compositionService.duplicateEmptyLexemeAndMeaning(lexemeId, userName);

		Map<String, String> response = new HashMap<>();
		response.put("message", "Uus tähendus loodud");
		response.put("status", "ok");

		ObjectMapper jsonMapper = new ObjectMapper();
		return jsonMapper.writeValueAsString(response);
	}

	@GetMapping(WORD_JOIN_URI)
	public String showWordJoin(@RequestParam("wordId") Long wordId, Model model) {

		Long userId = userService.getAuthenticatedUser().getId();
		List<String> userPermDatasetCodes = permissionService.getUserPermDatasetCodes(userId);
		List<String> userPreferredDatasetCodes = getUserPreferredDatasetCodes();
		WordDetails firstWordDetails = lookupService.getWordJoinDetails(wordId);
		Word firstWord = firstWordDetails.getWord();
		String firstWordValue = firstWord.getValue();

		String encodedWordValue = UriUtils.encode(firstWordValue, UTF_8);
		String backUrl = WORD_VALUE_BACK_URI + "/" + encodedWordValue + "/" + RETURN_PAGE_LEX_SEARCH;
		List<WordDetails> wordDetailsList = lookupService
				.getWordDetailsOfJoinCandidates(firstWordValue, wordId, userPreferredDatasetCodes, userPermDatasetCodes);

		model.addAttribute("firstWordDetails", firstWordDetails);
		model.addAttribute("wordDetailsList", wordDetailsList);
		model.addAttribute("backUrl", backUrl);
		return WORD_JOIN_PAGE;
	}

	@PostMapping(WORD_JOIN_URI)
	public String joinWords(@RequestParam("targetWordId") Long targetWordId, @RequestParam("sourceWordIds") List<Long> sourceWordIds,
			@RequestParam("backUrl") String backUrl) {

		compositionService.joinWords(targetWordId, sourceWordIds);
		return "redirect:" + backUrl;
	}

}
