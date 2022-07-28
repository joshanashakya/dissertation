

# Python3 implementation of the approach  
from math import gcd 
  
# Function to return the LCM of two numbers  
def lcm( x, y) : 
      
    temp = (x * y) // gcd(x, y);  
    return temp;  
  
# Function to print the requried numbers  
def findNumbers(a, n, b, m) :  
  
    # To store the lcm of array a[] elements  
    # and the gcd of array b[] elements  
    lcmA = 1; __gcdB = 0;  
  
    # Finding LCM of first array  
    for i in range(n) :  
        lcmA = lcm(lcmA, a[i]);  
  
    # Finding GCD of second array  
    for i in range(m) :  
        __gcdB = gcd(__gcdB, b[i]);  
  
    # No such element exists  
    if (__gcdB % lcmA != 0) : 
        print("-1");  
        return;  
  
    # All the multiples of lcmA which are  
    # less than or equal to gcdB and evenly  
    # divide gcdB will satisfy the conditions  
    num = lcmA;  
    while (num <= __gcdB) : 
        if (__gcdB % num == 0) : 
            print(num, end = " ");  
              
        num += lcmA;  
  
# Driver code  
if __name__ == "__main__" :  
  
    a = [ 1, 2, 2, 4 ]; 
    b = [ 16, 32, 64 ]; 
      
    n = len(a); 
    m = len(b); 
      
    findNumbers(a, n, b, m);  
      
# This code is contributed by AnkitRai01 

