

// JAVA program to illustrate... 
// Summation of series 
  
import java.io.*; 
import java.math.*; 
import java.text.*; 
import java.util.*; 
import java.util.regex.*; 
  
class GFG  
{ 
  
    // function to calculate sum of series 
    static int summingSeries(long n) 
    { 
  
        // Using the pow function calculate 
        // the sum of the series 
        return (int)Math.pow(n, 2); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int n = 100; 
        System.out.println("The sum of n term is: " +  
                            summingSeries(n)); 
    } 
} 

