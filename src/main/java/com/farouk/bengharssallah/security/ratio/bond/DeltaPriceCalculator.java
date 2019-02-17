package com.farouk.bengharssallah.security.ratio.bond;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
             *<p><A bond is a a loan made by an investor to a borrower. A bond could be thought of paper
             * between the lender and borrower that includes the details of the loan and its payments./p>
             * <p>{@link DeltaPriceCalculator } calculates this value.</p>
             */
                

public class DeltaPriceCalculator {
	
	
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
