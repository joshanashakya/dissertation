

// JAVA program to check if two numbers are 
// Amicable or not. 
import java.io.*; 
  
class GFG  
{ 
    // Function to calculate sum of all  
    // proper divisors of a given number 
    static int divSum(int n) 
    { 
        // Sum of divisors 
        int result = 0; 
      
        // find all divisors which divides 'num' 
        for (int i = 2; i <= Math.sqrt(n); i++) 
        { 
            // if 'i' is divisor of 'n' 
            if (n % i == 0) 
            { 
                // if both divisors are same 
                // then add it once else add 
                // both 
                if (i == (n / i)) 
                    result += i; 
                else
                    result += (i + n / i); 
            } 
        } 
      
        // Add 1 and n to result as above loop 
        // considers proper divisors greater  
        // than 1. 
        return (result + 1); 
    } 
      
    // Returns true if x and y are Amicable 
    // else false. 
    static boolean areAmicable(int x, int y) 
    { 
        if (divSum(x) != y) 
        return false; 
      
        return (divSum(y) == x); 
    } 
      
    public static void main (String[] args)  
    { 
        int x = 220, y = 284; 
        if (areAmicable(x, y)) 
        System.out.println( "Yes"); 
        else
        System.out.println("No"); 
      
    } 
}  
  
// This code is contributed by vt_m. 

