package com.farouk.bengharssallah.security.ratio.option;

import java.math.BigDecimal;
import java.math.RoundingMode;

                

public class IntrinsicCalculator {
	
	
				
	public static double calculate(String type, double stockPrice, double  strikePrice){
		
							if(type.equals("CALL")) {
													 double diff = stockPrice - strikePrice;
													 if(diff < 0) return new Long(0); else return diff;
											}
							 else {
										 double diff = strikePrice - stockPrice;
										 if(diff < 0) new Long(0); else return diff;
								 }    
							return new Long(0);
             }

 }