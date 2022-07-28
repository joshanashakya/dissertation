

# Python 3 program for above 
# implementation 
import sys 
  
# Function to check if elements 
# are consecutive 
def areConsecutives(arr, n): 
  
    # Find minimum element in array 
    first_term = sys.maxsize 
    for i in range(n): 
        if arr[i] < first_term: 
            first_term = arr[i] 
  
    # Calculate AP sum 
    ap_sum = ((n * (2 * first_term + 
              (n - 1) * 1)) // 2) 
  
    # Calculate given array sum 
    arr_sum = 0
    for i in range( n): 
        arr_sum += arr[i] 
  
    # Compare both sums and return 
    return ap_sum == arr_sum 
  
# Driver Code 
arr = [ 2, 1, 0, -3, -1, -2 ] 
n = len(arr) 
  
if areConsecutives(arr, n): 
    print( "Yes") 
else:  
    print( "No") 
  
# This code is contributed 
# by ChitraNayal 

