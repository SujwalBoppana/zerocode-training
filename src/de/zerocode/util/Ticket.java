package de.zerocode.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ticket {
	public String getTicket(String data, String start, String end) {
		Pattern pattern = Pattern.compile("\\{([^\\}]*.?)\\}");
		Matcher matcher=pattern.matcher(data);
		matcher.find();
		return matcher.group();
	}
	public static void main(String[] args) {
		Ticket ticket = new Ticket();
		System.out.println(ticket.getTicket("Dear customer, Your ticket number is : {{HYDTS123456}}. Happy Journey Your ticket number is  : {{HYDTS123488}}" , "{{", "}}"));
	}
}
