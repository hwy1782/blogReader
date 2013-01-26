package com.backgrand;

import java.util.List;

import org.jsoup.nodes.Document;

import com.backgrand.domain.ArticleDO;
import com.backgrand.domain.ResultDO;

public interface DomParser {
	
	
	ResultDO<List<ArticleDO>> parseHtml(Document doc);
}
