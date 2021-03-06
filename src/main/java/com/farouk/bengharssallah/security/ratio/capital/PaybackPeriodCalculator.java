package com.farouk.bengharssallah.security.ratio.captal;

import java.math.BigDecimal;
import java.math.RoundingMode;

         
		   /*** <p>  The payback period is the length of time required to recover the cost of an investment.</p>
              * <p> {@link PaybackPeriodCalculator } helps to calculate this term.</p>
			 **/
         
                

public class PaybackPeriodCalculator {
	
	
	           /**
			     *<p> this method calculates the capital's payback period value.</p>
			     *	@param initialInverstment {@link Double } which contains the capital's initial inverstment
				 *	@param cashFlows {@link  Array} of {@link Double } which contains the capital's cash flows
			     *  @return {@link Double}
			     **/
				 
				 
		public static double calculate(double initialInverstment, double[] cashFlows){
		                       int index = 0;
							   double result = 0;
							   double value = initialInverstment;
							   while(value > cashFlows[index]){
								      value = initialInverstment - cashFlows[index];
								      index ++;
									  result ++;
							          }
							return new  BigDecimal(result + (cashFlows[index]/value) ).setScale(2, RoundingMode.HALF_UP).doubleValue();
             }
			 

 }