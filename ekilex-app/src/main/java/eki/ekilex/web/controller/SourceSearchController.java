package eki.ekilex.web.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import eki.ekilex.constant.SearchResultMode;
import eki.ekilex.data.DatasetPermission;
import eki.ekilex.data.EkiUser;
import eki.ekilex.data.SearchFilter;
import eki.ekilex.data.SearchUriData;
import eki.ekilex.data.Source;
import eki.ekilex.service.SourceService;

@ConditionalOnWebApplication
@Controller
public class SourceSearchController extends AbstractSearchController {

	private static final Logger logger = LoggerFactory.getLogger(SourceSearchController.class);

	private static final int AUTOCOMPLETE_MAX_RESULTS_LIMIT = 15;

	@Autowired
	private SourceService sourceService;

	@GetMapping(SOURCE_SEARCH_URI)
	public String initSearch(Model model) {

		initSearchForms(SOURCE_SEARCH_PAGE, model);
		return SOURCE_SEARCH_PAGE;
	}

	@PostMapping(SOURCE_SEARCH_URI)
	public String search(
			@RequestParam(name = "searchMode", required = false) String searchMode,
			@RequestParam(name = "simpleSearchFilter", required = false) String simpleSearchFilter,
			@ModelAttribute(name = "detailSearchFilter") SearchFilter detailSearchFilter) throws Exception {

		simpleSearchFilter = valueUtil.trimAndCleanAndRemoveHtmlAndLimit(simpleSearchFilter);
		formDataCleanup(SOURCE_SEARCH_PAGE, detailSearchFilter);

		if (StringUtils.isBlank(searchMode)) {
			searchMode = SEARCH_MODE_SIMPLE;
		}

		String roleDatasetCode = getDatasetCodeFromRole();
		List<String> roleDatasets = new ArrayList<>(Arrays.asList(roleDatasetCode));

		String searchUri = searchHelper.composeSearchUri(searchMode, roleDatasets, simpleSearchFilter, detailSearchFilter, null, null);

		return "redirect:" + SOURCE_SEARCH_URI + searchUri;
	}

	@GetMapping(value = SOURCE_SEARCH_URI + "/**")
	public String sourceSearch(Model model, HttpServletRequest request) throws Exception {

		String searchUri = StringUtils.removeStart(request.getRequestURI(), SOURCE_SEARCH_URI);
		logger.debug(searchUri);

		initSearchForms(SOURCE_SEARCH_PAGE, model);

		SearchUriData searchUriData = searchHelper.parseSearchUri(SOURCE_SEARCH_PAGE, searchUri);

		if (!searchUriData.isValid()) {
			initSearchForms(SOURCE_SEARCH_PAGE, model);
			List<Source> sources = new ArrayList<>();
			model.addAttribute("sources", sources);
			model.addAttribute("sourceCount", 0);
			return SOURCE_SEARCH_PAGE;
		}

		String searchMode = searchUriData.getSearchMode();
		String simpleSearchFilter = searchUriData.getSimpleSearchFilter();
		SearchFilter detailSearchFilter = searchUriData.getDetailSearchFilter();


		EkiUser user = userContext.getUser();
		DatasetPermission userRole = user.getRecentRole();

		List<Source> sources;
		if (StringUtils.equals(SEARCH_MODE_SIMPLE, searchMode)) {
			sources = sourceService.getSources(simpleSearchFilter, userRole);
		} else {
			sources = sourceService.getSources(detailSearchFilter, userRole);
		}

		model.addAttribute("searchMode", searchMode);
		model.addAttribute("simpleSearchFilter", simpleSearchFilter);
		model.addAttribute("detailSearchFilter", detailSearchFilter);
		model.addAttribute("sources", sources);
		model.addAttribute("sourceCount", sources.size());
		model.addAttribute("searchUri", searchUri);

		return SOURCE_SEARCH_PAGE;
	}

	@GetMapping(SEARCH_SOURCES_URI)
	public String sourceSearch(@RequestParam String searchFilter, Model model) {

		logger.debug("Searching by : \"{}\"", searchFilter);

		List<Source> sources = sourceService.getSources(searchFilter);
		model.addAttribute("searchFilter", searchFilter);
		model.addAttribute("sources", sources);
		model.addAttribute("sourceCount", sources.size());

		return COMMON_PAGE + PAGE_FRAGMENT_ELEM + "source_link_dlg";
	}

	@GetMapping(SOURCE_SEARCH_URI + "/{sourceId}")
	public String searchById(@PathVariable("sourceId") Long sourceId, Model model) {

		logger.debug("Searching by id: \"{}\"", sourceId);

		EkiUser user = userContext.getUser();
		DatasetPermission userRole = user.getRecentRole();
		List<Source> sources = new ArrayList<>();
		Source source = sourceService.getSource(sourceId, userRole);
		sources.add(source);

		initSearchForms(SOURCE_SEARCH_PAGE, model);

		model.addAttribute("sources", sources);
		model.addAttribute("sourceCount", sources.size());

		return SOURCE_SEARCH_PAGE;
	}

	@GetMapping(SOURCE_NAME_SEARCH_URI + "/{nameSearchFilter}")
	@ResponseBody
	public List<String> sourceNameSearch(@PathVariable("nameSearchFilter") String nameSearchFilter) {

		List<String> sourceNames = sourceService.getSourceNames(nameSearchFilter, AUTOCOMPLETE_MAX_RESULTS_LIMIT);
		return sourceNames;
	}

	@GetMapping(SOURCE_DETAIL_SEARCH_URI + "/{sourceId}")
	public String sourceDetailSearch(@PathVariable("sourceId") Long sourceId) {

		logger.debug("Source detail search by id: \"{}\"", sourceId);

		List<String> selectedDatasets = getUserPreferredDatasetCodes();
		SearchFilter detailSearchFilter = searchHelper.createSourceDetailSearchFilter(sourceId);
		String searchUri = searchHelper.composeSearchUri(SEARCH_MODE_DETAIL, selectedDatasets, null, detailSearchFilter, SearchResultMode.WORD, null);
		return "redirect:" + TERM_SEARCH_URI + searchUri;
	}

}
