package com.farouk.bengharssallah.security.ratio.option;

import java.math.BigDecimal;
import java.math.RoundingMode;

                    /*** <p> The intrinsic value is the actual value of an asset based on the 
					* underlying perception of the true value including all aspects of the business; tangible and intangible factors</p>
					* <p> In the call, intrinsic = Underlying Price – Strike Price. </p>
					* <p> In the put,  intrinsic = Strike Price – Underlying Price. </p>
					* <p> {@link IntrinsicCalculator } helps to calculate this value.</p>	
					**/

public class IntrinsicCalculator {
	
	
				
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