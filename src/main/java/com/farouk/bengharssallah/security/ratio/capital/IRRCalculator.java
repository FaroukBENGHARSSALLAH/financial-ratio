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
	  public static double getIRR(final double[] cashFlows)
{
final int MAX_ITER = 20;
double EXCEL_EPSILON = 0.0000001;

double x = 0.1;
int iter = 0;
while (iter++ < MAX_ITER) {

final double x1 = 1.0 + x;
double fx = 0.0;
double dfx = 0.0;
for (int i = 0; i < cashFlows.length; i++) {
final double v = cashFlows[ i ];
final double x1_i = Math.pow( x1, i );
fx += v / x1_i;
final double x1_i1 = x1_i * x1;
dfx += -i * v / x1_i1;
}
final double new_x = x - fx / dfx;
final double epsilon = Math.abs( new_x - x );

if (epsilon <= EXCEL_EPSILON) {
if (x == 0.0 && Math.abs( new_x ) <= EXCEL_EPSILON) {
return 0.0; // OpenOffice calc does this
}
else {
return new_x*100;
}
}
x = new_x;
}
return x;
}   **/
	
			
                       }
