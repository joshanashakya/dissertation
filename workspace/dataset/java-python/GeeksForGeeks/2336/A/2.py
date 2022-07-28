

# Simple Python3 code to  
# find sum of square of 
# first n even numbers 
  
def squareSum( n ): 
    sum = 0
    for i in range (0, n + 1): 
        sum += (2 * i) * (2 * i) 
          
    return sum
  
# driver code 
ans = squareSum(8) 
print (ans) 
  
# This code is contributed by Saloni Gupta 

