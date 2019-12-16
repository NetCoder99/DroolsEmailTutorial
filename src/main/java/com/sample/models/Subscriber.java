package com.sample.models;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.time.temporal.ChronoUnit;

public class Subscriber {
	String name;
	LocalDate subscriptionDate;
	String country;
	String email = "$name@foo.com";
	List<String> tags = new ArrayList<String>();
	List<Purchase> purchases = new ArrayList<Purchase>();
	List<EmailSending> emailsReceived = new ArrayList<EmailSending>();

	public List<Email> actualEmailsReceived() {
		return emailsReceived.stream().map(EmailSending::getEmail).collect(Collectors.toList());
	}
	
	public Boolean isInSequence(EmailSequence emailSequence) {
		//return hasReceived(emailSequence.first) && !hasReceived(emailSequence.last)
		return true;
	}
	
	public Boolean hasReceived(Email email) {
		List<Email> emailList = emailsReceived.stream().map(EmailSending::getEmail).collect(Collectors.toList());
	    return emailList.contains(email);	
	}
	
	public Boolean hasReceivedEmailsInLastDays(long days, LocalDate date)
	{
		EmailSending lastEmail = Collections.max(emailsReceived, Comparator.comparing(s -> s.getDate()));
		LocalDate crntDate = LocalDate.now();
		long daysAgo = ChronoUnit.DAYS.between(lastEmail.date, crntDate);
		return daysAgo < days;
	}
	
	public Boolean isOnHolidays(LocalDate date)
	{
		
        return date.getDayOfWeek() == DayOfWeek.SATURDAY
            || date.getDayOfWeek() == DayOfWeek.SUNDAY;
		
	}
	
	public int emailReceivedWithTag(String tag) {
	    return Collections.frequency(emailsReceived, tag);
	}

}
