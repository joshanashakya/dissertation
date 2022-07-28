

# Python3 implementation of the approach 
import math 
  
# Function to return the count  
# of required pairs 
def CountAllPairs(N, K): 
    count = 0
    if( N > K): 
          
        # Initial count 
        count = N - K 
        for i in range(K + 1, N + 1): 
            count = count + ((N - K) // i) 
              
    return count 
      
# Driver code 
N = 11
K = 5
print(CountAllPairs(N, K)) 

