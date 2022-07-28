

# Python3 implementation to find 
# the sum of the given series 
  
# functionn to find the sum 
# of the given series 
def sumOfTheSeries( n ): 
    sum = 0
    for i in range(1, n + 1): 
          
        # first term of each i-th term 
        k = 1
        for j in range(1,i+1): 
            sum += k 
              
            # next term 
            k += 2
              
    # required sum 
    return sum
      
# Driver program 
n = 5
print("Sum =", sumOfTheSeries(n)) 
  
# This code is contributed by "Sharad_Bhardwaj". 

