

// Java program to calculate the number of 
// n digit stepping numbers. 
class GFG 
{ 
      
// function that calculates the answer 
static long answer(int n) 
{ 
    // dp[j] stores count of i digit 
    // stepping numbers ending with digit 
    // j. 
    int[] dp = new int[10]; 
  
    // To store result of length i - 1 
    // before updating dp[j] for length i. 
    int[] prev = new int[10]; 
  
    // if n is 1 then answer will be 10. 
    if (n == 1) 
        return 10; 
  
    // Initialize values for count of 
    // digits equal to 1. 
    for (int j = 0; j <= 9; j++) 
        dp[j] = 1; 
  
    // Compute values for count of digits 
    // more than 1. 
    for (int i = 2; i <= n; i++) 
    { 
        for (int j = 0; j <= 9; j++) 
        { 
            prev[j] = dp[j]; 
        } 
  
        for (int j = 0; j <= 9; j++) 
        { 
  
            // If ending digit is 0 
            if (j == 0) 
                dp[j] = prev[j + 1]; 
  
            // If ending digit is 9 
            else if (j == 9) 
                dp[j] = prev[j - 1]; 
  
            // For other digits. 
            else
                dp[j] = prev[j - 1] + prev[j + 1]; 
        } 
    } 
  
    // stores the final answer 
    long sum = 0; 
    for (int j = 1; j <= 9; j++) 
        sum += dp[j]; 
    return sum; 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    int n = 2; 
    System.out.println(answer(n)); 
} 
} 
  
// This code is contributed by mits 

