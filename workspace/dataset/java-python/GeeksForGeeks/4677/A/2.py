

# Python 3 implementation of the above approach. 
  
import math 
  
# Function that calculates Edge Cover  
def edgeCover(n): 
      
    result = 0
      
    result = math.ceil(n / 2.0) 
      
    return result 
      
      
# Driver code       
if __name__ == "__main__" :  
    
    n =  5
    
    print(int(edgeCover(n))) 
  
# this code is contributed by Naman_Garg 

