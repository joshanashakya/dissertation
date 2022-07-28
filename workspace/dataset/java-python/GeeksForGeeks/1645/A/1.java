

// Java implementation of the approach 
class GFG 
{ 
      
static int right = 2; 
static int left = 4; 
static int[][] dp = new int[left][right]; 
  
// Function to find the maximum subarray sum with flips 
// starting from index i 
static int findSubarraySum(int ind, int flips,  
                            int n, int []a, int k) 
{ 
  
    // If the number of flips have exceeded 
    if (flips > k) 
        return (int)(-1e9); 
  
    // Complete traversal 
    if (ind == n) 
        return 0; 
  
    // If the state has previously been visited 
    if (dp[ind][flips] != -1) 
        return dp[ind][flips]; 
  
    // Initially 
    int ans = 0; 
  
    // Use Kadane's algorithm and call two states 
    ans = Math.max(0, a[ind] 
        + findSubarraySum(ind + 1, flips, n, a, k)); 
    ans = Math.max(ans, -a[ind] 
        + findSubarraySum(ind + 1, flips + 1, n, a, k)); 
  
    // Memoize the answer and return it 
    return dp[ind][flips] = ans; 
} 
  
// Utility function to call flips from index and 
// return the answer 
static int findMaxSubarraySum(int []a, int n, int k) 
{ 
    // Create DP array 
    // int dp[n,k+1]; 
    for (int i = 0; i < n; i++) 
    for (int j = 0; j < k+1; j++) 
    dp[i][j]=-1; 
  
    int ans = (int)(-1e9); 
  
    // Iterate and call recurive function 
    // from every index to get the maximum subarray sum 
    for (int i = 0; i < n; i++) 
        ans = Math.max(ans, findSubarraySum(i, 0, n, a, k)); 
  
    return ans; 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
    int[] a = { -1, -2, -100, -10 }; 
    int n = a.length; 
    int k = 1; 
  
    System.out.println(findMaxSubarraySum(a, n, k)); 
  
} 
} 
  
// This code is contributed by mits 

