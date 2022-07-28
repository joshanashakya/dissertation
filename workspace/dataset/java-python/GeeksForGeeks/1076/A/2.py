

# Python3 implementation of the approach 
from math import gcd as __gcd 
  
# Function that returns True if num 
# is of the form x*x*x*...*y*y*... 
def isDivisible(num, x, y): 
  
    # While num divisible is divible 
    # by either x or y, keep dividing 
    while (num % x == 0 or num % y == 0): 
        if (num % x == 0): 
            num //= x 
        if (num % y == 0): 
            num //= y 
  
    # If num > 1, it means it cannot be 
    # further divided by either x or y 
    if (num > 1): 
        return False
  
    return True
  
# Function that returns True if all 
# the array elements can be made 
# equal with the given operation 
def isPossible(arr, n, x, y): 
  
    # To store the gcd of the array elements 
    gcd = arr[0] 
    for i in range(1,n): 
        gcd = __gcd(gcd, arr[i]) 
  
    # For every element of the array 
    for i in range(n): 
  
        # Check if k is of the form x*x*..*y*y*... 
        # where (gcd * k = arr[i]) 
        if (isDivisible(arr[i] // gcd, x, y) == False): 
            return False
    return True
  
  
# Driver code 
  
arr = [2, 4, 6, 8] 
n = len(arr) 
x = 2
y = 3
  
if (isPossible(arr, n, x, y) == True): 
    print("Yes") 
else: 
    print("No") 
      
# This code is contributed by mohit kumar 29 

