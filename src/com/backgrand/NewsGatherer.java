package com.backgrand;

import java.util.List;

import com.backgrand.domain.BlogDO;

/**
 * �����ռ���
 * @author hongyehwy
 *
 */
public interface NewsGatherer {
	
	List<BlogDO> getNews();
	
}
