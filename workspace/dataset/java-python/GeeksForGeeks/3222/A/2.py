

# Python3 implementation of the approach 
  
# Function to return the required  
# number of operations 
def countOperations(n): 
    i = 2
      
    # Finding the smallest divisor 
    while ((i * i) < n and (n % i)): 
        i += 1
      
    if ((i * i) > n): 
        i = n 
      
    # Return the count of operations 
    return (1 + (n - i)//2) 
  
# Driver code 
n = 5
print(countOperations(n)) 

