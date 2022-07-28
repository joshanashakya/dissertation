

# Python3 Program to find  
# maximum binomial  
# coefficient term 
  
# Return maximum binomial  
# coefficient term value. 
def maxcoefficientvalue(n): 
    C = [[0 for x in range(n + 1)] 
            for y in range(n + 1)]; 
              
    # Calculate value of 
    # Binomial Coefficient in 
    # bottom up manner 
    for i in range(n + 1): 
        for j in range(min(i, n) + 1): 
              
            # Base Cases 
            if (j == 0 or j == i): 
                C[i][j] = 1; 
                  
            # Calculate value 
            # using previously 
            # stored values 
            else: 
                C[i][j] = (C[i - 1][j - 1] + 
                           C[i - 1][j]); 
      
    # finding the maximum value. 
    maxvalue = 0; 
    for i in range(n + 1): 
        maxvalue = max(maxvalue, C[n][i]); 
      
    return maxvalue; 
  
# Driver Code 
n = 4; 
print(maxcoefficientvalue(n)); 
  
# This code is contributed by mits 

