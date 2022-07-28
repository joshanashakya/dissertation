

# Python3 program to find the 
# N-th term of the series: 
# 0, 10, 30, 60, 99, 150, 210, ..... 
  
# calculate Nth term of series 
def nthTerm(n): 
  
    return 5 * pow(n, 2) - 5 * n 
  
# Driver code 
N = 4
print(nthTerm(N)) 
  
# This code is contributed by 
# Sanjit_Prasad 

