package com.farouk.bengharssallah.financial.ratio.accounting.model.implementation;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.farouk.bengharssallah.financial.ratio.accounting.model.Ratio;

      /** An idea on how cheap/expensive is the stock  */
public class MarketValue extends Ratio {

	        /** the earning movement, slow or fast. The current stock price; the higher, the expensive   
	           net income/number of shares === earning per share */
	 public static double getPriceEarningRatio(double marketPrice, double netIncome, double numberOfShares){
	       return new BigDecimal(marketPrice / (netIncome / numberOfShares )).setScale(3, RoundingMode.HALF_UP).doubleValue();
      }

	   /** the worth of the stock, slow or fast. The current stock price; the higher, the expensive  
	        common equity/number of shares === book value
	     */
    public static double getMarketBookRatio(double marketPrice, double commonEquity, double numberOfShares){
           return new BigDecimal(marketPrice / (commonEquity / numberOfShares )).setScale(3, RoundingMode.HALF_UP).doubleValue();
      }

    /** current value of the stock; the higher, the expensive  
        common equity/number of shares === book value
     */
    public static double getDividendYield(double dividendPerShare, double marketPrice){
           return new BigDecimal(dividendPerShare / marketPrice).setScale(3, RoundingMode.HALF_UP).doubleValue();
      }
}
