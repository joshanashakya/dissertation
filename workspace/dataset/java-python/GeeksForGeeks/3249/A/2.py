

# Python3 program to count   
# number of ways to color  
# a N node skewed tree with  
# k colors such that parent  
# and children have different  
# colors. 
  
# fast_way is recursive 
# method to calculate power 
def fastPow(N, K): 
    if (K == 0): 
        return 1; 
      
    temp = fastPow(N, int(K / 2)); 
    if (K % 2 == 0): 
        return temp * temp; 
    else: 
        return N * temp * temp; 
  
def countWays(N, K): 
    return K * fastPow(K - 1, N - 1); 
  
# Driver Code 
N = 3;  
K = 3; 
print(countWays(N, K)); 
  
# This code is contributed by mits 

