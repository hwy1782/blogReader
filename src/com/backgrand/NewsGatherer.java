package com.backgrand;

import java.util.List;

import com.backgrand.domain.BlogDO;

/**
 * 新闻收集器
 * @author hongyehwy
 *
 */
public interface NewsGatherer {
	
	List<BlogDO> getNews();
	
}
