

# Python 3 program to find a and b 
# such that a*b=N and a+b=N 
from math import sqrt 
  
# Function to return the  
# smallest string 
def findAandB(N): 
    val = N * N - 4.0 * N 
  
    # Not possible 
    if (val < 0): 
        print("NO") 
        return
      
    # find a and b 
    a = (N + sqrt(val)) / 2.0
    b = (N - sqrt(val)) / 2.0
  
    print("a =", '{0:.6}' . format(a)) 
    print("b =", '{0:.6}' . format(b)) 
  
# Driver Code 
if __name__ == '__main__': 
    N = 69.0
    findAandB(N) 
      
# This code is contributed  
# by SURENDRA_GANGWAR     

