

# Python3 implementation of the approach  
  
# Recursive function to return  
# the gcd of a and b  
def gcd(a, b):  
      
    # Everything divides 0  
    if (b == 0):  
        return a  
    return gcd(b, a % b)  
  
# Function to print the number of  
# flips for both the sand timers 
def flip(a, b): 
    lcm = (a * b) // gcd(a, b) 
    a = lcm // a 
    b = lcm // b 
    print(a - 1, b - 1) 
  
# Driver code 
a = 10
b = 5
flip(a, b) 
  
# This code is contributed by Mohit Kumar 

