package com.java.utility;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class Day002{
	
	// Generate Unique Random numbers //
	public static void main(String [] args) {
		
		//Approach-1
		Random generator = new Random();		
		Set<Integer> uniuqeRandomNumbers = new LinkedHashSet<Integer>();
		
		while(uniuqeRandomNumbers.size()<10) {
			uniuqeRandomNumbers.add(generator.nextInt(20));
		}
		System.out.println(uniuqeRandomNumbers);
		
		//Approach-2
		Set<Object> distinctRandomNumbers = new Random().ints(10, 25)
				  .distinct().limit(10)
				  .boxed().collect(Collectors.toSet());
		System.out.println(distinctRandomNumbers);
		
	}
}