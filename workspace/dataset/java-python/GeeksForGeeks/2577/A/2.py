

# Python3 program to find log(a) on any base b 
from math import log 
  
def log_a_to_base_b(a, b) : 
    return log(a) // log(b); 
  
# Driver code 
if __name__ == "__main__" : 
      
    a = 3; 
    b = 2; 
    print(log_a_to_base_b(a, b)); 
  
    a = 256; 
    b = 4; 
    print(log_a_to_base_b(a, b)); 
  
# This code is contributed by AnkitRai01 

