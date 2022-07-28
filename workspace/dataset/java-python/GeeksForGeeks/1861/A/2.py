

# Pyhton 3 program to maximize the Bitwise 
# OR Sum in given array 
  
# Function to maximize the bitwise 
# OR sum 
def maxOR(arr, n, k, x): 
  
    preSum = [0] * (n + 1)  
    suffSum = [0] * (n + 1) 
    pow = 1
  
    # Compute x^k 
    for i in range(0 ,k): 
        pow *= x 
  
    # Find prefix bitwise OR 
    preSum[0] = 0
    for i in range(0, n): 
        preSum[i + 1] = preSum[i] | arr[i] 
  
    # Find suffix bitwise OR 
    suffSum[n] = 0
    for i in range(n-1, -1, -1): 
        suffSum[i] = suffSum[i + 1] | arr[i] 
  
    # Find maximum OR value 
    res = 0
    for i in range(0 ,n): 
        res = max(res, preSum[i] |  
           (arr[i] * pow) | suffSum[i + 1]) 
  
    return res 
  
# Drivers code 
arr = [1, 2, 4, 8 ] 
n = len(arr)  
k = 2
x = 3
print(maxOR(arr, n, k, x)) 
  
# This code is contributed by Smitha 

