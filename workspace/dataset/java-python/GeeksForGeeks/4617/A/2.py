

# Python3 program to Find the Ratio 
# of number of Elements in two Arrays 
# from their individual and combined Average 
from math import gcd 
  
# function to find the ratio 
# of number of array elements 
def FindRatio(a, b, c): 
  
    up = abs(b - c) 
    down = abs(c - a) 
  
    # calculating GCD of them 
    g = gcd(up, down) 
  
    # make neumarator and 
    # denominator coprime 
    up //= g 
    down //= g 
  
    print(up,":", down) 
  
# Driver Code 
a = 4
b = 10
c = 6
  
FindRatio(a, b, c) 
  
# This code is contributed by Mohit Kumar 

