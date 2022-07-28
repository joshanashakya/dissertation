

# Python3 for finding number of binary strings 
# number of '0' in first half is double the 
# number of '0' in second half of string 
  
# pre define some constant 
mod = 1000000007
Max = 1001
  
# global values for pre computation 
nCr = [[0 for _ in range(1003)]  
          for i in range(1003)] 
  
def preComputeCoeff(): 
  
    for i in range(Max): 
        for j in range(i + 1): 
            if (j == 0 or j == i): 
                nCr[i][j] = 1
            else: 
                nCr[i][j] = (nCr[i - 1][j - 1] + 
                             nCr[i - 1][j]) % mod 
          
# function to print number of required string 
def computeStringCount(N): 
    n = N // 2
    ans = 0
  
    # calculate answer using proposed algorithm 
    for i in range(2, n + 1, 2): 
        ans = (ans + ((nCr[n][i] * 
                       nCr[n][i // 2]) % mod)) % mod 
    return ans 
  
# Driver code 
preComputeCoeff() 
N = 3
print(computeStringCount(N)) 
  
# This code is contributed by mohit kumar 

