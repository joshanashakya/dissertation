

# Python3 implementation of above approach 
  
# Function to find the Length of a 
# longest subarray in which elements 
# greater than K are more than 
# elements not greater than K 
def LongestSubarray(a, n, k): 
  
    pre = [0 for i in range(n)] 
  
    # Create a new array in which we store 1 
    # if a[i] > k otherwise we store -1. 
    for i in range(n): 
        if (a[i] > k): 
            pre[i] = 1
        else: 
            pre[i] = -1
  
    # Taking prefix sum over it 
    for i in range(1, n): 
        pre[i] = pre[i - 1] + pre[i] 
  
    # Len will store maximum 
    # Length of subarray 
    Len = 0
  
    lo = 1
    hi = n 
  
    while (lo <= hi): 
        mid = (lo + hi) // 2
  
        # This indicate there is at least one 
        # subarray of Length mid that has sum > 0 
        ok = False
  
        # Check every subarray of Length mid if 
        # it has sum > 0 or not if sum > 0 then it 
        # will satisfy our required condition 
        for i in range(mid - 1, n): 
  
            # x will store the sum of 
            # subarray of Length mid 
            x = pre[i] 
            if (i - mid >= 0): 
                x -= pre[i - mid] 
  
            # Satisfy our given condition 
            if (x > 0): 
                ok = True
                break
  
        # Check for higher Length as we 
        # get Length mid 
        if (ok == True): 
            Len = mid 
            lo = mid + 1
              
        # Check for lower Length as we 
        # did not get Length mid 
        else: 
            hi = mid - 1
  
    return Len
  
# Driver code 
a = [2, 3, 4, 5, 3, 7] 
k = 3
n = len(a) 
  
print(LongestSubarray(a, n, k)) 
  
# This code is contributed by Mohit Kumar 

