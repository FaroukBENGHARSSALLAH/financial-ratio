package com.farouk.bengharssallah.financial.ratio.accounting.model.implementation;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.farouk.bengharssallah.financial.ratio.accounting.model.Ratio;

public class MarketValue extends Ratio {

	 public static double getPriceEarningRatio(double marketPrice, double netIncome, double numberOfShares){
	       return new BigDecimal(marketPrice / (netIncome / numberOfShares )).setScale(3, RoundingMode.HALF_UP).doubleValue();
      }

    public static double getMarketBookRatio(double marketPrice, double commonEquity, double numberOfShares){
           return new BigDecimal(marketPrice / (commonEquity / numberOfShares )).setScale(3, RoundingMode.HALF_UP).doubleValue();
      }

    public static double getDividendYield(double dividendPerShare, double marketPrice){
           return new BigDecimal(dividendPerShare / marketPrice).setScale(3, RoundingMode.HALF_UP).doubleValue();
      }
}
