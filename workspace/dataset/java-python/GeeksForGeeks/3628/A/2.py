

# Python3 implementation of the approach  
from math import gcd as __gcd 
  
# Function that returns true if  
# the exchange is possible  
def isPossible(arr, n, p) :  
  
    # Find the GCD of the array elements  
    gcd = 0;  
    for i in range(n) : 
        gcd = __gcd(gcd, arr[i]);  
  
    # If the exchange is possible  
    if (p % gcd == 0) : 
        return True;  
  
    return False; 
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 6, 9 ];  
    n = len(arr);  
    p = 3;  
  
    if (isPossible(arr, n, p)) : 
        print("Yes");  
    else : 
        print("No");  
          
# This code is contributed by kanugargng 

