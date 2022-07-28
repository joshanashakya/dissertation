

// Java implementation of the approach 
  
import java.util.*; 
  
public class GFG { 
  
  
// Function to return the number 
// of chicks on the nth day 
static long getChicks(int n) 
{ 
  
    // Size of dp[] has to be 
    // at least 6 (1-based indexing) 
    int size = Math.max(n, 7); 
    long []dp = new long[size]; 
  
    dp[0] = 0; 
    dp[1] = 1; 
  
    // Every day current population 
    // will be three times of the previous day 
    for (int i = 2; i < 6; i++) { 
        dp[i] = dp[i - 1] * 3; 
    } 
  
    // Manually calculated value 
    dp[6] = 726; 
  
    // From 8th day onwards 
    for (int i = 8; i <= n; i++) { 
  
        // Chick population decreases by 2/3 everyday. 
        // For 8th day on [i-6] i.e 2nd day population 
        // was 3 and so 2 new born die on the 6th day 
        // and so on for the upcoming days 
        dp[i] = (dp[i - 1] - (2 * dp[i - 6] / 3)) * 3; 
    } 
  
    return dp[n]; 
} 
  
// Driver code 
public static void main(String[] args) { 
int n = 3; 
  
    System.out.println(getChicks(n)); 
    } 
} 
// This code has been contributed by 29AjayKumar 

