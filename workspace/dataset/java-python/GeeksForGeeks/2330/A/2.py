

# Python3 program to evaluate  
# the given expression 
  
import math 
  
#Function to find the sum 
def calculateSum(n): 
      
    a = int(n) 
      
    return (2 * (pow(n, 6) + 15 * pow(n, 4)  
            + 15 * pow(n, 2) + 1)) 
      
#Driver Code 
if __name__=='__main__': 
    n = 1.4142
    print(math.ceil(calculateSum(n))) 
  
# this code is contributed by  
# Shashank_Sharma 

