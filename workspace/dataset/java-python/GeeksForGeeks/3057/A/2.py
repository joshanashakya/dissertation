

# Python3 implementation of the approach 
  
# Function to return the sum of 
# the first n natural numbers 
def summ(n): 
    suum = (n * (n + 1)) // 2
    return suum 
  
# Function to return the repeated sum 
def repeatedSum(n, k): 
  
    # Perform the operation exactly k times 
    for i in range(k): 
  
        # Update n with the sum of 
        # first n natural numbers 
        n = summ(n) 
  
    return n 
  
# Driver code 
n = 2
k = 2
  
print(repeatedSum(n, k)) 
  
# This code is contributed by Mohit Kumar 

