

# Python3 implementation of the approach 
  
# Function to return sum 
def sum(n): 
  
    if (n == 1): 
        return 2; 
    else: 
        return (n * (n + 1) + sum(n - 1)); 
  
# Driver code 
  
n = 2; 
print(sum(n)); 
  
# This code is contributed by mits 

