

# Python3 Program to find the diagonal 
# of a regular hexagon 
  
# Function to find the diagonal 
# of a regular hexagon 
def hexDiagonal(a): 
  
    # Side cannot be negative 
    if (a < 0): 
        return -1; 
  
    # Length of the diagonal 
    d = 1.73 * a; 
    return d; 
  
  
# Driver code 
a = 9; 
print(hexDiagonal(a)); 
  
# This code is contributed 
# by Akanksha Rai 

