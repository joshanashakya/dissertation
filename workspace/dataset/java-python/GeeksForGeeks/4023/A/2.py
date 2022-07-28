

# Python3 implementation to find 
# the sum of the given series 
  
# functionn to find the sum 
# of the given series 
def sumOfTheSeries( n ): 
      
    # required sum 
    return int((n * (n + 1) / 2) *
            (2 * n + 1) / 3) 
              
# Driver program to test above 
n = 5
print("Sum =", sumOfTheSeries(n)) 
  
# This code is contributed by "Sharad_Bhardwaj". 

