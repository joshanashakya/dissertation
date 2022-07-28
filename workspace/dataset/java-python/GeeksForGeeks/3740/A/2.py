

# Python3 program to find the  
# N-th term of the series: 
# 0, 7, 18, 33, 51, 75, 102, ..... 
  
# calculate Nth term of series 
def nthTerm(n): 
  
    return 2 * pow(n, 2) + n - 3
  
# Driver code 
N = 4
print(nthTerm(N)) 
  
# This code is contributed by 
# Sanjit_Prasad 

