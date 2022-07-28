

// Java program to print the  
// sum of series  
import java.io.*; 
  
class GFG  
{ 
    public static void main (String[] args) 
    { 
        double n = 5, a = 2; 
        System.out.println(sumOfSeries(a, n)); 
    } 
      
    // function to calculate sum of given series 
    static double sumOfSeries(double a,double n) 
    { 
        double res = 0, prev = 1; 
        for (int i = 1; i <= n; i++) 
            { 
                // multiply (a/i) to previous term 
                prev *= (a / i); 
                      
                // store result in res 
                res = res + prev; 
            } 
        return(res); 
    } 
} 
  
// This code is Contributed by Azkia Anam. 

