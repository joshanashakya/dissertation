

# Python  Program to find the sum  
# of Binomial Coefficient. 
   
import math     
   
# Returns value of Binomial  
# Coefficient Sum 
def binomialCoeffSum( n): 
      
        C = [[0]*(n+2) for i in range(0,n+2)] 
       
        # Calculate value of Binomial  
        # Coefficient in bottom up manner 
        for i in range(0,n+1): 
            for j in range(0, min(i, n)+1): 
              
                # Base Cases 
                if (j == 0 or j == i): 
                    C[i][j] = 1
       
                # Calculate value using previously 
                # stored values 
                else: 
                    C[i][j] = C[i - 1][j - 1] + C[i - 1][j] 
       
        # Calculating the sum. 
        sum = 0
        for i in range(0,n+1): 
            sum += C[n][i] 
       
        return sum
      
       
# Driver program to test above function 
n = 4
print(binomialCoeffSum(n)) 
  
# This code is contributed by Gitanjali. 

