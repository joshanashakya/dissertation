

import sys 
# Python3 program to find the smallest  
# number to be added to make the  
# sum of left and right subarrays equal 
  
# Function to find the minimum 
# value to be added 
def findMinEqualSums(a, N): 
  
    # Variable to store entire  
    # array sum 
    sum = 0
    for i in range(0,N):  
      
        sum = sum+a[i] 
      
  
    # Variables to store sum of 
    # subarray1 and subarray 2 
    sum1 = 0
    sum2 = 0
  
    # minimum value to be added 
    min = sys.maxsize 
  
    # Traverse through the array 
    for i in range(0, N-1):  
      
        # Sum of both halves 
        sum1 += a[i] 
        sum2 = sum - sum1 
  
        # Calculate minimum number  
        # to be added 
        if (abs(sum1 - sum2) < min): 
            min = abs(sum1 - sum2) 
          
  
        if (min == 0) : 
          
            break
    return min
  
# Driver code 
if __name__=='__main__': 
    a = [3, 2, 1, 5, 7, 8] 
  
    # Length of array 
    N = len(a)  
  
    print(findMinEqualSums(a, N)) 
  
# This code is contributed 
# by Shivi_Aggarwal 

