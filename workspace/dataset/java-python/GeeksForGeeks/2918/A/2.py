

# Python 3 program to find  
# N-th term of the series:  
# 1, 1, 2, 6, 24...  
  
# Function to calculate  
# Nth term of series  
def nthTerm(n) : 
  
    if n <= 1 : 
        return 1
  
    fact = 1
    for i in range(1, N) : 
        fact = fact * i 
  
    return fact 
  
# Driver code 
if __name__ == "__main__" : 
  
    N = 3
  
    # function calling 
    print(nthTerm(N)) 
  
# This code is contributed  
# by ANKITRAI1 

