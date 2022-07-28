

# Python program to find the  
# N-th term of the series: 
# 1, 6, 17, 34, 56, 86, 121, 162, ..... 
  
# calculate Nth term of series 
def nthTerm(n): 
  
    return 3 * pow(n, 2) - 4 * n + 2
  
# Driver code 
N = 4
print(nthTerm(N)) 
  
# This code is contributed by 
# Sanjit_Prasad 

