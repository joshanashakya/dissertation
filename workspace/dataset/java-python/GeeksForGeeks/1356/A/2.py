

# Python 3 Program to find three integers 
# less than N whose LCM is maximum 
from math import gcd 
  
# function to find three integers 
# less than N whose LCM is maximum 
def MaxLCM(n) : 
  
    # if n is odd 
    if (n % 2 != 0) : 
        print(n, (n - 1), (n - 2)) 
  
    # if n is even and n, n-3 gcd is 1 
    elif (gcd(n, (n - 3)) == 1) : 
        print(n, (n - 1), (n - 3)) 
  
    else : 
        print((n - 1), (n - 2), (n - 3)) 
  
# Driver Code 
if __name__ == "__main__" : 
      
    n = 12
  
    # function call 
    MaxLCM(n) 
  
# This code is contributed by Ryuga 

