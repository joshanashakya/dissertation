

// Java implementation of the approach 
class GFG 
{ 
  
// Function to find the count 
// of set bits in all the 
// integers from 0 to n 
static void findSetBits(int n) 
{ 
  
    // dp[i] will store the count 
    // of set bits in i 
    int []dp = new int[n + 1]; 
  
    // Count of set bits in 0 is 0 
    System.out.print(dp[0] + " "); 
  
    // For every number starting from 1 
    for (int i = 1; i <= n; i++)  
    { 
  
        // If current number is even 
        if (i % 2 == 0)  
        { 
  
            // Count of set bits in i is equal to 
            // the count of set bits in (i / 2) 
            dp[i] = dp[i / 2]; 
        } 
  
        // If current element is odd 
        else
        { 
  
            // Count of set bits in i is equal to 
            // the count of set bits in (i / 2) + 1 
            dp[i] = dp[i / 2] + 1; 
        } 
  
        // Print the count of set bits in i 
        System.out.print(dp[i] + " "); 
    } 
} 
  
// Driver code 
public static void main(String []args) 
{ 
    int n = 5; 
  
    findSetBits(n); 
} 
} 
  
// This code is contributed by Rajput-Ji 

