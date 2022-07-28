

# Python 3 Program to finding 
# the sum of the nth series 
  
# function that calculate 
# the sum of the nth series 
def sum_series(n): 
  
    nSquare = n * n  
  
    # Using formula of the 
    # nth term 
    return int(nSquare * (nSquare - 1) / 4)  
  
# Driver function 
n = 2
print(sum_series(n)) 
  
# This code is contributed by Smitha Dinesh Semwal 

