package com.backgrand;

import java.util.Iterator;
import java.util.List;

import com.backgrand.domain.BlogDO;

public class CoolUtil {

	public static void showList(List<? extends Object > lst){
		Iterator<? extends Object > it = lst.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	
	public static void showBlogDO(List<BlogDO> lst){
		Iterator<BlogDO> it = lst.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	
	public static String convertBlogLst2String(List<BlogDO> lst){
		StringBuilder sb = new StringBuilder();
		Iterator<BlogDO> it = lst.iterator();
		while(it.hasNext()){
			sb.append(it.next().getTitle()).append("\n");
		}
		return sb.toString();
	}
	
}
