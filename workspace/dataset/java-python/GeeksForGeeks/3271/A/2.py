

# Python3 implementation of the approach 
from math import gcd 
  
# Function to return the count of  
# integers from the range [a, b] that  
# are not divisible by c and d  
def countNums(a, b, c, d) : 
  
    # Numbers which are divisible by c  
    x = b // c - (a - 1) // c;  
  
    # Numbers which are divisible by d  
    y = b // d - (a - 1) // d;  
  
    # Find lowest common factor of c and d  
    k = (c * d) // gcd(c, d);  
  
    # Numbers which are divisible  
    # by both c and d  
    z = b // k - (a - 1) // k;  
  
    # Return the required answer  
    return (b - a + 1 - x - y + z);  
  
# Driver code  
if __name__ == "__main__" :  
  
    a = 10; b = 50; c = 4; d = 6;  
  
    print(countNums(a, b, c, d));  
  
# This code is contributed by AnkitRai01 

