

# Python3 program to find special numbers 
# in an array 
import math as mt 
  
# Function to find special numbers 
def divisibilityCheck(arr, n): 
  
    # Storing all array elements in a hash 
    # and finding maximum element in array 
    s = dict() 
    max_ele = -10**9
    for i in range(n):  
        s[arr[i]] = 1
  
        # finding maximum element of array 
        max_ele = max(max_ele, arr[i]) 
      
    # traversing array element and storing  
    # the array multiples that are present  
    # in s in res. 
    res = dict() 
    for i in range(n):  
  
        # Check for non-zero values only 
        if (arr[i] != 0): 
  
            # checking the factor of current element 
            for j in range(arr[i] * 2,  
                           max_ele + 1, arr[i]): 
                  
                # if factor is already part of  
                # array element then store it 
                if (j in s.keys()): 
                    res[j] = 1
              
    # displaying elements that are divisible  
    # by at least one other in array 
    for x in res: 
        print(x, end = " ") 
  
# Driver code 
arr = [ 2, 3, 8, 6, 9, 10]  
n = len(arr) 
divisibilityCheck(arr, n) 
  
# This code is contributed by  
# Mohit Kumar 29 

