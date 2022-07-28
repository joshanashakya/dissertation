

# Python 3 implementation of the approach 
mod = 1000000007
  
# Iterative Function to calculate (x^y)%p in O(log y) 
def power(x, y, p): 
    res = 1 # Initialize result 
  
    x = x % p # Update x if it is more than or 
              # equal to p 
  
    while (y > 0): 
          
        # If y is odd, multiply x with result 
        if (y & 1): 
            res = (res * x) % p 
  
        # y must be even now 
        y = y >> 1 # y = y/2 
        x = (x * x) % p 
  
    return res 
  
# Function to count the number of binary 
# strings of length N having only 0's and 1's 
def findCount(N): 
    count = power(2, N, mod) 
    return count 
  
# Driver code 
if __name__ == '__main__': 
    N = 25
    print(findCount(N)) 
  
# This code is contributed by 
# Surendra_Gangwar 

