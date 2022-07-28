

# Python 3 program to find  
# N-th term of the series: 
# 5, 13, 25, 41, 61...  
  
# Function to calculate 
# Nth term of series 
def nthTerm(N) : 
    return N * N + (N + 1) * (N + 1) 
  
# Driver Code 
if __name__ == "__main__" : 
  
    N = 3
  
    # function calling 
    print(nthTerm(N)) 
  
# This code is contributed  
# by ANKITRAI1 

