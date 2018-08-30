package com.farouk.bengharssallah.security.ratio.stock;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
             *<p></p>
             * <p>{@link δPriceCalculator }  calculates this value.</p>
             */
                

public class δPriceCalculator {
	
	
			   /**
			     * <p> this method calculates the bond's price change.</p>
			     *	@param duration   {@link Double } bond's duration
			     *	@param interestRate  {@link Double } market rate of interest
				 *	@param interestRateChange  {@link Double } change of market rate of interest
			     *  @return {@link double}
			     **/
	
	        public static double calculate(double duration, double interestRate, double interestRateChange){
		        	            return new BigDecimal( (-1) * (duration * interestRateChange) / 
								        (1 + interestRate)).setScale(3, RoundingMode.HALF_UP).doubleValue();
	                                      }
                       }
