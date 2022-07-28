

# Python3 Program to find the biggest ellipse  
# which can be inscribed within a rectangle  
# which in turn is inscribed within a semicircle  
  
# Function to find the area of  
# the biggest ellipse  
def ellipsearea(r) :  
  
    # the radius cannot be negative  
    if (r < 0) : 
        return -1;  
  
    # area of the ellipse  
    a = (3.14 * r * r) / 4;  
  
    return a;  
  
# Driver code  
if __name__ == "__main__" : 
  
    r = 5;  
    print(ellipsearea(r));  
  
# This code is contributed by Ryuga 

