

# Python3 implementation of the approach 
from math import gcd as __gcd 
  
# Function to return the final number 
# obtained after performing the 
# given operation 
def finalNum(arr, n): 
  
    # Find the gcd of the array elements 
    result = arr[0] 
    for i in arr: 
        result = __gcd(result, i) 
    return result 
  
# Driver code 
arr = [3, 9, 6, 36] 
n = len(arr) 
  
print(finalNum(arr, n)) 
  
# This code is contributed by Mohit Kumar 

