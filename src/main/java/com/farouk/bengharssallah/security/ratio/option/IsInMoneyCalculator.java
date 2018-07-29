package com.farouk.bengharssallah.security.ratio.option;

import java.math.BigDecimal;
import java.math.RoundingMode;

   
                /*** <p> Being in the money, the option is worth exercising and does not mean you will profit. </p>
				* <p> In the call, the option's strike price is below the market price of the underlying asset. </p>
				* <p> In the put, the option's strike price is above the market price of the underlying asset. </p>
				* <p> {@link IsInMoneyCalculator } helps to calculate this term.</p>			
                *<p> The strike price is the price at which the
				*  owner of the option can buy (call), or sell (put), 
				*  the security.</p>			
                * <p> {@link IsInMoneyCalculator } helps to calculate this term.</p>				*/

public class IsInMoneyCalculator {
	
	           /**
			     *<p> this method calculates the option's is in money.</p>
			     *	@param intrinsicValue {@link Double } which contains the option's intrinsic
			     *  @return {@link Boolean}
			     **/
				
	public static boolean calculate(double intrinsicValue){
					       return (getIntrinsicValue() > 0)
                }

   }
