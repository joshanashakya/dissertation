

# Python implementation of the approach 
N = 10000; 
MOD = 1000000007; 
  
F = [0] * N; 
  
# Function to pre-compute the sequence 
def precompute(): 
  
    # For N = 1 the answer will be 2 
    F[1] = 2; 
  
    # Starting two terms of the sequence 
    F[2] = 3; 
    F[3] = 4; 
  
    # Comute the rest of the sequence 
    # with the relation 
    # F[i] = F[i - 1] + F[i - 2] 
    for i in range(4,N): 
        F[i] = (F[i - 1] + F[i - 2]) % MOD; 
  
# Driver code 
n = 8; 
  
# Pre-compute the sequence 
precompute(); 
print(F[n]); 
  
# This code is contributed by 29AjayKumar 

