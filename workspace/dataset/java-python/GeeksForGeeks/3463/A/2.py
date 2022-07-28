

# Python3 implementation of the  
# above approach 
INF = 99999
size = 10
  
# Function to count sum of set bits 
# of all numbers till N 
def getSetBitsFromOneToN(N): 
  
    two, ans = 2, 0
    n = N 
  
    while (n > 0): 
        ans += (N // two) * (two >> 1) 
  
        if ((N & (two - 1)) > (two >> 1) - 1): 
            ans += (N & (two - 1)) - (two >> 1) + 1
  
        two <<= 1
        n >>= 1
    return ans 
  
# Function to find the minimum number 
def findMinimum(x): 
  
    low = 0
    high = 100000
  
    ans = high 
  
    # Binary search for the lowest number 
    while (low <= high):  
  
        # Find mid number 
        mid = (low + high) >> 1
  
        # Check if it is atleast x 
        if (getSetBitsFromOneToN(mid) >= x): 
  
            ans = min(ans, mid) 
            high = mid - 1
        else: 
            low = mid + 1
      
    return ans 
  
# Driver Code 
x = 20
print(findMinimum(x)) 
  
# This code is contributed by 
# Mohit kumar 29 

