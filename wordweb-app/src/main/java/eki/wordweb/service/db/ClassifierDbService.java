package eki.wordweb.service.db;

import static eki.wordweb.data.db.Tables.MVIEW_WW_CLASSIFIER;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.jooq.Condition;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import eki.common.constant.ClassifierName;
import eki.common.data.Classifier;
import eki.wordweb.data.TypeDomain;

@Component
public class ClassifierDbService {

	@Autowired
	private DSLContext create;

	@Cacheable(value = "classif", key = "{#name, #origin, #code, #lang}")
	public Classifier getClassifier(ClassifierName name, String origin, String code, String lang) {

		if (StringUtils.isBlank(code)) {
			return null;
		}
		Condition where =
				MVIEW_WW_CLASSIFIER.NAME.eq(name.name())
				.and(MVIEW_WW_CLASSIFIER.CODE.eq(code))
				.and(MVIEW_WW_CLASSIFIER.LANG.eq(lang));
		if (StringUtils.isNotBlank(origin)) {
			where = where.and(MVIEW_WW_CLASSIFIER.ORIGIN.eq(origin));
		}
		return create
				.select(
						MVIEW_WW_CLASSIFIER.NAME,
						MVIEW_WW_CLASSIFIER.ORIGIN,
						MVIEW_WW_CLASSIFIER.CODE,
						MVIEW_WW_CLASSIFIER.VALUE,
						MVIEW_WW_CLASSIFIER.LANG
						)
				.from(MVIEW_WW_CLASSIFIER)
				.where(where)
				.fetchSingle().into(Classifier.class);
	}

	@Cacheable(value = "classif", key = "{#name, #code, #lang}")
	public Classifier getClassifier(ClassifierName name, String code, String lang) {
		return getClassifier(name, null, code, lang);
	}

	@Cacheable(value = "classif", key = "{#name, #origin, #codes, #lang}")
	public List<Classifier> getClassifiers(ClassifierName name, String origin, List<String> codes, String lang) {

		if (CollectionUtils.isEmpty(codes)) {
			return Collections.emptyList();
		}
		Condition where =
				MVIEW_WW_CLASSIFIER.NAME.eq(name.name())
				.and(MVIEW_WW_CLASSIFIER.CODE.in(codes))
				.and(MVIEW_WW_CLASSIFIER.LANG.eq(lang));
		if (StringUtils.isNotBlank(origin)) {
			where = where.and(MVIEW_WW_CLASSIFIER.ORIGIN.eq(origin));
		}
		return create
				.select(
						MVIEW_WW_CLASSIFIER.NAME,
						MVIEW_WW_CLASSIFIER.ORIGIN,
						MVIEW_WW_CLASSIFIER.CODE,
						MVIEW_WW_CLASSIFIER.VALUE,
						MVIEW_WW_CLASSIFIER.LANG
						)
				.from(MVIEW_WW_CLASSIFIER)
				.where(where)
				.fetch().into(Classifier.class);
	}

	@Cacheable(value = "classif", key = "{#name, #codes, #lang}")
	public List<Classifier> getClassifiers(ClassifierName name, List<String> codes, String lang) {
		return getClassifiers(name, null, codes, lang);
	}

	@Cacheable(value = "classif", key = "{#name, #codes, #lang}")
	public List<Classifier> getClassifiersWithOrigin(ClassifierName name, List<TypeDomain> codes, String lang) {
		if (CollectionUtils.isEmpty(codes)) {
			return Collections.emptyList();
		}
		List<Classifier> classifiers = new ArrayList<>();
		for (TypeDomain originCodeTuple : codes) {
			Classifier classifier = getClassifier(name, originCodeTuple.getOrigin(), originCodeTuple.getCode(), lang);
			classifiers.add(classifier);
		}
		return classifiers;
	}
}