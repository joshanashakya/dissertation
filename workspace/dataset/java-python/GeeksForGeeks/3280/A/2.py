

# python 3 program to calculate Different ways to 
# represent N as sum of K non-zero integers. 
  
# Returns value of Binomial Coefficient C(n, k) 
def binomialCoeff(n, k): 
    C = [[0 for i in range(k+1)]for i in range(n+1)] 
  
    # Calculate value of Binomial Coefficient in bottom up manner 
    for i in range(0,n+1,1): 
        for j in range(0,min(i, k)+1,1): 
            # Base Cases 
            if (j == 0 or j == i): 
                C[i][j] = 1
  
            # Calculate value using previously stored values 
            else: 
                C[i][j] = C[i - 1][j - 1] + C[i - 1][j] 
  
    return C[n][k] 
  
# Driver Code 
if __name__ == '__main__': 
    n = 5
    k = 3
    print("Total number of different ways are",binomialCoeff(n - 1, k - 1)) 
      
# This code is contributed by 
# Sanjit_Prasad 

