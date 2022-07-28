

# Python3 implementation of the approach  
  
from math import sqrt 
  
# Function to return the maximum  
# number of people that can be killed  
def maxPeople(p) :  
      
    tmp = 0; count = 0;  
  
    # Loop will break when the ith person  
    # cannot be killed  
    for i in range(1, int(sqrt(p)) + 1) : 
        tmp = tmp + (i * i);  
        if (tmp <= p) : 
            count += 1;  
        else : 
            break;  
      
    return count;  
  
  
# Driver code  
if __name__ == "__main__" :  
  
    p = 14;  
    print(maxPeople(p));  
      
# This code is contributed by AnkitRai01 

