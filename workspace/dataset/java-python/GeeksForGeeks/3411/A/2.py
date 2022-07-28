

# Python3 program to find  
# N-th term of the series:  
# 1, 4, 15, 72, 420…  
# Using recursion  
  
# Function to find factorial  
# of N with recursion 
def factorial(N): 
  
    # base condition  
    if N == 0 or N == 1: 
        return 1
  
    # use recursion 
    return N * factorial(N - 1) 
  
def nthTerm(N): 
      
    # calculate Nth term of series 
    return (factorial(N) * (N + 2) // 2) 
  
# Driver code 
N = 6
print(nthTerm(N)) 
  
# This code is contributed  
# by Shrikant13 

