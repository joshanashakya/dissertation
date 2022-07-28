

# python program to replace two elements 
# with equal values with one greater. 
from __future__ import print_function 
  
# Function to replace consecutive equal  
# elements 
def replace_elements(arr, n): 
  
    pos = 0 # Index in result 
  
    for i in range(0, n): 
        arr[pos] = arr[i] 
        pos = pos + 1
        while (pos > 1 and arr[pos - 2] 
                        == arr[pos - 1]): 
            pos -= 1
            arr[pos - 1] += 1
          
    # to print new array 
    for i in range(0, pos): 
        print(arr[i], end=" ") 
  
# Driver Code 
arr = [ 6, 4, 3, 4, 3, 3, 5 ] 
n = len(arr) 
replace_elements(arr, n) 
      
# This code is contributed by Sam007 

