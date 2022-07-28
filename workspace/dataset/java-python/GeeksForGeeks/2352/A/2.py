

# Python 3 implementation of the approach 
  
# Function to return the minimum  
# moves required 
def minMoves(n, a, k): 
    ct1 = [0 for i in range(k)] 
    ct0 = [0 for i in range(k)] 
    moves = 0
  
    # Count the number of 1s and 2s 
    # at each X such that i % K = X 
    for i in range(n): 
        if (a[i] == 1): 
            ct1[i % k] += 1
        else: 
            ct0[i % k] += 1
  
    # Choose the minimum elements to change 
    for i in range(k): 
        moves += min(ct1[i], ct0[i]) 
  
    # Return the minimum moves required 
    return moves 
  
# Driver code 
if __name__ == '__main__': 
    k = 2
    a = [1, 0, 0, 0, 1, 0] 
    n = len(a) 
    print(minMoves(n, a, k)) 
  
# This code is contributed by 
# Surendra_Gangwar 

