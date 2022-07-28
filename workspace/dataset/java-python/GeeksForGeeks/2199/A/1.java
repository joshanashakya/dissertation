

// Java code to find smallest K-digit 
// number divisible by X 
  
import java.io.*; 
import java.lang.*; 
  
class GFG { 
    public static double answer(double X, double K) 
    { 
        double i = 10; 
        // Computing MIN 
        double MIN = Math.pow(i, K - 1); 
  
        // returning ans 
        if (MIN % X == 0) 
            return (MIN); 
        else
            return ((MIN + X) - ((MIN + X) % X)); 
    } 
  
    public static void main(String[] args) 
    { 
  
        // Number whose divisible is to be found 
        double X = 83; 
        double K = 5; 
  
        System.out.println((int)answer(X, K)); 
    } 
} 
  
// Code contributed by Mohit Gupta_OMG <(0_o)> 

