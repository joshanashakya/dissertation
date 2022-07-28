

// JAVA program to find summation of series 
import java.io.*; 
import java.math.*; 
import java.text.*; 
import java.util.*; 
import java.util.regex.*; 
  
class GFG  
{ 
  
    // function to calulate sum of series 
    static int summingSeries(long n) 
    { 
        // use of loop to calculate 
        // sum of each term 
        int S = 0;  
        for (i = 1; i <= n; i++)  
            S += i * i - (i - 1) * (i - 1);      
          
        return S; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int n = 100; 
        System.out.println("The sum of n term is: " +  
                            summingSeries(n)); 
    } 
} 

