

// Java program to Implement Weedle's Rule 
import java.util.*; 
class GFG{ 
  
    // A sample function f(x) = 1/(1+x^2) 
    static float y(float x) 
    { 
        float num = 1; 
        float denom = (float)1.0 + x * x; 
      
        return num / denom; 
    } 
      
    // Function to find the integral value 
    // of f(x) with step size h, with 
    // intial lower limit and upper limit 
    // a and b 
    static float WeedleRule(float a, float b) 
    { 
        // Find step size h 
        float h = (b - a) / 6; 
      
        // To store the final sum 
        float sum = 0; 
      
        // Find sum using Weedle's Formula 
        sum = sum + (((3 * h) / 10) * (y(a) 
                                    + y(a + 2 * h) 
                                    + 5 * y(a + h) 
                                    + 6 * y(a + 3 * h) 
                                    + y(a + 4 * h) 
                                    + 5 * y(a + 5 * h) 
                                    + y(a + 6 * h))); 
      
        // Return the final sum 
        return sum; 
    } 
      
    // Driver Code 
    public static void main(String args[]) 
    { 
        // lower limit and upper limit 
        float a = 0, b = 6; 
          
        // Function Call 
        float num=WeedleRule(a, b); 
        System.out.format("f(x) = "+"%.6f", num); 
          
    } 
} 
  
// This code is contributed by AbhiThakur 

