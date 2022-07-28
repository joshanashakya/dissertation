

# Python implementation of counting 
# pairs such that gcd (a, b) = b 
  
# returns number of valid pairs 
def CountPairs(n): 
      
    # initialize k 
    k = n 
  
    # loop till imin <= n 
    imin = 1
  
    # Initialize result 
    ans = 0
  
    while(imin <= n): 
  
        # max i with given k floor(n / k) 
        imax = n / k 
  
        # adding k*(number of i with 
        # floor(n / i) = k to ans 
        ans += k * (imax - imin + 1) 
  
        # set imin = imax + 1 and 
        # k = n / imin 
        imin = imax + 1
        k = n / imin 
  
    return ans 
      
# Driver code 
print(CountPairs(1)) 
print(CountPairs(2)) 
print(CountPairs(3)) 
  
# This code is contributed by Anant Agarwal. 

