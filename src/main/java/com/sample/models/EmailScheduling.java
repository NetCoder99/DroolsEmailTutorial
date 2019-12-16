package com.sample.models;

public class EmailScheduling {
	
	static int nextId = 0; 
	
	EmailSending sending;
	Priority priority;
	Boolean timeSensitive = false;
	Boolean blocked = false;

	public EmailScheduling(EmailSending sending, Priority priority, Boolean timeSensitive, Boolean blocked) {
		super();
		this.sending = sending;
		this.priority = priority;
		this.timeSensitive = timeSensitive;
		this.blocked = blocked;

		++nextId;
	
	}

	public EmailSending getSending() {
		return sending;
	}
	public void setSending(EmailSending sending) {
		this.sending = sending;
	}
	public Priority getPriority() {
		return priority;
	}
	public void setPriority(Priority priority) {
		this.priority = priority;
	}
	public Boolean getTimeSensitive() {
		return timeSensitive;
	}
	public void setTimeSensitive(Boolean timeSensitive) {
		this.timeSensitive = timeSensitive;
	}
	public Boolean getBlocked() {
		return blocked;
	}
	public void setBlocked(Boolean blocked) {
		this.blocked = blocked;
	}
	
}
