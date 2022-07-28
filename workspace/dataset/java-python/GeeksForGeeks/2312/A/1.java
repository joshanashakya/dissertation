

// Java code for solving the differential 
// equation using Predictor-Corrector 
// or Modified-Euler method with the  
// given conditions, y(0) = 0.5, step 
// size(h) = 0.2 to find y(1) 
import java.text.*; 
  
class GFG 
{ 
      
// consider the differential equation 
// for a given x and y, return v 
static double f(double x, double y) 
{ 
    double v = y - 2 * x * x + 1; 
    return v; 
} 
  
// predicts the next value for a given (x, y) 
// and step size h using Euler method 
static double predict(double x, double y, double h) 
{ 
    // value of next y(predicted) is returned 
    double y1p = y + h * f(x, y); 
    return y1p; 
} 
  
// corrects the predicted value 
// using Modified Euler method 
static double correct(double x, double y, 
                    double x1, double y1, 
                    double h) 
{ 
    // (x, y) are of previous step 
    // and x1 is the increased x for next step 
    // and y1 is predicted y for next step 
    double e = 0.00001; 
    double y1c = y1; 
  
    do
    { 
        y1 = y1c; 
        y1c = y + 0.5 * h * (f(x, y) + f(x1, y1)); 
    } 
    while (Math.abs(y1c - y1) > e); 
  
    // every iteration is correcting the value 
    // of y using average slope 
    return y1c; 
} 
  
static void printFinalValues(double x, double xn, 
                    double y, double h) 
{ 
  
    while (x < xn)  
    { 
        double x1 = x + h; 
        double y1p = predict(x, y, h); 
        double y1c = correct(x, y, x1, y1p, h); 
        x = x1; 
        y = y1c; 
    } 
  
    // at every iteration first the value 
    // of for next step is first predicted 
    // and then corrected. 
    DecimalFormat df = new DecimalFormat("#.#####"); 
    System.out.println("The final value of y at x = "+ 
                        x + " is : "+df.format(y)); 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    // here x and y are the initial 
    // given condition, so x=0 and y=0.5 
    double x = 0, y = 0.5; 
  
    // final value of x for which y is needed 
    double xn = 1; 
  
    // step size 
    double h = 0.2; 
  
    printFinalValues(x, xn, y, h); 
} 
} 
  
// This code is contributed by mits 

