package com.farouk.bengharssallah.financial.ratio.accounting.model.implementation;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.farouk.bengharssallah.financial.ratio.accounting.model.Ratio;

      
		 
public class Profitability extends Ratio {
	       
		    /**   
		      *  How much left after selling goods
		      *   CGS == Cost of goods sold, sales expenses; logistics, workers salaries
			  **/
		 
	public static double getGrossProfitMargin(double sales, double CGS){
	       return new BigDecimal((sales - CGS) / sales).setScale(3, RoundingMode.HALF_UP).doubleValue();
             }
	      
		    /**   
		      *  ////
		      *   operatingIncome == EBIT
			  **/
			  
    public static double getOperatingProfitMargin(double operatingIncome, double sales){
           return new BigDecimal(operatingIncome / sales).setScale(3, RoundingMode.HALF_UP).doubleValue();
             }
         
		 
		    /**   
			  * How much left after selling goods after calculating all expenses, the most used
		      *  Net income === what's left after all expenses
			  *  
			  **/
			  
    public static double getNetProfitMargin(double netIncome, double sales){
          return new BigDecimal(netIncome / sales).setScale(3, RoundingMode.HALF_UP).doubleValue();
             }
			 
			 
			  /**   
			  * how much the company generating net income from assets
			  **/
         
    public static double getReturnOnAssets(double netIncome, double assets){
          return new BigDecimal(netIncome / assets).setScale(3, RoundingMode.HALF_UP).doubleValue();
           }
		   
		    /**   
			  * how's the compnay generating profit based on owner's equity and shareholders' assets
			  * Common Equity == book value of the company from accounting's perspective
			  **/
         
    public static double getReturnOnEquity(double netIncome, double commonEquity){
        return new BigDecimal(netIncome / commonEquity).setScale(3, RoundingMode.HALF_UP).doubleValue();
         }

}
