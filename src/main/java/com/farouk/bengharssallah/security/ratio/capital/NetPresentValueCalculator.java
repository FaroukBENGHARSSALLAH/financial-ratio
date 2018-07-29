package com.farouk.bengharssallah.security.ratio.capital;

import java.math.BigDecimal;
import java.math.RoundingMode;

              /*** <p>  Net present value (NPV) is the difference between the present value of cash inflows and the present
			     *  value of cash outflows over a period of time.</p>
			     * <p> NPV is used in capital budgeting to analyze the profitability of
			     * a projected investment or project. </p>
				 * <p> The discount rate refers the charges from banks, depository institutions. </p>
                 * <p> {@link NetPresentValueCalculator } helps to calculate this term.</p>
			     **/
         

public class NetPresentValueCalculator {
	
	
	
	           /**
			     *<p> this method calculates the capital's net present value.</p>
			     *	@param discountRate {@link Double } which contains the capital's discount rate
				 *	@param cashFlows {@link  Array} of {@link Double } which contains the capital's cash flows
			     *  @return {@link Double}
			     **/

			 public static double calculate(double discountRate, double[] cashFlows) { 
							 double result = 0; 
							 discountRate = discountRate + 1; 
							 for (int i=0; i<cfs.length; i++) { 
								result += cashFlows[i] / discountRate; 
								discountRate *= discountRate; 
								}  
							  return result; 
				   }
   }
