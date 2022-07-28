

# Python 3 program to find  
# N-th term of the series: 
# 0, 5, 14, 27, 44 ... 
  
# Calculate Nth term of series 
def nthTerm(n): 
  
    return 2 * pow(n, 2) - n - 1
  
# Driver code 
if __name__ == "__main__": 
    N = 4
  
    print(nthTerm(N)) 
  
# This code is contributed  
# by ChitraNayal 

