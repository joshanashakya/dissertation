

# Python3 implementation of the approach  
from math import gcd 
  
# Function to return the smallest number  
# which on dividing with any element from  
# the range [2, N] leaves a remainder of 1  
def getMinNum(N) :  
  
    # Find the LCM of the elements  
    # from the range [2, N]  
    lcm = 1;  
    for i in range(2, N + 1) : 
        lcm = ((i * lcm) // (gcd(i, lcm)));  
  
    # Return the required number  
    return (lcm + 1);  
  
  
# Driver code  
if __name__ == "__main__" :  
  
    N = 5;  
  
    print(getMinNum(N));  
  
# This code is contributed by AnkitRai01 

