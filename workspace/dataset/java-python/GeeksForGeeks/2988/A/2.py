

# Python3 Program to find sum of product  
# of consecutive Binomial Coefficient. 
MAX = 100; 
  
# Find the binomial coefficient upto  
# nth term 
def binomialCoeff(C, n): 
  
    C[0] = 1; # nC0 is 1 
  
    for i in range(1, n + 1): 
  
        # Compute next row of 
        # pascal triangle using 
        # the previous row 
        for j in range(min(i, n), 0, -1): 
            C[j] = C[j] + C[j - 1]; 
      
    return C; 
  
# Return the sum of the product of  
# consecutive binomial coefficient. 
def sumOfproduct(n): 
  
    sum = 0; 
    C = [0] * MAX; 
  
    C = binomialCoeff(C, n); 
  
    # finding the sum of  
    # product of consecutive 
    # coefficient. 
    for i in range(n + 1):  
        sum += C[i] * C[i + 1];  
  
    return sum; 
  
# Driver Code 
n = 3; 
print(sumOfproduct(n)); 
  
# This code is contributed by mits 

