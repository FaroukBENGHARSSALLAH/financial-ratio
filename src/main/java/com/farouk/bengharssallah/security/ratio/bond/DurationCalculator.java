package com.farouk.bengharssallah.security.ratio.bond;

import java.math.BigDecimal;
import java.math.RoundingMode;

           /**
               *<p><A bond is a a loan made by an investor to a borrower. A bond could be thought of paper
             * between the lender and borrower that includes the details of the loan and its payments./p>
             * <p> {@link DurationCalculator } helps to calculate this value.</p>
             * 
             */
                

public class DurationCalculator {
	
	
				/**
			     *<p> this method calculates the bond's duration value.</p>
			     * @param  maturityYears  {@link  Integer}  years to maturity
				 * @param  couponPayment  {@link Double } 
				 * @param  interestRate   {@link Double } market rate of interest
				 * @param  maturity  {@link Double } bond's value in maturity
			     * @param  bondPrice  {@link Double } 
			     * @return {@link double}
			     **/
	
	public static double calculate(int maturityYears, double couponPayment, double interestRate, double maturity, double bondPrice){
		                    
							double interest_raised_by_n = Math.pow(1 + interestRate, maturityYears);
					        double value_one = maturityYears * ((1 + interestRate) * (interest_raised_by_n - 1) - interestRate * maturityYears) 
							           + maturity * maturityYears ; 
					            
					       return new BigDecimal(value_one/(bondPrice * interest_raised_by_n)).setScale(3, RoundingMode.HALF_UP).doubleValue();
             }

 }