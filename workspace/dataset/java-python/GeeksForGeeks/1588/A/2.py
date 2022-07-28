

# Python3 program to find sum  
# of modulo K of first N  
# natural numbers. 
  
# Return sum of modulo K of  
# first N natural numbers. 
  
def findSum(N, K): 
    ans = 0; 
  
    # Iterate from 1 to N && 
    # evaluating and adding i % K. 
    for i in range(1, N + 1): 
        ans += (i % K); 
  
    return ans; 
  
# Driver Code 
N = 10;  
K = 2; 
print(findSum(N, K)); 
  
# This code is contributed by mits 

