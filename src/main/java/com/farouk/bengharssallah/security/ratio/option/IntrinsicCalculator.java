package com.farouk.bengharssallah.security.ratio.option;

import java.math.BigDecimal;
import java.math.RoundingMode;

                    /*** <p> The intrinsic value is the actual value of an asset based on the 
					* underlying perception of the true value including all aspects of the business; tangible and intangible factors</p>
					* <p> In the call, intrinsic = Underlying Price – Strike Price. </p>
					* <p> In the put,  intrinsic = Strike Price – Underlying Price. </p>
					*<p> The strike price is the price at which the
					*  owner of the option can buy (call), or sell (put), 
					*  the security.</p>
					* <p> {@link IntrinsicCalculator } helps to calculate this term.</p>
					**/

public class IntrinsicCalculator {
	
	
	           /**
			     *<p> this method calculates the option's intrinsic value.</p>
			     *	@param type {@link String } which contains the option's type
				 *	@param stockPrice {@link Double } which contains the option's security stock price
				 *	@param strikePrice {@link Double } which contains the option's strike price
			     *  @return {@link Double}
			     **/
				
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