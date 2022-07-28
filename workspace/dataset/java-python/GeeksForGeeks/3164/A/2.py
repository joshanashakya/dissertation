

# Python 3 program to find the last 
# k digits inproduct of array 
import math 
  
# Returns last k digits  
# in product of a[] 
def lastKDigits(a, n, k) : 
      
    num = (int)(math.pow(10, k)) 
      
    # Multiplying array elements 
    # under modulo 10^k. 
    mul = a[0] % num 
      
    for i in range(1,n) : 
        a[i] = a[i] % num 
        mul = (a[i] * mul) % num 
      
    return mul 
      
  
# Driven program 
a = [ 22, 31, 44, 27, 37, 43 ] 
k = 2
n = len(a) 
print(lastKDigits(a, n, k)) 
  
  
# This code is contributed by Nikita Tiwari. 

