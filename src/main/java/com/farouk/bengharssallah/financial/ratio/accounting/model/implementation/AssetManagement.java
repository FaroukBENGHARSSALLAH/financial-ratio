package com.farouk.bengharssallah.financial.ratio.accounting.model.implementation;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.farouk.bengharssallah.financial.ratio.accounting.model.Ratio;

public class AssetManagement extends Ratio {
	
				public static double getInventoryTurnover(double costOfGoodsSold, double Inventory){
				       return new BigDecimal(costOfGoodsSold / Inventory).setScale(3, RoundingMode.HALF_UP).doubleValue();
			       }
			
			   public static double getDaysSalesOutstanding(double accountReceivable, double sales){
			         return new BigDecimal(accountReceivable / (sales/365)).setScale(3, RoundingMode.HALF_UP).doubleValue();
			       }
			   
			   public static double getFixedAssetTurnover(double sales, double netFixedAssets){
			         return new BigDecimal(sales / netFixedAssets).setScale(3, RoundingMode.HALF_UP).doubleValue();
			       }
			   
			   public static double getTotalAssetTurnover(double sales, double totalAssets){
			         return new BigDecimal(sales / totalAssets).setScale(3, RoundingMode.HALF_UP).doubleValue();
			       }

   }
