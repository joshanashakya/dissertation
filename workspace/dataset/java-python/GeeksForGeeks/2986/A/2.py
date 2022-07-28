

# Python Program to find  
# the sum of square of 
# binomial coefficient. 
  
# Return the sum of  
# square of binomial 
# coefficient 
def sumofsquare(n) : 
      
    C = [[0 for i in range(n + 1)]  
            for j in range(n + 1)] 
              
    # Calculate value of  
    # Binomial Coefficient  
    # in bottom up manner 
    for i in range(0, n + 1) : 
      
        for j in range(0, min(i, n) + 1) : 
                      
            # Base Cases 
            if (j == 0 or j == i) : 
                C[i][j] = 1
  
            # Calculate value  
            # using previously 
            # stored values 
            else : 
                C[i][j] = (C[i - 1][j - 1] +
                           C[i - 1][j]) 
  
      
    # Finding the sum of  
    # square of binomial  
    # coefficient. 
    sum = 0
    for i in range(0, n + 1) : 
        sum = sum + (C[n][i] * 
                     C[n][i])  
      
    return sum
  
  
# Driver Code 
n = 4
print (sumofsquare(n), end="\n") 
      
# This code is contributed by  
# Manish Shaw(manishshaw1) 

