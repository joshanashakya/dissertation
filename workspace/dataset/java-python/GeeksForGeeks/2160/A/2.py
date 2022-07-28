

# Python3 program to find the  
# equation of circle. 
  
# Function to find the  
# equation of circle 
def circle_equation(x1, y1, r): 
    a = -2 * x1; 
  
    b = -2 * y1; 
  
    c = (r * r) - (x1 * x1) - (y1 * y1); 
  
    # Printing result 
    print("x^2 + (", a, "x) + ", end = ""); 
    print("y^2 + (", b, "y) = ", end = ""); 
    print(c, "."); 
  
# Driver code 
x1 = 2;  
y1 = -3;  
r = 8; 
circle_equation(x1, y1, r); 
  
# This code is contributed  
# by mits 

