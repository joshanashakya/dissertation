

# Python3 program to find the  
# N-th term of the series: 
# 4, 14, 28, 46, 68, 94, 124, 158, ..... 
  
# calculate Nth term of series 
def nthTerm(n): 
  
    return 2 * pow(n, 2) + 4 * n - 2
  
# Driver code 
N = 4
print(nthTerm(N)) 
  
# This code is contributed by 
# Sanjit_Prasad 

