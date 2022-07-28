

// JAVA program to find sum of all 
// divisor of number up to 'n' 
import java.io.*; 
  
class GFG { 
  
    // Utility function to find sum of 
    // all divisor of number up to 'n' 
    static int divisorSum(int n) 
    { 
        int sum = 0; 
  
        for (int i = 1; i <= n; ++i) { 
  
            // Find all divisors of i 
            // and add them 
            for (int j = 1; j * j <= i; ++j) { 
                if (i % j == 0) { 
                    if (i / j == j) 
                        sum += j; 
                    else
                        sum += j + i / j; 
                } 
            } 
        } 
        return sum; 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int n = 4; 
        System.out.println(divisorSum(n)); 
        n = 5; 
        System.out.println(divisorSum(n)); 
    } 
} 
  
/*This code is contributed by Nikita tiwari.*/

