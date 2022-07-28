

# Python3 implementation of the approach 
def solve(arr, n): 
    b = [0 for i in range(n)] 
    p = 0
    i = n - 1
    while i >= 0: 
        b[p] = arr[i] 
        i -= 1
        if (i >= 0): 
            b[n - 1 - p] = arr[i] 
        p += 1
        i -= 1
    return b 
  
# Driver Code 
arr = [1, 2, 3, 4] 
n = len(arr) 
  
b = solve(arr, n) 
  
print(b) 
  
# This code is contributed by Mohit kumar 

