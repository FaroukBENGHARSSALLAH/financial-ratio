package com.farouk.bengharssallah.security.ratio.captal;

import java.math.BigDecimal;
import java.math.RoundingMode;

         
		   /*** <p>  The payback period is the length of time required to recover the cost of an investment.</p>
              * <p> {@link PaybackPeriodCalculator } helps to calculate this term.</p>
			 **/
         
                

public class PaybackPeriodCalculator {
	
	
		public static double calculate(double initailInverstment, double[] cashFlows){
		                       int index = 0;
							   double result = 0;
							   double value = initailInverstment;
							   while(value > cashFlows[index]){
								      value = initailInverstment - cashFlows[index];
								      index ++;
									  result ++;
							          }
							return new  BigDecimal(result + (cashFlows[index]/value) ).setScale(2, RoundingMode.HALF_UP).doubleValue();
             }
			 

 }