package com.java.utility;

import java.util.Random;

public class Day003{
	
	public static void main(String[] args){
		// Generate Password
		String password = genratePassword(9);
		System.out.println(password);		
		
		// Generate OTP
		String otp = generateOTP(6);
		System.out.println(otp);
	}

	private static String generateOTP(int len) {
		String numbers = "0123456789";
		
		Random generator = new Random();
		char[] otp = new char[len];
		
		for(int i=0; i<len; i++) {
			otp[i] = numbers.charAt(generator.nextInt(numbers.length()));
		}		
		return String.copyValueOf(otp); // ** valueOf() vs copyValueOf() **//
	}

	private static String genratePassword(int len) {
		String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_chars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*_=+-/.?<>)";
        
        String values = Capital_chars+ Small_chars+ numbers + symbols;
        
        Random geneartor = new Random();
        char[] password = new char[len];
        
        for(int i=0; i<len; i++) {
        	password[i]= values.charAt(geneartor.nextInt(values.length()));
        }        
		return String.copyValueOf(password); // toString doesn't work, because Arrays don't override toString //
	}

}