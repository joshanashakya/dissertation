

# Python3 implementation of the approach  
from math import log 
  
# Function to compare x^y and y^x  
def compareVal(x, y) : 
      
    # Storing values OF x^y AND y^x 
    a = y * log(x); 
    b = x * log(y); 
      
    # Comparing values 
    if (a > b) : 
        print(x, "^", y, ">", y, "^", x); 
          
    elif (a < b) : 
        print(x, "^", y, "<", y ,"^", x); 
  
    elif (a == b) : 
        print(x, "^", y, "=", y, "^", x);  
  
# Driver code  
if __name__ == "__main__" :  
  
    x = 4; y = 5;  
  
    compareVal(x, y);  
  
# This code is contributed by AnkitRai01 

