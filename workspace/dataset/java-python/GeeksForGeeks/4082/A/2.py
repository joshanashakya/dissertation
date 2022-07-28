

# Python3 implementation of above approach  
  
# from math lib. import everything 
from math import *
  
# Function to find the number of  
# solutions of n = n xor x  
def numberOfSolutions(n) : 
  
    # Number of set bits in n  
    c = 0
  
    while(n) : 
        c += n % 2
        n //= 2
  
    # We can also write (1 << c)  
    return int(pow(2, c)) 
  
          
# Driver code      
if __name__ == "__main__" : 
  
    n = 3
    print(numberOfSolutions(n)) 
  
# This code is contributed by ANKITRAI1 

