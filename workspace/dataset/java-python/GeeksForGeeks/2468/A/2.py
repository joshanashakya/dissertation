

# Python3 program to find the 
# N-th term of the series: 
# 3, 12, 29, 54, 86, 128, 177, 234, ..... 
  
# calculate Nth term of series 
def nthTerm(n): 
  
    return 4 * pow(n, 2) - 3 * n + 2
  
# Driver code 
N = 4
print(nthTerm(N)) 
  
# This code is contributed by 
# Sanjit_Prasad 

