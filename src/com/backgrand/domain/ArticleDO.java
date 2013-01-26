package com.backgrand.domain;


public class ArticleDO {
	
	private String title;
	private String author;
	private String publistTime;
	private String commontNum;
	private String readNum;
	private String summary;
	private String detailRul;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	
	@Override
	public String toString() {
		return "[title="+title+",authore="+author+",readNum="+readNum+",pubTime="
					+getPublistTime()+",detailUrl="+detailRul
					+",summary="+summary
					+"]";
	}
	public String getPublistTime() {
		return publistTime;
	}
	public void setPublistTime(String publistTime) {
		this.publistTime = publistTime;
	}
	public String getCommontNum() {
		return commontNum;
	}
	public void setCommontNum(String commontNum) {
		this.commontNum = commontNum;
	}
	public String getReadNum() {
		return readNum;
	}
	public void setReadNum(String readNum) {
		this.readNum = readNum;
	}
	public String getDetailRul() {
		return detailRul;
	}
	public void setDetailRul(String detailRul) {
		this.detailRul = detailRul;
	}
	
	
	
}
