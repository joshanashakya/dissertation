

# Python3 implementation of the approach 
from math import gcd as __gcd 
  
# Function to return the largest number 
# that divides the maximum elements 
# fom the given array 
def findLargest(arr, n): 
  
    # Finding gcd of all the numbers 
    # in the array 
    gcd = 0
    for i in range(n): 
        gcd = __gcd(arr[i], gcd) 
    return gcd 
  
# Driver code 
if __name__ == '__main__': 
    arr = [3, 6, 9] 
    n = len(arr) 
  
    print(findLargest(arr, n)) 
  
# This code is contributed by Mohit Kumar 

