

# Python3 Program to find the area  
# of a triangle inscribed in  
# N-sided regular polygon  
import math  
  
# Function to find the area of the polygon  
def area_of_regular_polygon(n, len):  
  
    # area of a regular polygon with  
    # N sides and side length len  
    P = (len * n);  
    A = len / (2 * math.tan((180 / n) * 
                      3.14159 / 180))  
    area = (P * A) / 2
  
    return area  
  
# Function to find the area of a triangle  
def area_of_triangle_inscribed(n, len):  
  
    area = area_of_regular_polygon(n, len)  
  
    # area of one triangle  
    # in an N-sided regular polygon  
    triangle = area / n  
  
    # area of inscribed triangle  
    ins_tri = (triangle * 3);  
  
    return ins_tri  
  
# Driver code  
n = 6
len = 10
print(round(area_of_triangle_inscribed(n, len), 3))  
  
# This code is contributed by divyamohan 

