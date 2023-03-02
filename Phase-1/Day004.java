package com.java.utility;

import java.math.BigDecimal;

public class Day004 {	
	
	/*Java programmers use BigDecimal to store floating-point values because it's easier 
	to perform arithmetic operations on BigDecimal than float or double.
	That's the reason, many Java programmer uses BigDecmial for monetary or financial calculation that floats or double. */
    public static void main(String[] args) {
        // Create two new BigDecimals
        BigDecimal BigDec1 = new BigDecimal("1238126387123");
        BigDecimal BigDec2 = new BigDecimal("1213669989183");
 
        // Addition of two BigDecimals
        BigDec1 = BigDec1.add(BigDec2);
        System.out.println("BigDec1 = " + BigDec1);
 
        // Multiplication of two BigDecimals
        BigDec1 = BigDec1.multiply(BigDec2);
        System.out.println("BigDec1 = " + BigDec1);
 
        // Subtraction of two BigDecimals
        BigDec1 = BigDec1.subtract(BigDec2);
        System.out.println("BigDec1 = " + BigDec1);
 
        // Division of two BigDecimals
        BigDec1 = BigDec1.divide(BigDec2);
        System.out.println("BigDec1 = " + BigDec1);
 
        // BigDecima1 raised to the power of 2
        BigDec1 = BigDec1.pow(2);
        System.out.println("BigDec1 = " + BigDec1);
 
        // Negate value of BigDecimal1
        BigDec1 = BigDec1.negate();
        System.out.println("BigDec1 = " + BigDec1);

    }

} //BigDecimal is used to represent bigger numbers in Java, similar to float and long