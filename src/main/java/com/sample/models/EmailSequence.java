package com.sample.models;

import java.util.ArrayList;
import java.util.List;

public class EmailSequence {
	
	String title;
	List<Email> emails = new ArrayList<Email>(); 
	List<String> tags = new ArrayList<String>(); 

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Email> getEmails() {
		return emails;
	}
	public void setEmails(List<Email> emails) {
		this.emails = emails;
	}
	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
}
