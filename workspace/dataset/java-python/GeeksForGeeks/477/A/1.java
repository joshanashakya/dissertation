

// Java program to find the minimum number 
// of single digit prime numbers required  
// which when summed equals to a given  
// number N. 
  
class Geeks { 
      
// fuction to check if i-th 
// index is valid or not 
static boolean check(int i, int val) 
{ 
    if (i - val < 0) 
        return false; 
    else
        return true; 
} 
  
// function to find the minimum number 
// of single digit prime numbers required 
// which when summed up equals to a given 
// number N. 
static double MinimumPrimes(int n) 
{ 
    double[] dp; 
    dp = new double[n+1]; 
  
    for (int i = 1; i <= n; i++) 
        dp[i] = 1e9; 
  
    dp[0] = dp[2] = dp[3] = dp[5] = dp[7] = 1; 
    for (int i = 1; i <= n; i++) { 
  
        if (check(i, 2)) 
            dp[i] = Math.min(dp[i], 1 + dp[i - 2]); 
  
        if (check(i, 3)) 
            dp[i] = Math.min(dp[i], 1 + dp[i - 3]); 
  
        if (check(i, 5)) 
            dp[i] = Math.min(dp[i], 1 + dp[i - 5]); 
  
        if (check(i, 7)) 
            dp[i] = Math.min(dp[i], 1 + dp[i - 7]); 
    } 
  
    // Not possible 
    if (dp[n] == (1e9)) 
        return -1; 
    else
        return dp[n]; 
} 
  
    // Driver Code 
    public static void main(String args[]) 
    { 
      
        int n = 12; 
        int minimal = (int)MinimumPrimes(n); 
          
        if (minimal != -1) 
            System.out.println("Minimum number of single "+  
                        "digit primes required: "+minimal); 
      
        else
            System.out.println("Not Possible"); 
      
    } 
} 
  
// This code is contributed ankita_saini 

