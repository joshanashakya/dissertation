

# Python3 Program to find the biggest ellipse  
# which can be inscribed within the rectangle  
  
# Function to find the area 
# of the ellipse  
def ellipse(l, b):  
  
    # The sides cannot be negative  
    if l < 0 or b < 0:  
        return -1
  
    # Area of the ellipse  
    x = (3.14 * l * b) / 4
  
    return x  
  
# Driver code  
if __name__ == "__main__": 
  
    l, b = 5, 3
    print(ellipse(l, b))  
  
# This code is contributed  
# by Rituraj Jain 

