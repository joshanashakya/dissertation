

# Python3 code to find the area of inscribed  
# circle of equilateral triangle 
import math 
PI = 3.14159265
      
# Function to find the area of  
# inscribed circle 
def area_inscribed(a): 
    return (a * a * (PI / 12)) 
  
# Function to find the perimeter of  
# inscribed circle 
def perm_inscribed(a): 
    return ( PI * (a / math.sqrt(3) ) )     
  
  
# Driver code 
a = 6.0
print("Area of inscribed circle is :% f"
                        % area_inscribed(a)) 
print("\nPerimeter of inscribed circle is :% f"
                        % perm_inscribed(a)) 

