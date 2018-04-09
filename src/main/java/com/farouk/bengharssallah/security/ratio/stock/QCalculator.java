package com.farouk.bengharssallah.security.ratio.calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

           /**
             *<p> Based on the combined market value of all the companies on the stock market should be about equal to their replacement costs, 
	     * The Q ratio is calculated as the market value of a company divided by the replacement value of the firm's assets.</p>
             * <p> 0< q < 1 , the stock is undervalued, the cost to replace the firm's assets is greater than the value of the stock </p>
             * <p> q > 1 , the stock is overvalued, the firm's stock is more expensive than the cost to replace the assets </p>
             * <p> {@link QCalculator } helps to calculate this ratio.</p>
             * 
             */
                

public class QCalculator {
	
	Equity Market Value / Equity Book Value
				
		          /**
			     *<p> this method calculates the Q's security value.</p>
			     *	@param equityMarketValue   {@link Double } the total market value of the firm
			     *	@param equityBookValue  {@link Double }  total asset value of the firm
			     *  @return {@link Double}
			     **/
	
	public static double calculate(double equityMarketValue, double  equityBookValue){
					       return new BigDecimal(equityMarketValue/equityBookValue).setScale(3, RoundingMode.HALF_UP).doubleValue();
                }

   }
