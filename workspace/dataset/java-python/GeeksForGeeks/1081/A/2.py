

# Python3 program to calculate 
# Nth root of a number 
import math 
import random 
  
# method returns Nth power of A 
def nthRoot(A,N): 
  
    # initially guessing a random number between 
    # 0 and 9 
    xPre = random.randint(1,101) % 10
   
    #  smaller eps, denotes more accuracy 
    eps = 0.001
   
    # initializing difference between two 
    # roots by INT_MAX 
    delX = 2147483647
   
    #  xK denotes current value of x 
    xK=0.0
   
    #  loop untill we reach desired accuracy 
    while (delX > eps): 
  
        # calculating current value from previous 
        # value by newton's method 
        xK = ((N - 1.0) * xPre +
              A/pow(xPre, N-1)) /N 
        delX = abs(xK - xPre) 
        xPre = xK; 
          
    return xK 
  
# Driver code 
N = 4
A = 81
nthRootValue = nthRoot(A, N) 
  
print("Nth root is ", nthRootValue) 
  
## Acalc = pow(nthRootValue, N); 
## print("Error in difference of powers ", 
##             abs(A - Acalc)) 
  
# This code is contributed 
# by Anant Agarwal. 

