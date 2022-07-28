

# Python 3 implementation of the approach 
  
# Function to return the maximum bitwise AND 
# possible among all the possible pairs 
def maxAND(L, R): 
    maximum = L & R 
  
    for i in range(L, R, 1): 
        for j in range(i + 1, R + 1, 1): 
              
            # Maximum among all (i, j) pairs 
            maximum = max(maximum, (i & j)) 
  
    return maximum 
  
# Driver code 
if __name__ == '__main__': 
    L = 1
    R = 632
    print(maxAND(L, R)) 
  
# This code is contributed by 
# Surendra_Gangwar 

