

# Python3 implementation of the approach  
  
# import gcd function from math module 
from math import gcd 
  
# Function to find the required numbers  
def findNumbers(a, b) :  
  
    # GCD of the given numbers  
    __gcd = gcd(a, b);  
  
    # Printing the requried numbers  
    print((a // __gcd), (b // __gcd));  
  
# Driver code  
if __name__ == "__main__" :  
  
    a = 12; b = 16;  
  
    findNumbers(a, b);  
  
# This code is contributed by AnkitRai01 

