

// Java implementation of the approach 
class GFG 
{ 
  
    static int N = 5; 
  
// Function to return the maximum sum 
static int func(int idx, int cur, int a[], 
                int dp[][], int n, int x) 
{ 
  
    // Base case 
    if (idx == n) 
    { 
        return 0; 
    } 
  
    // If already calculated 
    if (dp[idx][cur] != -1) 
    { 
        return dp[idx][cur]; 
    } 
  
    int ans = 0; 
  
    // If no elements have been chosen 
    if (cur == 0) 
    { 
  
        // Do not choose any element and use 
        // Kadane's algorithm by taking max 
        ans = Math.max(ans, a[idx] +  
                func(idx + 1, 0, a, dp, n, x)); 
  
        // Choose the sub-array and multiply x 
        ans = Math.max(ans, x * a[idx] +  
                func(idx + 1, 1, a, dp, n, x)); 
    }  
    else if (cur == 1) 
    { 
  
        // Choose the sub-array and multiply x 
        ans = Math.max(ans, x * a[idx] +  
                func(idx + 1, 1, a, dp, n, x)); 
  
        // End the sub-array multiplication 
        ans = Math.max(ans, a[idx] +  
                func(idx + 1, 2, a, dp, n, x)); 
    }  
    else // No more multiplication 
    { 
        ans = Math.max(ans, a[idx] +  
                func(idx + 1, 2, a, dp, n, x)); 
    } 
  
    // Memoize and return the answer 
    return dp[idx][cur] = ans; 
} 
  
// Function to get the maximum sum 
static int getMaximumSum(int a[], int n, int x) 
{ 
  
    // Initialize dp with -1 
    int dp[][] = new int[n][3]; 
    for (int i = 0; i < n; i++) 
    { 
        for (int j = 0; j < 3; j++) 
        { 
            dp[i][j] = -1; 
        } 
    } 
  
    // Iterate from every position and find the 
    // maximum sum which is possible 
    int maxi = 0; 
    for (int i = 0; i < n; i++) 
    { 
        maxi = Math.max(maxi, func(i, 0, a, dp, n, x)); 
    } 
  
    return maxi; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int a[] = {-3, 8, -2, 1, -6}; 
    int n = a.length; 
    int x = -1; 
    System.out.println(getMaximumSum(a, n, x)); 
  
} 
} 
  
// This code has been contributed by 29AjayKumar 

