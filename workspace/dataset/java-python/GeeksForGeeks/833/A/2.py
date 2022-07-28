

# Python3 implementation of the approach 
  
# Function that calculates occurrences 
# of given angle that can be created 
# using any 3 sides 
def solve(ang, n): 
  
    # Maximum angle in a regular n-gon 
    # is equal to the interior angle 
    # If the given angle 
    # is greater than the interior angle 
    # then the given angle cannot be created 
    if ((ang * n) > (180 * (n - 2))): 
        return 0
  
    # The given angle times n should be divisible 
    # by 180 else it cannot be created 
    elif ((ang * n) % 180 != 0): 
        return 0
  
    # Initialise answer 
    ans = 1
  
    # Calculate the frequency 
    # of given angle for each vertex 
    freq = (ang * n) // 180
  
    # Multiply answer by frequency. 
    ans = ans * (n - 1 - freq) 
  
    # Multiply answer by the number of vertices. 
    ans = ans * n 
  
    return ans 
  
# Driver code 
ang = 90
n = 4
  
print(solve(ang, n)) 
  
# This code is contributed by Mohit Kumar 

