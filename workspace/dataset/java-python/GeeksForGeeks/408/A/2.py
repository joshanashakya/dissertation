

# Python3 implementation of above approach 
import sys 
  
# Function to return length of smallest  
# subarray containing both maximum and  
# minimum value 
def minSubarray(A, n): 
  
    # find maximum and minimum 
    # values in the array 
    minValue = min(A) 
    maxValue = max(A) 
  
    pos_min, pos_max, ans = -1, -1, sys.maxsize 
  
    # iterate over the array and set answer 
    # to smallest difference between position 
    # of maximum and position of minimum value 
    for i in range(0, n): 
          
        # last occurrence of minValue 
        if A[i] == minValue: 
            pos_min = i 
  
        # last occurrence of maxValue 
        if A[i] == maxValue: 
            pos_max = i 
  
        if pos_max != -1 and pos_min != -1 : 
            ans = min(ans, abs(pos_min - pos_max) + 1) 
  
    return ans 
  
# Driver code 
A = [ 1, 5, 9, 7, 1, 9, 4 ] 
n = len(A) 
  
print(minSubarray(A, n)) 
  
# This code is contributed 
# by Saurabh_Shukla 

