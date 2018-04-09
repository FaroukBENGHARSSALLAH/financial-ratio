package com.farouk.bengharssallah.security.ratio.calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
             *<p> Correlation is a statistic that measures the degree to which two security move in relation to each other.
             * Correlations are used in advanced portfolio management. Correlation is computed into what is known as the correlation coefficient, 
             * which has value that must fall between -1 and 1.</p>
             * <p>{@link CorrelationCalculator } helps to calculate this ratio.</p>
             */
                

public class CorrelationCalculator {
	
	
			   /**
			     *<p> this method calculates the correlation ratio.</p>
			     *	@param valuesX   {@link  Array} of {@link Double } which contains the first security 's values
			     *	@param valuesY   {@link  Array} of {@link Double } which contains the second security 's values
			     *  @return {@link double}
			     **/
	
	        public static double calculate(double[] valuesX, double[]  valuesY){
		        	            double sumX=0, sumY=0, sumXY=0, sumX2=0, sumY2=0;
		        	            for(int i=0; i<valuesX.length; i++){
		        	            	
				        	                	      sumX += valuesX[i];
				        	                	      sumX2 += valuesX[i] * valuesX[i];
				        	                	      sumY += valuesY[i];
				        	                	      sumY2 += valuesY[i] * valuesY[i];
				        	                	      sumXY += valuesX[i] * valuesY[i];
		        	                                                                 }
		        	            double result = (valuesX.length * sumXY - (sumX * sumY)) / Math.sqrt((valuesX.length * sumX2 - sumX * sumX) * (valuesX.length * sumY2 - sumY * sumY));
		        	            return new BigDecimal(result).setScale(3, RoundingMode.HALF_UP).doubleValue();
	                                      }
                       }
