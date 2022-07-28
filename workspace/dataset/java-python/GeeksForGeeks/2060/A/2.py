

# Python3 implementation of the approach 
import math  
  
# Function to return the time taken 
# per hour for stoppage 
def numberOfMinutes(S, S1): 
  
    Min = 0; 
  
    Min = ((S - S1) / math.floor(S)) * 60; 
  
    return int(Min); 
  
# Driver code 
if __name__ == '__main__': 
    S, S1 = 30, 10; 
  
    print(numberOfMinutes(S, S1), "min"); 
  
# This code is contributed by Rajput-Ji 

