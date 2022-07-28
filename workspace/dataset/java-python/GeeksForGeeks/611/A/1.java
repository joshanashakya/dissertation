

// A DP based Java program 
// to print first n 
// Tribinacci numbers. 
import java.io.*; 
  
class GFG { 
      
    static void printTrib(int n) 
    { 
        int dp[]=new int[n]; 
        dp[0] = dp[1] = 0; 
        dp[2] = 1; 
      
        for (int i = 3; i < n; i++) 
            dp[i] = dp[i - 1] + 
                    dp[i - 2] + 
                    dp[i - 3]; 
      
        for (int i = 0; i < n; i++) 
            System.out.print(dp[i] + " "); 
    } 
      
    // Driver code 
    public static void main(String args[]) 
    { 
        int n = 10; 
        printTrib(n); 
    } 
} 
  
/* This code is contributed by Nikita Tiwari.*/

