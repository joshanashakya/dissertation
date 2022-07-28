

# Python3 code to find n-th term of 
# the series 2, 12, 36, 80, 150, .. 
  
# Returns n-th term of the series 
# 2, 12, 36, 80, 150 
def nthTerm( n ): 
    return (n * n) + (n * n * n) 
  
# driver code 
n = 4
print( nthTerm(n)) 
  
# This code is contributed  
# by "Sharad_Bhardwaj". 

