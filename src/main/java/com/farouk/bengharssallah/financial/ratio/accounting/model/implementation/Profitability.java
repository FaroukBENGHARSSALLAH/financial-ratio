package com.farouk.bengharssallah.financial.ratio.accounting.model.implementation;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.farouk.bengharssallah.financial.ratio.accounting.model.Ratio;

public class Profitability extends Ratio {
	       
	public static double getGrossProfitMargin(double sales, double CGS){
	       return new BigDecimal((sales - CGS) / sales).setScale(3, RoundingMode.HALF_UP).doubleValue();
             }
	      
    public static double getOperatingProfitMargin(double operatingIncome, double sales){
           return new BigDecimal(operatingIncome / sales).setScale(3, RoundingMode.HALF_UP).doubleValue();
             }
         
    public static double getNetProfitMargin(double netIncome, double sales){
          return new BigDecimal(netIncome / sales).setScale(3, RoundingMode.HALF_UP).doubleValue();
             }
         
    public static double getReturnOnAssets(double netIncome, double assets){
          return new BigDecimal(netIncome / assets).setScale(3, RoundingMode.HALF_UP).doubleValue();
           }
         
    public static double getReturnOnEquity(double netIncome, double commonEquity){
        return new BigDecimal(netIncome / commonEquity).setScale(3, RoundingMode.HALF_UP).doubleValue();
         }

}
