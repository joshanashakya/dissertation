

# Python3 implementation of the approach  
import math 
import sys 
  
# Function to return the minimum  
# number of operations required  
def changeTheArray(arr, n): 
      
    # Minimum and maximum elements 
    # from the array  
    minEle = min(arr) 
    maxEle = max(arr) 
  
    # To store the minimum number of  
    # operations required  
    minOperations = sys.maxsize 
  
    for num in range(minEle, maxEle + 1): 
          
        # To store the number of operations required  
        # to change every element to either  
        # (num - 1), num or (num + 1)  
        operations = 0
        for i in range(n): 
  
                # If current element is not already num 
                if arr[i] != num: 
                        operations += (abs(num - arr[i]) - 1) 
          
        # Update the minimum operations so far  
        minOperations = min(minOperations, operations) 
    return minOperations 
  
# Driver code 
if __name__=='__main__': 
    arr = [10, 1, 4] 
    n = len(arr) 
    print(changeTheArray(arr, n)) 
  
# This code is contributed by Vikash Kumar 37 

