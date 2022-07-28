

# Python 3 program to find the  
# N-th term of the series: 
# 0, 5, 18, 39, 67, 105, 150, 203, ... 
  
# calculate Nth term of series 
def nthTerm(n): 
  
    return 4 * pow(n, 2) - 7 * n + 3
  
# Driver code 
N = 4
  
print(nthTerm(N)) 
  
# This code is contributed by ash264 

