package com.farouk.bengharssallah.financial.ratio.accounting.model.implementation;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.farouk.bengharssallah.financial.ratio.accounting.model.Ratio;

		/**   
		 *  Used by short term creditors, managers and shareholders to be sure that the company is 
		 *  efficient in controlling its debts
		 *  
		 *  **/

public class DebtManagement  extends Ratio{
	
	                   /** the ratio between debt and assets, the lower the best */
	            public static double getTotalDebtToTotalAssets(double totalLiabilities, double totalAssets){
	            	       return new BigDecimal(totalLiabilities / totalAssets).setScale(3, RoundingMode.HALF_UP).doubleValue();
	                    }
	            
	            
	                  /** can the company cover their payment interests, interest expenses */
	            public static double getTimesInterestEarned(double EBIT, double interest){
         	               return new BigDecimal(EBIT / interest).setScale(3, RoundingMode.HALF_UP).doubleValue();
                        }
	            
	            
	                 /** the depreciation is an accounting expenses, more financial look 
	                      in how the company is meeting its interest obligations   */
	            public static double getCashCoverageRatio(double EBIT, double depreciation, double interest){
  	                       return new BigDecimal((EBIT + depreciation)/ interest).setScale(3, RoundingMode.HALF_UP).doubleValue();
                        }
      }
