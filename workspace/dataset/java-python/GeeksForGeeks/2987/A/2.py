

# Python 3 Program to find the sum of  
# square of binomial coefficient. 
  
# function to return product of number  
# from start to end. 
def factorial(start, end): 
  
    res = 1
      
    for i in range(start, end + 1): 
        res *= i 
          
    return res 
  
# Return the sum of square of binomial 
# coefficient 
def sumofsquare(n): 
  
    return int(factorial(n + 1, 2 * n) 
                     /factorial(1, n)) 
  
# Driven Program 
  
n = 4
print(sumofsquare(n)) 
  
  
# This code is contributed by 
# Smitha Dinesh Semwal 

