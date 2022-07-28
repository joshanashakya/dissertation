

# Python3 implementation of the approach 
  
# Function that checks whether given angle 
# can be created using any 3 sides 
def calculate_angle(n, i, j, k): 
      
    # Initialize x and y 
    x, y = 0, 0
   
    # Calculate the number of vertices 
    # between i and j, j and k 
    if (i < j): 
        x = j - i 
    else: 
        x = j + n - i 
    if (j < k): 
        y = k - j 
    else: 
        y = k + n - j 
  
    # Calculate the angle subtended 
    # at the circumference 
    ang1 = (180 * x) // n 
    ang2 = (180 * y) // n 
  
    # Angle subtended at j can be found 
    # using the fact that the sum of angles 
    # of a triangle is equal to 180 degrees 
    ans = 180 - ang1 - ang2 
    return ans 
  
# Driver code 
n = 5
a1 = 1
a2 = 2
a3 = 5
  
print(calculate_angle(n, a1, a2, a3)) 
  
# This code is contributed by Mohit Kumar 

