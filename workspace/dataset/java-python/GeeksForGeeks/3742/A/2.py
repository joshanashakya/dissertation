

# Python3 program to find the 
# N-th term of the series: 
# 2, 12, 28, 50, 77, 112, 152, 198, ..... 
  
# calculate Nth term of series 
def nthTerm(n): 
  
    return 3 * pow(n, 2) + n - 2
  
# Driver code 
N = 4
print(nthTerm(N)) 
  
# This code is contributed by 
# Sanjit_Prasad 

