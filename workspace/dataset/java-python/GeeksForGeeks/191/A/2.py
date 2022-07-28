

# Python 3 implementation  
# of above approach 
  
# Function to check the condition  
def check(H, S) : 
  
    # Condition for triangle to exist  
    return H * H >= 4 * S 
  
# Function to find all pairs 
def findPairs(H, n, S, m): 
  
    count = 0
  
    # Checking all possible pairs  
    for i in range(n) : 
        for j in range(m) : 
            if check(H[i], S[j]) : 
                count += 1
  
    return count 
  
# Driver Code 
if __name__ == "__main__" : 
  
    H = [ 1, 6, 4] 
    n = len(H) 
  
    S = [ 23, 3, 42, 14] 
    m = len(S) 
  
    # function calling  
    print(findPairs(H, n, S,m)) 
      
# This code is contributed by ANKITRAI1 

