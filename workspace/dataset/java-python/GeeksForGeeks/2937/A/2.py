

# Python3 implementation of the approach  
from math import gcd 
  
# Function to return the minimum  
# valid number that satisfies the 
# given conditions  
def minValidNumber(p, q) : 
  
    # If possible  
    if (q % p == 0) :  
        return gcd(p, q)  
    else : 
        return -1
  
# Driver Code  
if __name__ == "__main__" : 
  
    p, q = 2, 6;  
    print(minValidNumber(p, q)) 
  
# This code is contributed by Ryuga 

