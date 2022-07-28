

# Python3 Program to find the  
# biggest triangle which can be  
# inscribed within the rectangle  
  
# Function to find the area  
# of the triangle  
def trianglearea(l, b) :  
  
    # a and b cannot be negative  
    if (l < 0 or b < 0) : 
        return -1
  
    # area of the triangle  
    area = (l * b) / 2
    return area 
  
# Driver code  
l = 5
b = 4
print(trianglearea(l, b)) 
  
# This code is contributed  
# by Yatin Gupta  

