

# Python3 implementation of above approach 
import math 
  
# Function to return minimum 
# number of insertions required 
def minInsertions(H, n, K): 
  
    # Initialize insertions to 0 
    inser = 0; 
  
    for i in range(1, n): 
        diff = abs(H[i] - H[i - 1]); 
  
        if (diff <= K): 
            continue; 
        else: 
            inser += math.ceil(diff / K) - 1; 
  
    # return total insertions 
    return inser; 
  
# Driver Code 
H = [2, 4, 8, 16 ]; 
K = 3; 
n = len(H); 
print(minInsertions(H, n, K)); 
  
# This code is contributed  
# by mits 

