

# Python program to find side of the squares 
# inclined and touch each other externally 
# at vertices and are lined in a row 
# and distance between the 
# centers of first and last squares is given 
  
def radius(n, d): 
  
    print("The side of each square is ", 
        d / ((n - 1) * (2**(1/2)))); 
  
# Driver code 
d = 42; n = 4; 
radius(n, d); 
  
# This code is contributed by Rajput-Ji 

