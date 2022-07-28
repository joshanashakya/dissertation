

# Python implementation of above approach.  
  
# Function to return the  
# number of men initially  
def numberOfMen(D, m, d): 
    Men = (m * (D - d)) / d;  
  
    return int(Men);  
  
  
# Driver code  
D = 5; m = 4; d = 4;  
  
print(numberOfMen(D, m, d));  
  
  
# This code contributed by Rajput-Ji 

