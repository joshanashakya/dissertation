

# Python3 program to find maximum  
# sum pair from two arrays  
import sys 
  
# Function to find maximum sum  
# pair from two arrays  
def maxSumPair(arr1, n1, arr2, n2):  
  
    max1 = -sys.maxsize -1 # max from 1st array  
    max2 = -sys.maxsize -1 # max from 2nd array  
  
    # Find max from 1st array  
    for i in range(0, n1):  
        if (arr1[i] > max1):  
            max1 = arr1[i] 
      
    # Find max from 2nd array  
    for i in range(0, n2):  
        if (arr2[i] > max2):  
            max2 = arr2[i] 
      
    # Return sum of max from  
    # both arrays  
    return max1 + max2  
  
# Driver Code  
arr1 = [ 10, 2, 3 ]  
  
arr2 = [ 3, 4, 7 ]  
  
n1 = len(arr1)  
  
n2 = len(arr2) 
  
print(maxSumPair(arr1, n1, arr2, n2))  
  
# This code is contributed  
# by Yatin Gupta 

