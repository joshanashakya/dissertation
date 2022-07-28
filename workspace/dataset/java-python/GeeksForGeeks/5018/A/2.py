

# Python3 program to find the 
# N-th term of the series: 
# 0, 9, 22, 39, 60, 85, 114, 147..... 
  
# calculate Nth term of series 
def nthTerm(n): 
  
    return 2 * pow(n, 2) + 3 * n - 5
  
# Driver code 
N = 4
print(nthTerm(N)) 
  
# This code is contributed by 
# Sanjit_Prasad 

