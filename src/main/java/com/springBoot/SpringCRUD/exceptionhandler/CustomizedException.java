package com.springBoot.SpringCRUD.exceptionhandler;


public class CustomizedException extends RuntimeException {

	public CustomizedException(String Message) {
	}
	
	public static String FileNotFoundException(String Message) {
		return Message;
	}
}
