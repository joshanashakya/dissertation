

# Python 3 program to implement  
# above approach 
from math import gcd, sqrt 
  
# Recursive function to count 
# the number of unset bits 
def countBits(n): 
      
    # Base case 
    if (n == 0): 
        return 0
  
    # unset bit count 
    else: 
        return (((n & 1) == 0) + 
                  countBits(n >> 1)) 
  
# Function to return the max gcd 
def maxGcd(n): 
      
    # If no unset bits 
    if (countBits(n) == 0): 
          
        # Find the maximum factor 
        for i in range(2, int(sqrt(n)) + 1): 
              
            # Highest factor 
            if (n % i == 0): 
                return int(n / i) 
          
    else: 
        val = 0
        power = 1
        dupn = n 
  
        # Find the flipped bit number 
        while (n): 
              
            # If bit is not set 
            if ((n & 1) == 0): 
                val += power 
  
            # Next power of 2 
            power = power * 2
  
            # Right shift the number 
            n = n >> 1
          
        # Return the answer 
        return gcd(val ^ dupn, val & dupn) 
  
    # If a prime number 
    return 1
  
# Driver Code 
if __name__ == '__main__': 
      
    # First example 
    n = 5
    print(maxGcd(n)) 
  
    # Second example 
    n = 15
    print(maxGcd(n)) 
  
# This code is contributed by 
# Surendra_Gangwar 

