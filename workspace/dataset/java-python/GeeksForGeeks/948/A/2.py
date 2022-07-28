

# Python3 implementation of the approach 
  
# Function to return the number of  
# subarrays of the given array  
# such that the remainder when dividing  
# the sum of its elements by K is  
# equal to the number of its elements 
def sub_arrays(a, n, k): 
  
    # To store prefix sum 
    sum = [0 for i in range(n + 2)] 
  
    for i in range(n): 
  
        # We are dealing with zero 
        # indexed array 
        a[i] -= 1
  
        # Taking modulus value 
        a[i] %= k 
  
        # Prefix sum 
        sum[i + 1] += sum[i] + a[i] 
        sum[i + 1] %= k 
  
    # To store the required answer,  
    # the left index and the right index 
    ans = 0
    l = 0
    r = 0
  
    # To store si - i value 
    mp = dict() 
  
    for i in range(n + 1): 
  
        # Include sum 
        if sum[i] in mp: 
            ans += mp[sum[i]] 
        mp[sum[i]] = mp.get(sum[i], 0) + 1
  
        # Increment the right index 
        r += 1
  
        # If subarray has at least 
        # k elements 
        if (r - l >= k): 
            mp[sum[l]] -= 1
            l += 1
  
    # Return the required answer 
    return ans 
  
# Driver code 
a = [1, 4, 2, 3, 5] 
n = len(a) 
  
k = 4
  
# Function call 
print(sub_arrays(a, n, k)) 
  
# This code is contributed by Mohit Kumar 

