

# Python 3 program to find probability 
# to C win the match 
  
# import gcd() from math lib. 
from math import gcd 
  
# function to find probability  
# to C win the match 
def Probability(A, B) : 
    C = 6 - max(A, B) 
      
    __gcd = gcd(C, 6) 
      
    print(C // __gcd, "/", 6 // __gcd) 
  
# Driver Code 
if __name__ == "__main__" : 
      
    A, B = 2, 4
  
    # function call 
    Probability(A, B) 
      
# This code is contributed by ANKITRAI1 

