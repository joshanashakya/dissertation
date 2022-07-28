

# Python3 implementation of the approach 
  
# Function to return the value of 
# Binomial Coefficient C(n, k) 
def binomialCoeff(n, k) : 
  
    C = [[0 for i in range(n + 1)]  
               for j in range(k + 1)] 
  
    # Calculate value of Binomial Coefficient 
    # in bottom up manner 
    for i in range (0, n + 1 ): 
        for j in range (0, min(i, k) + 1): 
  
            # Base Cases 
            if (j == 0 or j == i): 
                C[i][j] = 1
  
            # Calculate value using previously 
            # stored values 
            else : 
                C[i][j] = C[i - 1][j - 1] + C[i - 1][j] 
          
    return C[n][k] 
  
# Function to return the count 
# of valid subsequences 
def cntSubSeq(arr, n, k) : 
  
    # Sort the array 
    arr.sort() 
  
    # Maximum among the minimum K elements 
    num = arr[k - 1]; 
  
    # Y will store the frequency of num 
    # in the minimum K elements 
    Y = 0; 
    for i in range (k - 1, -1, 1) : 
        if (arr[i] == num): 
            Y += 1
  
    # cntX will store the frequency of 
    # num in the complete array 
    cntX = Y; 
    for i in range (k, n): 
        if (arr[i] == num) : 
            cntX += 1
      
    return binomialCoeff(cntX, Y) 
  
# Driver code 
arr = [ 1, 2, 3, 4 ] 
n = len(arr) 
k = 2
print(cntSubSeq(arr, n, k)) 
  
# This code is contributed by ihritik 

