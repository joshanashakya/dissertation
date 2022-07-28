

# Python program to find 
# N-th term of the series:  
# 3, 20, 63, 144, 230 ..... 
  
# calculate Nth term of series  
def nthTerm(n) : 
  
    return 2 * pow(n, 3) + pow(n, 2) 
  
# Driver code 
if __name__ == "__main__" : 
  
    N = 3
    print(nthTerm(N)) 
  
# This code is contributed  
# by ANKITRAI1 

