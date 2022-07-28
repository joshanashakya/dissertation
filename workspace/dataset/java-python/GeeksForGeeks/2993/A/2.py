

# Python3 Program to find 
# maximum binomial 
# coefficient term 
# Returns value of  
# Binomial Coefficient C(n, k) 
def binomialCoeff(n, k): 
  
    C=[[0 for x in range(k+1)] for y in range(n+1)]  
  
    # Calculate value of 
    # Binomial Coefficient  
    # in bottom up manner 
    for i in range(n+1): 
        for j in range(min(i,k)+1): 
            # Base Cases 
            if (j == 0 or j == i): 
                C[i][j] = 1; 
  
            # Calculate value 
            # using previously 
            # stored values 
            else: 
                C[i][j] = C[i - 1][j - 1] + C[i - 1][j]; 
  
    return C[n][k]; 
  
  
# Return maximum binomial 
# coefficient term value. 
def maxcoefficientvalue(n): 
    # if n is even 
    if (n % 2 == 0): 
        return binomialCoeff(n, int(n / 2)); 
          
    # if n is odd 
    else: 
        return binomialCoeff(n, int((n + 1) / 2)); 
  
# Driver Code 
if __name__=='__main__': 
    n = 4; 
    print(maxcoefficientvalue(n)); 
  
# This code is contributed by mits 

