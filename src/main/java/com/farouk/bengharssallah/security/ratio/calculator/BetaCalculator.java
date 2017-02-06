package com.farouk.bengharssallah.security.ratio.calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

           /**
             *<p> Beta is a measurement of how volatile a particular security; how violently to go up or down. Beta compares 
             *  the movement of that security price against a market benchmark.</p>
             * <p> β < 1 , the asset is less risky, less volatile than the market as a whole, </p>
             * <p> β > 1 , the asset is more risky, more volatile than the market as a whole</p>
             * <p> β < 0 , the asset is losing money while the market as a whole is gaining</p>
             * <p> {@link BetaCalculator } helps to calculate this ratio.</p>
             * 
             */
                

public class BetaCalculator {
	
	
				/**
			     *<p> this method calculates the beta's security value.</p>
			     *	@param valuesX   {@link  Array} of {@link Double } which contains the security 's values
			     *	@param valuesY   {@link  Array} of {@link Double } which contains the benchmark 's values
			     *  @return {@link double}
			     **/
	
	public static double calculate(double[] security, double[]  benchmark){
		                    double securityAverage =0, benchmarkAverage =0, covariance =0, variance =0; 
					        double[] securityReturn= new double[security.length - 1];
					        double[] benchmarkReturn= new double[benchmark.length - 1];
					        
					           // calculating the percentage of the change
					        for(int i=0; i<(security.length-1); i++){
					        	        securityReturn[i] = (security[i+1] - security[i]) / security[i];
					            }
					        for(int i=0; i<(benchmark.length-1); i++){
					        	        benchmarkReturn[i] = (benchmark[i+1] - benchmark[i]) / benchmark[i];
				                }
					        
					        
					          // calculating the average used in calculating covariance
					            {
					        double sum = 0;
					        for(int i=0; i<(security.length-1); i++){
					        	            sum += securityReturn[i];
				                                  }
					        securityAverage = new BigDecimal(sum/security.length).setScale(3, RoundingMode.HALF_UP).doubleValue();
					            }
					            {
					        double sum = 0;
					        for(int i=0; i<(benchmark.length-1); i++){
					        	            sum += benchmarkReturn[i];
				                                  }
					        benchmarkAverage = new BigDecimal(sum/benchmark.length).setScale(3, RoundingMode.HALF_UP).doubleValue();
					            }
					            
					            
					             // calculating covariance, covariance(asset, benchmark)
					            {
					        double sum = 0;    	
					        for(int i=0; i<securityReturn.length; i++){
					        	             sum += (securityReturn[i] - securityAverage) * (benchmarkReturn[i] - benchmarkAverage);
					                                }
					        covariance = new BigDecimal(sum/(securityReturn.length -1)).setScale(3, RoundingMode.HALF_UP).doubleValue();
					            }
					            
					            
					            // calculating variance of the benchmark, variance(benchmark)
					            {
					        double sum = 0;    	
					        for(int i=0; i<benchmarkReturn.length; i++){
					        	             sum += (benchmarkReturn[i] - benchmarkAverage) * (benchmarkReturn[i] - benchmarkAverage);
					                                }
					        variance = new BigDecimal(sum/(benchmarkReturn.length -1)).setScale(3, RoundingMode.HALF_UP).doubleValue();
					            }
					            
					       return new BigDecimal(covariance/variance).setScale(3, RoundingMode.HALF_UP).doubleValue();
             }

 }