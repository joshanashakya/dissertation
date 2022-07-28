

# Python3 implementation of the approach  
from math import sqrt 
  
# Function to return the integer  
# part of the geometric mean  
# of the divisors of n  
def geometricMean(n) : 
  
    return int(sqrt(n));  
  
# Driver code  
if __name__ == "__main__" : 
  
    n = 16;  
  
    print(geometricMean(n));  
  
# This code is contributed by AnkitRai01 

