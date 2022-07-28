

# Python3 implementation of above approach 
  
# Function to calculate gcd of two numbers 
def gcd(a, b): 
    if (a == 0): 
        return b 
    return gcd(b % a, a) 
  
# Function to calculate all common  
# divisors of two given numbers 
# a, b --> input eger numbers 
def commDiv(a, b): 
      
    # find gcd of a, b 
    n = gcd(a, b) 
  
    a = a // n 
    b = b // n 
  
    print("A =", a, ", B =", b) 
  
# Driver code 
a, b = 10, 15
commDiv(a, b) 
  
# This code is contributed 
# by mohit kumar 

