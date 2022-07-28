

# Python3 program to calculate the   
# terms of summing of sum series  
    
MOD = 1000000007 
    
# Function to calculate  
# twice of sum of first N natural numbers  
def Sum(N):  
       
    val = N * (N + 1)  
    
    # taking modulo 10 ^ 9 + 7  
    val = val % MOD  
    
    return val  
    
# Function to calculate the  
# terms of summing of sum series  
def sumX(N, M, K):  
       
    for i in range(M): 
        N = int(Sum(K + N))  
           
    N = N % MOD  
    return N  
    
if __name__ == "__main__": 
       
    N, M, K = 1, 2, 3
    print(sumX(N, M, K))  
  
# This code is contributed by Rituraj Jain 

