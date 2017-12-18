package com.farouk.bengharssallah.financial.ratio.accounting.model.implementation;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.farouk.bengharssallah.financial.ratio.accounting.model.Ratio;

		  /**   
		   *  Used by short term creditors, managers and shareholders to be sure that the company have 
		   *  enough assets to pay short term loans, credit that they extend
		   *  **/

public class Liquidity  extends Ratio{
	
	   // assets == cash, inventory or any thing convertible to cash
	   // liabilities accounts payable, short/long term loans, credit
	
	
	            /** 
				  * will the compnany meet debt obligations
				  * >>> 1
				 **/
	            public static double getCurrentRatio(double currentAsset, double currentLiabilities){
	            	       return new BigDecimal(currentAsset / currentLiabilities).setScale(3, RoundingMode.HALF_UP).doubleValue();
	                    }
	            
	            /**  
	     	      * will the company meet debt obligations in the near term after eliminating inventory
	     	      * as inventory takes time to be sold and collected
	     	      *  >>> 1
	     	     **/
	            
	            public static double getQuickRatio(double currentAsset, double currentLiabilities, double inventory){
         	               return new BigDecimal((currentAsset - inventory) / currentLiabilities).setScale(3, RoundingMode.HALF_UP).doubleValue();
                       }
      }
