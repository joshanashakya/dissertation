

# Python 3 program to find  
# N-th term of the series: 
# 1, 8, 54, 384... 
  
# calculate factorial of N 
def fact(N): 
      
    product = 1
    for i in range(1, N + 1): 
        product = product * i 
    return product 
  
# calculate Nth term of series 
def nthTerm(N): 
    return (N * N) * fact(N) 
  
# Driver Code 
if __name__ =="__main__": 
    N = 4
    print(nthTerm(N)) 
  
# This code is contributed 
# by ChitraNayal 

