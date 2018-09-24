package com.farouk.bengharssallah.security.ratio.option;

import java.math.BigDecimal;
import java.math.RoundingMode;

                    /***
					* <p> {@link LeverageCalculator } helps to calculate this term.</p>
					**/

public class LeverageCalculator {
	
	
	           /**
			     *<p> this method calculates the future's leverage.</p>
			     *	@param value {@link Double } which contains the fucture's contract value
				 *	@param initialMargin {@link Double } which contains the future's initial deposit
				 *	@param inversed {@link Boolean } refers the expected result, initialMargin/value or not
			     *  @return {@link Double}
			     **/
				
	public static double calculate(double initialMargin, double  value, boolean inversed){
		                    if(inversed)
							            return new BigDecimal(initialMargin/value).setScale(2, RoundingMode.HALF_UP).doubleValue();
							else
								        return new BigDecimal(value/initialMargin).setScale(2, RoundingMode.HALF_UP).doubleValue();
             }

 }