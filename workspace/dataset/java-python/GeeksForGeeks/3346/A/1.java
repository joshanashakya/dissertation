

// Java program to find sum of all 
// divisor of number up to 'n' 
import java.io.*; 
  
class GFG { 
  
    // Utility function to find sum of 
    // all divisor of number up to 'n' 
    static int divisorSum(int n) 
    { 
        int sum = 0; 
        for (int i = 1; i <= n; ++i) 
            sum += (n / i) * i; 
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
  
/*This code is contributed by Nikita Tiwari.*/

