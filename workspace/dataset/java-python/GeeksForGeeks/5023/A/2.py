

# Python 3 program to find the N-th term of the series: 
# 7, 21, 49, 91, 146, 217, 301, 399, ... 
  
  
# calculate Nth term of series 
def nthTerm( n): 
  
    return 7 * pow(n, 2) - 7 * n + 7
  
  
# Driver code 
N = 4
  
print(nthTerm(N)) 

