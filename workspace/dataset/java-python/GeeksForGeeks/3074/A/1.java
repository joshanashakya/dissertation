

// Java code to find modular inverse 
// from 1 to n w.r.t a big prime number 
import java.io.*; 
  
class GFG { 
  
    // Function to calculate modular 
    // inverse using D.P 
    static void modularInverse(int n, int prime) 
    { 
        int dp[]=new int[n + 1]; 
        dp[0] = dp[1] = 1; 
        for (int i = 2; i <= n; i++)  
            dp[i] = dp[prime % i] *  
                (prime - prime / i) % prime;  
      
        for (int i = 1; i <= n; i++)  
            System.out.print(dp[i] + " ");  
    } 
  
    // Driver Program 
    public static void main(String args[]) 
    { 
        int n = 10, prime = 17; 
        modularInverse(n, prime); 
    } 
} 
  
  
// This code is contributed by Nikita Tiwari. 

