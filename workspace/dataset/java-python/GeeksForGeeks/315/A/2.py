

# Python3 program to compute the longest 
# with sum greater than equal to 0 
import math as mt 
  
# function for the searching the  
# starting index of the subarray 
def search(searchspace, s, e, key): 
      
    # -1 signifies that no starting point  
    # of the subarray is not found with  
    # sum greater than equal to 0. 
      
    ans = -1
      
    # Binary search 
    while s <= e: 
        mid = (s + e) // 2
          
        if searchspace[mid] - key >= 0: 
            ans = mid 
            e = mid - 1
        else: 
            s = mid + 1
    return ans 
      
# function to return the longest subarray 
def longestSubarray(a, n): 
    # Array for the suffix sum of 
    # the above the array 
    SuffixSum = [0 for i in range(n + 1)] 
      
    for i in range(n - 1, -1, -1): 
        SuffixSum[i] = SuffixSum[i + 1] + a[i] 
      
    ans = 0
      
    # Search Space for potential starting 
    # points of the subarray. 
    # It will store the suffix sum 
    # till i'th index in increasing order 
    searchspace = [0 for i in range(n)] 
      
    # It will store the indexes 
    # till which the suffix sum 
    # is present in search space 
    index = [0 for i in range(n)] 
      
    j = 0
      
    for i in range(n): 
          
        # add the element to the search space  
        # if the j=0 or if the topmost element  
        # is lesser than present suffix sum 
        if j == 0 or (SuffixSum[i] >  
                      searchspace[j - 1]): 
            searchspace[j] = SuffixSum[i] 
            index[j] = i 
            j += 1
      
        idx = search(searchspace, 0, j - 1, 
                     SuffixSum[i + 1]) 
                       
        # Only when idx is not -1 an subarray is 
        # possible with ending index at i. 
        if idx != -1: 
            ans = max(ans, i - index[idx] + 1) 
      
    return ans 
  
# Driver Code 
a = [-1, 4, -2, -5, 6, -8] 
   
n = len(a) 
print(longestSubarray(a, n)) 
  
# This code is contributed  
# by Mohit kumar 29 

