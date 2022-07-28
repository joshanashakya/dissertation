

# Python3 implementation of the approach  
from math import sqrt, gcd 
  
# Function to find the smallest divisor  
def smallestDivisor(x) : 
      
    # if divisible by 2  
    if (x % 2 == 0) : 
        return 2;  
      
    # iterate from 3 to sqrt(n)  
    for i in range(3, int(sqrt(x)) + 1, 2) : 
        if (x % i == 0) : 
            return i;  
      
    return x  
  
# Function to return smallest possible  
# integer which divides the whole array  
def smallestInteger(arr, n) : 
      
    # To store the GCD of all the 
    # array elements  
    __gcd = 0;  
    for i in range(n) : 
        __gcd = gcd(__gcd, arr[i]);  
  
    # Return the smallest prime factor  
    # of the gcd calculated  
    return smallestDivisor(__gcd);  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 2, 4, 8 ]; 
    n = len(arr); 
      
    print(smallestInteger(arr, n));  
  
# This code is contributed by Ryuga 

