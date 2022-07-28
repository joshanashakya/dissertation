

# Python3 implementation of the approach 
  
# Function to return the count 
# of the required numbers 
def countNum(N, arr): 
      
    # Initialize Sum and count to 0 
    Sum, count = 0, 0
  
    # Calculate Sum of all the  
    # array elements 
    for i in range(N): 
        Sum += arr[i] 
  
    for i in range(N): 
  
        # If current element satifies  
        # the condition 
        if ((Sum - arr[i]) % arr[i] == 0): 
            count += 1
  
    # Return the count of required  
    # elements 
    return count 
  
# Driver code 
arr = [ 3, 10, 4, 6, 7 ] 
n = len(arr) 
print(countNum(n, arr)) 
  
# This code is contributed  
# by Mohit Kumar 

