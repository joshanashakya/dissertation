

# Python3 Program to find the number  
# of arrays of size N whose elements  
# are positive integers and sum is K 
  
# Return nCr 
def binomialCoeff(n, k): 
  
    C = [0] * (k + 1); 
      
    C[0] = 1; # nC0 is 1 
  
    for i in range(1, n + 1): 
  
        # Compute next row of pascal  
        # triangle using the previous row 
        for j in range(min(i, k), 0, -1): 
            C[j] = C[j] + C[j - 1]; 
    return C[k]; 
  
# Return the number of array that  
# can be formed of size n and  
# sum equals to k. 
def countArray(N, K): 
  
    return binomialCoeff(K - 1, N - 1); 
  
# Driver Code 
N = 2; 
K = 3; 
  
print(countArray(N, K)); 
  
# This code is contributed by mits 

