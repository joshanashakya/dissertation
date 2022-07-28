

# Python3 implementation of the approach 
from math import ceil, floor 
  
# Utility function to print 
# the array elements 
def printArr(arr, n): 
    for i in range(n): 
        print(arr[i], end = " ") 
  
# Function to generate and print 
# the required array 
def generateArr(arr, n): 
  
    # To switch the ceil and floor 
    # function alternatively 
    flip = True
  
    # For every element of the array 
    for i in range(n): 
  
        # If the number is odd then prthe ceil 
        # or floor value after division by 2 
        if (arr[i] & 1): 
  
            # Use the ceil and floor alternatively 
            flip ^= True
            if (flip): 
                print(int(ceil((arr[i]) / 2)),  
                                   end = " ") 
            else: 
                print(int(floor((arr[i]) / 2)),  
                                    end = " ") 
  
        # If arr[i] is even then it will 
        # be completely divisible by 2 
        else: 
            print(int(arr[i] / 2), end = " ") 
  
# Driver code 
arr = [3, -5, -7, 9, 2, -2] 
n = len(arr) 
  
generateArr(arr, n) 
  
# This code is contributed by Mohit Kumar 

