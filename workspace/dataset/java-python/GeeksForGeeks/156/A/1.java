

// Java code to find highest 
// K-digit number divisible by X 
  
import java.io.*; 
import java.lang.*; 
  
class GFG { 
    public static double answer(double X, double K) 
    { 
        double i = 10; 
        // Computing MAX 
        double MAX = Math.pow(i, K) - 1; 
  
        // returning ans 
        return (MAX - (MAX % X)); 
    } 
  
    public static void main(String[] args) 
    { 
  
        // Number whose divisible is to be found 
        double X = 30; 
  
        // Max K-digit divisible is to be found 
        double K = 3; 
  
        System.out.println((int)answer(X, K)); 
    } 
} 
  
// Code contributed by Mohit Gupta_OMG <(0_o)> 

