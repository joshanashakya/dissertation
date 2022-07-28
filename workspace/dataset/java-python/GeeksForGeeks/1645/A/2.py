

# Python3 implementation of the approach  
import numpy as np 
  
right = 3;  
left = 6;  
  
dp = np.ones((left, right)) 
dp = -1 * dp 
  
# Function to find the maximum  
# subarray sum with flips starting  
# from index i  
def findSubarraySum(ind, flips, n, a, k) :  
  
    # If the number of flips 
    # have exceeded  
    if (flips > k) : 
        return -1e9;  
  
    # Complete traversal  
    if (ind == n) :  
        return 0;  
  
    # If the state has previously  
    # been visited  
    if (dp[ind][flips] != -1) : 
        return dp[ind][flips]; 
      
    # Initially  
    ans = 0;  
  
    # Use Kadane's algorithm and 
    # call two states  
    ans = max(0, a[ind] + 
              findSubarraySum(ind + 1, 
                              flips, n, a, k));  
    ans = max(ans, -a[ind] + 
              findSubarraySum(ind + 1, flips + 1,  
                                       n, a, k));  
  
    # Memoize the answer and return it  
    dp[ind][flips] = ans;  
      
    return dp[ind][flips] ; 
  
# Utility function to call flips  
# from index and return the answer  
def findMaxSubarraySum(a, n, k) :  
  
    ans = -1e9; 
      
    # Iterate and call recurive  
    # function from every index to 
    # get the maximum subarray sum  
    for i in range(n) :  
        ans = max(ans, findSubarraySum(i, 0, n, a, k));  
  
    return ans;  
  
# Driver Code  
if __name__ == "__main__" : 
  
    a = [-1, -2, -100, -10];  
    n = len(a) ; 
    k = 1;  
  
    print(findMaxSubarraySum(a, n, k)); 
      
# This code is contributed by Ryuga 

