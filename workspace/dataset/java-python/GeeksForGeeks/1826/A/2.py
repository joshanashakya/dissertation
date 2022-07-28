

# Python3 program to find N-th term of the series: 
# 3, 12, 29, 54, 87, ... 
  
# calculate Nth term of series 
def getNthTerm(N): 
  
    # Return Nth term 
    return 4 * pow(N, 2) - 3 * N + 2
  
# driver code 
if __name__=='__main__': 
      
    # declaration of number of terms 
    N = 10
  
    # Get the Nth term 
    print(getNthTerm(N)) 
  
# This code is contributed by 
# Sanjit_Prasad 

