

# Python3 implementation of the approach 
  
# Function that returns true if it is possible 
# to reach end of the array in exactly k jumps 
def isPossible(arr, n, dist, k) : 
  
    # Variable to store the number of 
    # steps required to reach the end 
    req = 0
  
    curr = 0
    prev = 0
  
    for i in range(0, n):  
        while (curr != n and (arr[curr] - arr[prev]) <= dist): 
            curr = curr + 1
        req = req + 1
  
        if (curr == n): 
            break
        prev = curr - 1
      
  
    if (curr != n): 
        return False
  
    # If it is possible to reach the 
    # end in exactly k jumps 
    if (req <= k): 
        return True
  
    return False
  
  
# Returns the minimum maximum distance required 
# to reach the end of the array in exactly k jumps 
def minDistance(arr, n, k): 
  
    l = 0
    h = arr[n - 1] 
  
    # Stores the answer 
    ans = 0
  
    # Binary search to calculate the result 
    while (l <= h):  
        m = (l + h) // 2; 
        if (isPossible(arr, n, m, k)):  
            ans = m 
            h = m - 1
          
        else: 
            l = m + 1
      
  
    return ans 
  
# Driver code 
  
arr = [ 2, 15, 36, 43 ] 
n =  len(arr) 
k = 2
  
print(minDistance(arr, n, k)) 
  
# This code is contributed by ihritik 

