

# Python3 implementation of the approach  
from math import gcd 
  
# Function to return the minimum  
# deletions required  
def MinDeletion(a, n) :  
  
    # To store the GCD of the array  
    __gcd = 0;  
    for i in range(n) : 
        __gcd = gcd(__gcd, a[i]);  
  
    # GCD cannot be 1  
    if (__gcd > 1) : 
        return -1;  
  
    # GCD of the elements is already 1  
    else : 
        return 0;  
  
# Driver code  
if __name__ == "__main__" : 
  
    a = [ 3, 6, 12, 81, 9 ];  
    n = len(a)  
  
    print(MinDeletion(a, n));  
  
# This code is contributed by AnkitRai01 

