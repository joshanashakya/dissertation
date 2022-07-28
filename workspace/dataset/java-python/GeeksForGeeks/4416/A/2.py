

# Python3 program to find sum of 
# diagonals of spiral matrix 
  
# function returns sum of diagonals 
def spiralDiaSum(n): 
      
    if n == 1: 
        return 1
  
    # as order should be only odd 
    # we should pass only odd 
    # integers 
    return (4 * n*n - 6 * n + 6 +
               spiralDiaSum(n-2)) 
      
# Driver program 
n = 7; 
print(spiralDiaSum(n)) 
  
# This code is contributed by Anant Agarwal. 

