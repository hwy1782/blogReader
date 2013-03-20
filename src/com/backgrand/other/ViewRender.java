package com.backgrand.other;

import java.util.List;

import com.backgrand.domain.ArticleDO;

public class ViewRender {
	
	public String genHtml4Text(List<ArticleDO> blogLst){
		StringBuilder sb = new StringBuilder();
		
		for(ArticleDO articleDO : blogLst){
			if(articleDO == null){
				continue;
			}
			
			sb.append("<p><a style=\"font-size:40px; color:black \" href=\""+articleDO.getDetailRul())
			.append("\">")
			.append(articleDO.getTitle())
			.append("</a><p/>");
		}
		
		return sb.toString();
	}
	
}
