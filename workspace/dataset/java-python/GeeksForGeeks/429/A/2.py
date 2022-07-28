

# Python implementation of the approach  
  
# Function to return the number of  
# pairs (x, y) such that x < y  
def getPairs(a): 
      
    # Length of the array  
    n = len(a) 
      
    # Calculate the number of valid pairs  
    count = (n * (n - 1)) // 2
      
    # Return the count of valid pairs  
    return count 
      
# Driver code  
a = [2, 4, 3, 1] 
print(getPairs(a))  
  
# This code is contributed by SHUBHAMSINGH10 

