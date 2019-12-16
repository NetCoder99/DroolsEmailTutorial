package com.sample.models;

import java.time.LocalDate;
import java.util.Objects;

public class EmailSending {

	Email email;
	Subscriber subscriber;
	LocalDate date;

	public Email getEmail() {
		return email;
	}
	public void setEmail(Email email) {
		this.email = email;
	}
	public Subscriber getSubscriber() {
		return subscriber;
	}
	public void setSubscriber(Subscriber subscriber) {
		this.subscriber = subscriber;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
    public boolean equals(Object obj) {
        if (obj == null) {return false;}

        if (!EmailSending.class.isAssignableFrom(obj.getClass())) {
            return false;
        }

        final EmailSending other = (EmailSending) obj;
        return this.email.equals(other.email) && this.subscriber.equals(other.subscriber) && this.date.equals(other.date);   
        
    }
	   

    @Override
    public int hashCode() {
        return this.email.title.hashCode() * 7 + this.subscriber.name.hashCode() * 3 + this.date.hashCode();
    }

}
