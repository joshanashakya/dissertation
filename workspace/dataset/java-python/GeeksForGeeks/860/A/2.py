

# Python implementation of 
# finding first digit  
# of product of n numbers 
  
import math 
  
# Returns the first digit of 
# product of elements of arr[] 
def FirstDigit (arr, n): 
  
    # stores the logarithm of 
    # product of elements of arr[] 
    S = 0
    for i in range(n): 
        S = S + math.log10(arr[i]*1.0) 
   
    # fractional(s) = s - floor(s) 
    fract_S = S - math.floor(S) 
   
    # ans = 10 ^ fract_s 
    ans = math.pow(10, fract_S) 
    return ans 
   
# Driver function 
  
arr = [5, 8, 3, 7] 
n = len(arr) 
print((int)(FirstDigit(arr, n))) 
      
# This code is contributed 
# by Anant Agarwal. 

