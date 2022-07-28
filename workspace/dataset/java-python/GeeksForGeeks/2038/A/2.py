

# Python3 implementation of the  
# above approach  
  
# Function to return a^n % mod  
def power(a, n):  
  
    if n == 0: 
        return 1
  
    p = power(a, n // 2) % mod  
    p = (p * p) % mod  
    if n & 1 == 1:  
        p = (p * a) % mod  
      
    return p  
  
# Compute sum of max(A) - min(A)  
# for all subsets  
def computeSum(arr, n):  
  
    # Sort the array.  
    arr.sort() 
  
    Sum = 0
    for i in range(0, n):  
  
        # Maxs = 2^i - 1  
        maxs = (power(2, i) - 1 + mod) % mod  
        maxs = (maxs * arr[i]) % mod  
  
        # Mins = 2^(n-1-i) - 1  
        mins = (power(2, n - 1 - i) - 
                      1 + mod) % mod  
        mins = (mins * arr[i]) % mod  
  
        V = (maxs - mins + mod) % mod  
        Sum = (Sum + V) % mod  
      
    return Sum
  
# Driver code  
if __name__ =="__main__": 
  
    mod = 1000000007
    arr = [4, 3, 1]  
    n = len(arr)  
  
    print(computeSum(arr, n))  
  
# This code is contributed 
# by Rituraj Jain 

