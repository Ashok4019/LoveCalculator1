package com.spring.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.spring.API.Phone;


public class Phoneformatter implements Formatter<Phone > {

	@Override
	public String print(Phone  object, Locale locale) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Phone  parse(String completenumber, Locale locale) throws ParseException {
		System.out.println("formatter");
		Phone  phone=new Phone ();
		String[] splitarray = completenumber.split("-");
		 int ind = completenumber.indexOf("-");
		 
		 if(ind==-1 || completenumber.startsWith("-")) {
			 phone.setCountrycode("91");
			if(completenumber.startsWith("-")) {
				phone.setCnumber(splitarray[1]);
			  	
			}
			else {
				phone.setCnumber(splitarray[0]);
			  	
			}
			}
		 else {
		
		
		phone.setCountrycode(splitarray[0]);
		phone.setCnumber(splitarray[1]);
		 }
		return phone;
	}

}
