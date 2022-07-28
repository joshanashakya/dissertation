

# Python3 implementation of the approach 
  
# Function to return the maximum bitwise OR 
# possible among all the possible pairs 
def maxOR(L, R): 
    maximum = -10**9
  
    # Check for every possible pair 
    for i in range(L, R): 
        for j in range(i + 1, R + 1): 
  
            # Maximum among all (i, j) pairs 
            maximum = max(maximum, (i | j)) 
  
    return maximum 
  
# Driver code 
L = 4
R = 5
  
print(maxOR(L, R)) 
  
# This code is contributed by Mohit Kumar 

