

# Python code to calculate area of  
# triangle if vectors of 
# 2 adjacent sides are given 
import math 
  
# to calculate area of triangle  
def area(x1, y1, z1, x2, y2, z2): 
    area = math.sqrt((y1 * z2 - y2 * z1) ** 2 
           + (x1 * z2 - x2 * z1) ** 2 + 
           (x1 * y2 - x2 * y1) ** 2) 
    area = area / 2
    return area 
  
# main function 
def main(): 
    x1 = -2
    y1 = 0
    z1 = -5
    x2 = 1
    y2 = -2
    z2 = -1
    a = area(x1, y1, z1, x2, y2, z2) 
    print("Area = ", a) 
  
# driver code     
if __name__=="__main__": 
    main() 

