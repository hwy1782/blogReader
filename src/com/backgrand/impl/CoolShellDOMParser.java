package com.backgrand.impl;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.backgrand.DomParser;
import com.backgrand.domain.ArticleDO;
import com.backgrand.domain.ResultDO;

/**
 *@author hwy1782@gmail.com
 *@date 2013-1-11ÏÂÎç4:47:38
 **/
public class CoolShellDOMParser implements DomParser{

	@Override
	public ResultDO<List<ArticleDO>> parseHtml(Document doc) {
		List<ArticleDO> tmpRst = new ArrayList<ArticleDO>();
		ResultDO<List<ArticleDO>> finalRst = new ResultDO<List<ArticleDO>>();
		
		if(doc == null){
			finalRst.setSuccess(false);
			return finalRst;
		}
		
		Elements articles = doc.select("div.post");
		for(Element e : articles){
			ArticleDO article = new ArticleDO();
			article.setTitle(e.select("a.title").text());
			article.setAuthor(e.select("[rel=author]").text());
			article.setPublistTime(e.select("span.date").text());
			article.setDetailRul(e.select("a.title").attr("abs:href"));
			article.setCommontNum(e.select("span.comments").first().text());
			article.setReadNum(e.select("span.comments").get(1).text());
			
			tmpRst.add(article);
			
		}
		
		finalRst.setModule(tmpRst);
		finalRst.setSuccess(true);
		
		return finalRst;
	}

}
