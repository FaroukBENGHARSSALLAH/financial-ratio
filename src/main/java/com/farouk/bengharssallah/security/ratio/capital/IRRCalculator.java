package com.farouk.bengharssallah.security.ratio.capital;

import java.math.BigDecimal;
import java.math.RoundingMode;

 
             /*** <p>  Internal rate of return (IRR) is a metric used in capital
			  *   budgeting to estimate the profitability of potential investments.</p>
			  * <p> Assuming the costs of investment are equal among the various projects, 
			  * the project with the highest IRR would probably be considered the best and be undertaken first </p>
              * <p> {@link IRRCalculator } helps to calculate this term.</p>
			  **/
                

public class IRRCalculator {
	
	
	           /**
			     *<p> this method calculates the capital's Internal rate of return.</p>
				 *	@param cashFlows {@link  Array} of {@link Double } which contains the capital's cash flows
			     *  @return {@link Double}
			     **/
	 
	  public static double calculate(final double[] cashFlows){
           
		    final int max_iteration = 20;
            double defined_epsilon = 0.0000001;
            double value = 0.1;
            int iteration = 1;
			
        while (iteration < max_iteration) {

				final double added_value = 1.0 + value;
				double portion = 0.0;
				double portion_i = 0.0;
				
				for (int i = 0; i < cashFlows.length; i++) {
							final double cash_flow_i = cashFlows[i];
							final double added_value_raised_by_power_i = Math.pow(added_value, i);
							portion += cash_flow_i / added_value_raised_by_power_i;
							final double added_value_raised_by_power_i_multiplied_by_added_value = added_value_raised_by_power_i * added_value;
							portion_i += -i * cash_flow_i / added_value_raised_by_power_i_multiplied_by_added_value;
				         }
						 
				final double adjusted_value = value - portion / portion_i;
				final double epsilon = Math.abs(adjusted_value - value);

				if (epsilon <= defined_epsilon) {
						if (value == 0.0 && Math.abs(adjusted_value) <= defined_epsilon) {
						               return 0.0; 
						         }
						else {
						            return adjusted_value*100;
						         }
				           }
				value = adjusted_value;
				iteration++;
				    }
		return value;
      }   
			
   }
