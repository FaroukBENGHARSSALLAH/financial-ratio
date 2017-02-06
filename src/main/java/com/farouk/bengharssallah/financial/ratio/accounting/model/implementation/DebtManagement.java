package com.farouk.bengharssallah.financial.ratio.accounting.model.implementation;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.farouk.bengharssallah.financial.ratio.accounting.model.Ratio;

public class DebtManagement  extends Ratio{
	
	            public static double getTotalDebtToTotalAssets(double totalLiabilities, double totalAssets){
	            	       return new BigDecimal(totalLiabilities / totalAssets).setScale(3, RoundingMode.HALF_UP).doubleValue();
	                    }
	            
	            public static double getTimesInterestEarned(double EBIT, double interest){
         	               return new BigDecimal(EBIT / interest).setScale(3, RoundingMode.HALF_UP).doubleValue();
                        }
	            
	            public static double getCashCoverageRatio(double EBIT, double depreciation, double interest){
  	                       return new BigDecimal((EBIT + depreciation)/ interest).setScale(3, RoundingMode.HALF_UP).doubleValue();
                        }
      }