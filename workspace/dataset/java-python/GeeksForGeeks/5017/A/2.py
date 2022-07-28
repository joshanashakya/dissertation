

# Python3 program to find the 
# N-th term of the series: 
# 0, 11, 28, 51, 79, 115, 156, 203..... 
  
# calculate Nth term of series 
def nthTerm(n): 
  
    return 3 * pow(n, 2) + 2 * n - 5
  
# Driver code 
N = 4
print(nthTerm(N)) 
  
# This code is contributed by 
# Sanjit_Prasad 

