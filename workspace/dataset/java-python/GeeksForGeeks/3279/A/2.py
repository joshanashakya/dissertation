

# Python3 implementataion of the approach 
  
# Function to return the 
# value of ncr effectively 
def ncr(n, r): 
    # Initialize the answer 
    ans = 1
  
    for i in range(1,r+1): 
  
        # Divide simultaneously by 
        # i to avoid overflow 
        ans *= (n - r + i) 
        ans //= i 
    return ans 
  
# Function to return the count of required ways 
def totalWays(X, Y, M, W): 
  
    return (ncr(M, X) * ncr(W, Y)) 
  
X = 4
Y = 3
M = 6
W = 5
  
print(totalWays(X, Y, M, W)) 
  
# This code is contributed by mohit kumar 29 

