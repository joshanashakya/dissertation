

# Python3 implementation of the approach 
from math import sqrt 
  
# Function to return the required count 
def count(n) : 
  
    return (-1 + sqrt(1 + 8 * n)) // 2; 
  
# Driver code 
if __name__ == "__main__" : 
  
    n = 10; 
  
    print(count(n)); 
  
# This code is contributed by AnkitRai01 

