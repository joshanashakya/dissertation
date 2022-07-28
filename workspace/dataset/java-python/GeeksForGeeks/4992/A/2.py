

# Python3 implementation of the approach  
from math import sqrt,floor 
  
# Function that returns true if  
# x is a perfect square  
def isPerfectSquare(x) :  
  
    # Find floating point value of  
    # square root of x  
    sr = sqrt(x) 
  
    # If square root is an integer  
    return ((sr - floor(sr)) == 0) 
  
# Function that returns true if  
# n is a Fibonacci Number  
def isFibonacci(n ) :  
  
    return (isPerfectSquare(5 * n * n + 4) or
            isPerfectSquare(5 * n * n - 4)) 
  
# Function to return the count of distinct pairs  
# from the given array such that the sum of the  
# pair elements is a Fibonacci number  
def totalPairs(a, b, n, m) : 
  
    # Set is used to avoid duplicate pairs  
    s = set();  
  
    for i in range(n) : 
        for j in range(m) : 
  
            # If sum is a Fibonacci number  
            if (isFibonacci(a[i] + b[j]) == True) : 
                if (a[i] < b[j]) : 
                    s.add((a[i], b[j]));  
                else : 
                    s.add((b[j], a[i]));  
  
    # Return the size of the set  
    return len(s);  
  
# Driver code  
if __name__ == "__main__" :  
      
    a = [ 99, 1, 33, 2 ];  
    b = [ 1, 11, 2 ]; 
    n = len(a); 
    m = len(b);  
  
    print(totalPairs(a, b, n, m));  
  
# This code is contributed by Ryuga 

