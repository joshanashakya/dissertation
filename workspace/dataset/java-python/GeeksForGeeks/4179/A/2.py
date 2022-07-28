

# Python 3 program to find  
# Break Even Point 
import math 
  
# Function to calculate  
# Break Even Point 
def breakEvenPoint(exp, S, M): 
      
    earn = S - M 
  
    # Calculating number of  
    # articles to be sold  
    res = math.ceil(exp / earn) 
          
    return res 
      
# Driver Code 
if __name__ == "__main__" : 
          
    exp = 3550
    S = 90
    M = 65
      
    print (int(breakEvenPoint(exp, S, M))) 
  
# This code is contributed 
# by Naman_Garg 

