

# Python 3 Program to find sum of product  
# of r and rth Binomial Coefficient i.e  
# summation r * nCr 
MAX = 100
  
# Return the first n term of  
# binomial coefficient. 
def binomialCoeff(n, C): 
  
    C[0] = 1 # nC0 is 1 
  
    for i in range(1, n + 1): 
  
        # Compute next row of pascal triangle  
        # using the previous row 
        for j in range(min(i, n), -1, -1): 
            C[j] = C[j] + C[j - 1] 
  
# Return summation of r * nCr 
def summation( n): 
  
    C = [0] * MAX
  
    # finding the first n term of  
    # binomial coefficient 
    binomialCoeff(n, C) 
  
    # Iterate a loop to find the sum. 
    sum = 0
    for i in range(n + 1):  
        sum += (i * C[i])  
  
    return sum
  
# Driver Code 
if __name__ == "__main__": 
      
    n = 2
    print(summation(n)) 
  
# This code is contributed by ita_c 

