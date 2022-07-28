

# Python3 to check whether given 
# array is breakable or not 
  
# Function to check 
def checkArray(arr, n): 
      
    # Check the result by processing 
    # the first & last element and size 
    return ((arr[0] % 2) and 
            (arr[n - 1] % 2) and (n % 2)) 
  
# Driver code 
arr = [1, 2, 3, 4, 5 ] 
n = len(arr); 
if checkArray(arr, n): 
    print(1) 
else: 
    print(0) 
  
# This code is contributed 
# by Mohit Kumar 

