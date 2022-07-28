

# Python3 program to find the sum of 
# the addition of all possible subsets 
from math import gcd as __gcd 
MAX = 100
  
# Recursive function to find the  
# maximum value of the given recurrence 
def recur(ind, cnt, last, a, n, k, dp): 
  
    # If we get K elements 
    if (cnt == k): 
        return 0
  
    # If we have reached the end 
    # and K elements are not there 
    if (ind == n): 
        return -10**9
  
    # If the state has been visited 
    if (dp[ind][cnt] != -1): 
        return dp[ind][cnt] 
    ans = 0
  
    # Iterate for every element as the 
    # next possible element 
    # and take the element which gives 
    # the maximum answer 
    for i in range(ind, n): 
          
        # If this element is the first element 
        # in the individual pair in the subsequence 
        # then simply recurrence with the last 
        # element as i-th index 
        if (cnt % 2 == 0): 
            ans = max(ans, recur(i + 1, cnt + 1,  
                                 i, a, n, k, dp)) 
  
        # If this element is the second element in 
        # the individual pair, the find gcd with 
        # the previous element and add to the answer 
        # and recur for the next element 
        else: 
            ans = max(ans, __gcd(a[last], a[i]) + 
                      recur(i + 1, cnt + 1, 0, a, n, k, dp)) 
  
    dp[ind][cnt] = ans 
    return ans 
  
# Driver Code 
a = [4, 5, 3, 7, 8, 10, 9, 8 ] 
  
n = len(a) 
k = 4; 
dp = [[-1 for i in range(MAX)]  
          for i in range(n)] 
  
print(recur(0, 0, 0, a, n, k, dp)) 
  
# This code is contributed by Mohit Kumar 

