

# Python 3 implementation of the approach 
  
# Function that returns true if x 
# is a power of 2 
def isPowerOfTwo(x): 
    if (x == 0): 
        return False
  
    # If x & (x-1) = 0 then x is a power of 2 
    if ((x & (x - 1)) == 0): 
        return True
    else: 
        return False
  
# Function to return the required count 
def countNum(a, n): 
    count = 0
  
    for i in range(0, n, 1): 
          
        # If a[i] or (a[i]+1) is a power of 2 
        if (isPowerOfTwo(a[i]) or
            isPowerOfTwo(a[i] + 1)): 
            count += 1
  
    return count 
  
# Driver code 
if __name__ == '__main__': 
    arr = [5, 6, 9, 3, 1] 
  
    n = len(arr) 
  
    print(countNum(arr, n)) 
  
# This code is contributed by 
# Sanjit_Prasad 

