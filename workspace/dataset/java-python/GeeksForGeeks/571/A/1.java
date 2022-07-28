

// Java implementation of the above approach 
class GFG  
{ 
  
// Function to return the probability when 
// number of heads is greater than the number of tails 
static double Probability(double p[], int n) 
{ 
  
    // Declaring the DP table 
    double [][]dp = new double[n + 1][n + 1]; 
  
    // Base case 
    dp[0][0] = 1.0; 
  
    // Iterating for every coin 
    for (int i = 1; i <= n; i += 1)  
    { 
  
        // j represents the numbers of heads 
        for (int j = 0; j <= i; j += 1)  
        { 
  
            // If number of heads is equal to zero 
            // there there is only one possiblity 
            if (j == 0) 
                dp[i][j] = dp[i - 1][j] 
                        * (1.0 - p[i]); 
            else
                dp[i][j] = dp[i - 1][j] 
                            * (1.0 - p[i]) 
                        + dp[i - 1][j - 1] * p[i]; 
        } 
    } 
  
    double ans = 0.0; 
  
    // When the number of heads is greater than (n+1)/2 
    // it means that heads are greater than tails as 
    // no of tails + no of heads is equal to n for 
    // any permuation of heads and tails 
    for (int i = (n + 1) / 2; i <= n; i += 1) 
        ans += dp[n][i]; 
  
    return ans; 
} 
  
// Driver Code 
public static void main(String[] args)  
{ 
    // 1 based indexing 
    double p[] = { 0.0, 0.3, 0.4, 0.7 }; 
  
    // Number of coins 
    int n = p.length - 1; 
  
    // Function call 
    System.out.println(Probability(p, n)); 
} 
} 
  
// This code is contributed by Rajput-Ji 

