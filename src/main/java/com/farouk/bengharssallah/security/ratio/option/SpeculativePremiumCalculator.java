package com.farouk.bengharssallah.security.ratio.option;

import java.math.BigDecimal;
import java.math.RoundingMode;


                /***<p>Speculative premium is the difference between the current option price, 
				  *  cost to buy the option and its intrinsic value. </p>
                  * <p> {@link SpeculativePremiumCalculator } helps to calculate this term.</p>				
				  **/


public class SpeculativePremiumCalculator {
	
	
	          /**
			     *<p> this method calculates the option's speculative value.</p>
			     *	@param sharePrice {@link Double } which contains the option's unique share price
				 *	@param intrinsicValue {@link Double } which contains the option's intrinsic
			     *  @return {@link Double}
			     **/
	
	        public static double calculate(double sharePrice, double intrinsicValue){

		        	            return new  BigDecimal((sharePrice * 100) - intrinsicValue).setScale(3, RoundingMode.HALF_UP).doubleValue();
	                                      }
                       }
