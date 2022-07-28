

# Python3 implementation of the  
# above approach 
from math import sqrt 
  
# function to return maximum volume 
def maxVol(P, A): 
      
    # calculate length 
    l = (P - sqrt(P * P - 24 * A)) / 12
  
    # calculate volume 
    V = l * (A / 2.0 - l * (P / 4.0 - l)) 
  
    # return result 
    return V 
  
# Driver code 
if __name__ == '__main__': 
    P = 20
    A = 16
    print(maxVol(P, A)) 
  
# This code is contributed  
# by Surendra_Gangwar 

