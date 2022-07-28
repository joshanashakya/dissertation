

# Python3 Program to find the biggest square 
# which can be inscribed within the ellipse 
  
  
# Function to find the area 
# of the square 
def squarearea( a, b): 
  
  
    # a and b cannot be negative 
    if (a < 0 or b < 0): 
        return -1
      
  
    # area of the square 
    area = 4 * (((pow(a, 2) + pow(b, 2)) / 
               (pow(a, 2) * pow(b, 2)))) 
  
    return area 
  
  
# Driver code 
if __name__=='__main__': 
    a = 4
    b = 2
    print(squarearea(a, b)) 
  
# This code is contributed by ash264 

