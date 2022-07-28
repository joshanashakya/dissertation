

# Python3 program to find the number of 
# ways to form the group of peopls 
C = [[0 for i in range(1000)]  
        for i in range(1000)] 
  
# Function to pre-compute the 
# Combination using DP 
def binomialCoeff(n): 
    i, j = 0, 0
  
    # Calculate value of Binomial Coefficient 
    # in bottom up manner 
    for i in range(n + 1): 
        for j in range(i + 1): 
  
            # Base Cases 
            if (j == 0 or j == i): 
                C[i][j] = 1
  
            # Calculate value using previously 
            # stored values 
            else: 
                C[i][j] = C[i - 1][j - 1] + \ 
                          C[i - 1][j] 
  
    # return C[n][k] 
  
# Function to find the number of ways 
def numberOfWays(x, y, z): 
      
    # Function to pre-compute 
    binomialCoeff(max(x, max(y, z))) 
  
    # Sum the Zci 
    sum = 0
    for i in range(1, z + 1): 
        sum = (sum + C[z][i]) 
  
    # Iterate for second position 
    sum1 = 0
    for i in range(1, y + 1): 
  
        # Iterate for first position 
        for j in range(i + 1, x + 1): 
            sum1 = (sum1 + (C[y][i] * C[x][j])) 
  
    # Multiply the common Combination value 
    sum1 = (sum * sum1) 
  
    return sum1 
  
# Driver Code 
x = 3
y = 2
z = 1
  
print(numberOfWays(x, y, z)) 
  
# This code is contributed by Mohit Kumar 

