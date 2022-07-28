

# Python code to find total number of 
# Subsets of size at most K 
  
# Function to compute the value 
# of Binomial Coefficient C(n, k) 
def binomialCoeff(n, k): 
    C = [[0 for i in range(k + 1)] for j in range(n + 1)]; 
    i, j = 0, 0; 
  
    # Caculate value of Binomial Coefficient 
    # in bottom up manner 
    for i in range(n + 1): 
        for j in range( min(i, k) + 1): 
  
            # Base Cases 
            if (j == 0 or j == i): 
                C[i][j] = 1; 
  
            # Calculate value using previously 
            # stored values 
            else: 
                C[i][j] = C[i - 1][j - 1] + C[i - 1][j]; 
    return C[n][k]; 
  
# Function to calculate sum of 
# nCj from j = 1 to k 
def count(n, k): 
    sum = 0; 
    for j in range(1, k+1): 
  
        # Calling the nCr function 
        # for each value of j 
        sum = sum + binomialCoeff(n, j); 
    return sum; 
  
# Driver code 
if __name__ == '__main__': 
    n = 3; 
    k = 2; 
    print(count(n, k), end=""); 
  
    n1 = 5; 
    k1 = 2; 
    print(count(n1, k1)); 
  
# This code is contributed by 29AjayKumar 

