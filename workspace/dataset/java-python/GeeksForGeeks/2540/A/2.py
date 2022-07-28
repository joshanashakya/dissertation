

# Python3 program to find sum  
# of product of x and y such  
# that n/x = y (Integer Division) 
import math 
  
# Return the sum of natural  
# number in a range. 
def sumOfRange(a, b): 
    # n*(n+1)/2. 
    i = (a * (a + 1)) >> 1; 
    j = (b * (b + 1)) >> 1; 
    return (i - j); 
  
# Return the sum of product x*y. 
def sumofproduct(n): 
    sum = 0; 
  
    # Iterating i from 1 to sqrt(n) 
    root = int(math.sqrt(n)); 
    for i in range(1, root + 1): 
        # Finding the upper limit. 
        up = int(n / i); 
  
        # Finding the lower limit. 
        low = max(int(n / (i + 1)), root); 
  
        sum += (i * sumOfRange(up, low)); 
        sum += (i * int(n / i)); 
  
    return sum; 
  
# Driven Code 
n = 10; 
print(sumofproduct(n)); 
      
# This code is contributed by mits 

