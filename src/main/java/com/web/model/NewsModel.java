package com.web.model;

public class NewsModel extends AbsModel<NewsModel> {
		
	private String name;
	private String title;
	private String thumbal;
	private String shortDescription;
	private String content;
	private Long cateID;
	private String cateCode;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getThumbal() {
		return thumbal;
	}
	public void setThumbal(String thumbal) {
		this.thumbal = thumbal;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Long getCateID() {
		return cateID;
	}
	public void setCateID(Long cateID) {
		this.cateID = cateID;
	}
	public String getCateCode() {
		return cateCode;
	}
	public void setCateCode(String cateCode) {
		this.cateCode = cateCode;
	}
	
	
}
