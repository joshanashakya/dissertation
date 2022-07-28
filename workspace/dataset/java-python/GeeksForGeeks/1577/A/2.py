

# Python 3 implementation  
# of above approach 
import math 
  
# Function to print a:b:c 
def solveProportion(a, b1, b2, c): 
  
    A = a * b2 
    B = b1 * b2 
    C = b1 * c 
  
    # To print the given proportion 
    # in simplest form. 
    gcd1 = math.gcd(math.gcd(A, B), C) 
  
    print( str(A // gcd1) + ":" +
           str(B // gcd1) + ":" +
           str(C // gcd1)) 
  
# Driver code 
if __name__ == "__main__": 
  
    # Get ratio a:b1 
    a = 3
    b1 = 4
  
    # Get ratio b2:c 
    b2 = 8
    c = 9
  
    # Find the ratio a:b:c 
    solveProportion(a, b1, b2, c) 
  
# This code is contributed  
# by ChitraNayal 

