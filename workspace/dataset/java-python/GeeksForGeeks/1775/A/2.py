

# Python 3 Program to find the  
# area of the triangle inscribed  
# within the rectangle which in  
# turn is inscribed in an ellipse 
  
# Function to find the area 
# of the triangle 
def area(a, b): 
      
    # length of a and b cannot  
    # be negative 
    if (a < 0 or b < 0): 
        return -1
  
    # area of the triangle 
    A = a * b 
    return A 
  
# Driver code 
if __name__ == '__main__': 
    a = 5
    b = 2
    print(area(a, b)) 
      
# This code is contributed  
# by Surendra_Gangwar 

