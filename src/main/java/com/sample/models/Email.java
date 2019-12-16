package com.sample.models;

import java.util.ArrayList;
import java.util.List;

public class Email {
	
	String title;
	String content; 
	List<String> tags = new ArrayList<String>();

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
}
