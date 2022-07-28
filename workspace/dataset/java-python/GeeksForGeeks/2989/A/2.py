

# Python3 Program to find sum of product  
# of consecutive Binomial Coefficient. 
MAX = 100; 
  
# Find the binomial coefficient  
# up to nth term 
def binomialCoeff(n, k): 
  
    C = [0] * (k + 1); 
  
    C[0] = 1; # nC0 is 1 
  
    for i in range(1, n + 1):  
  
        # Compute next row of pascal triangle  
        # using the previous row 
        for j in range(min(i, k), 0, -1): 
            C[j] = C[j] + C[j - 1]; 
    return C[k]; 
  
# Return the sum of the product of 
# consecutive binomial coefficient. 
def sumOfproduct(n): 
    return binomialCoeff(2 * n, n - 1); 
  
# Driver Code 
n = 3; 
print(sumOfproduct(n)); 
  
# This code is contributed by mits 

