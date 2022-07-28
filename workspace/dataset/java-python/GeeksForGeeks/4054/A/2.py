

# Python3 implementation to find  
# the sum of the given series 
  
# functionn to find the sum 
# of the given series 
def sumOfTheSeries(n): 
  
    # sum of 1st n natural numbers 
    sum_n = int((n * (n + 1) / 2)); 
      
    # sum of squares of 1st n natural numbers 
    sum_sq_n = int ((n * (n + 1) / 2) * (2 * n + 1) / 3) 
                      
    # required sum 
    return (sum_n + sum_sq_n); 
  
# Driver program to test above 
n = 5
ans = sumOfTheSeries(n) 
print (ans) 
  
# This code is contributed by saloni1297. 

