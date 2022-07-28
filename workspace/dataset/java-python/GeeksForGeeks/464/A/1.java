

// Java program to find total no.of ways 
// to reach nth step 
class GFG{ 
   
// Function which returns total no.of ways 
// to reach nth step from sth steps 
static int TotalWays(int n, int s, int k) 
{ 
    // Initialize dp array 
    int []dp = new int[n]; 
   
    // Initialize (s-1)th index to 1 
    dp[s - 1] = 1; 
   
    // Iterate a loop from s to n 
    for (int i = s; i < n; i++) { 
   
        // starting range for counting ranges 
        int idx = Math.max(s - 1, i - k); 
   
        // Calculate Maximum moves to 
        // Reach ith step 
        for (int j = idx; j < i; j++) { 
            dp[i] += dp[j]; 
        } 
    } 
   
    // For nth step return dp[n-1] 
    return dp[n - 1]; 
} 
   
// Driver Code 
public static void main(String[] args) 
{ 
    // no of steps 
    int n = 5; 
   
    // Atmost steps allowed 
    int k = 2; 
   
    // starting range 
    int s = 2; 
    System.out.print("Total Ways = "
         + TotalWays(n, s, k)); 
} 
} 
  
// This code is contributed by sapnasingh4991 

