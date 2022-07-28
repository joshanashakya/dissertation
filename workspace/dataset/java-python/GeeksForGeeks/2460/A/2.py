

# Python3 Program to find the biggest Reuleaux  
# triangle inscribed within in a square 
# which in turn is inscribed within an ellipse  
import math; 
  
# Function to find the biggest  
# reuleaux triangle  
def Area(a, b): 
  
    # length of the axes cannot  
    # be negative  
    if (a < 0 and b < 0):  
        return -1;  
  
    # height of the reuleaux triangle  
    h = math.sqrt(((pow(a, 2) + pow(b, 2)) /
                   (pow(a, 2) * pow(b, 2))));  
  
    # area of the reuleaux triangle  
    A = 0.70477 * pow(h, 2);  
  
    return A;  
  
# Driver code  
a = 5; 
b = 4;  
print(round(Area(a, b), 7)); 
  
# This code is contributed by chandan_jnu 

