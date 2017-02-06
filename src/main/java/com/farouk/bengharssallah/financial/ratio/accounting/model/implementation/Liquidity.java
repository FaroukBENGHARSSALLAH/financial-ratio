package com.farouk.bengharssallah.financial.ratio.accounting.model.implementation;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.farouk.bengharssallah.financial.ratio.accounting.model.Ratio;

public class Liquidity  extends Ratio{
	
	            public static double getCurrentRatio(double currentAsset, double currentLiabilities){
	            	       return new BigDecimal(currentAsset / currentLiabilities).setScale(3, RoundingMode.HALF_UP).doubleValue();
	                    }
	            
	            public static double getQuickRatio(double currentAsset, double currentLiabilities, double inventory){
         	               return new BigDecimal((currentAsset - inventory) / currentLiabilities).setScale(3, RoundingMode.HALF_UP).doubleValue();
                       }
      }