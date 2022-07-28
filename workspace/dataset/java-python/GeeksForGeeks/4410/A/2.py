

# Python3 implementation of above approach 
  
#Function to find the sum 
import math 
def findSum(n): 
    # Apply AP formula 
    return math.sqrt(3) * (n * (n + 1) / 2) 
  
# Driver code  
# number of terms 
if __name__=='__main__': 
    n = 10
    print(findSum(n)) 
  
# This code is contributed by sahilshelangia 

