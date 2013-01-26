package com.backgrand.domain;

public class BlogDO {
	
	String title;
	String accessUrl;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAccessUrl() {
		return accessUrl;
	}
	public void setAccessUrl(String accessUrl) {
		this.accessUrl = accessUrl;
	}
	
	@Override
	public String toString() {
		return "[ title="+title+";accessUrl="+accessUrl+"]";
	}
}
