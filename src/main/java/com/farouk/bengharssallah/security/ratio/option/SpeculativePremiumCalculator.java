package com.farouk.bengharssallah.security.ratio.option;

import java.math.BigDecimal;
import java.math.RoundingMode;



public class SpeculativePremiumCalculator {
	
	
	
	        public static double calculate(double sharePrice, double intrinsicValue){

		        	            return new  BigDecimal((sharePrice * 100) - intrinsicValue).setScale(3, RoundingMode.HALF_UP).doubleValue();
	                                      }
                       }
