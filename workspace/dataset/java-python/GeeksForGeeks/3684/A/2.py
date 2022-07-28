

# Python 3 program to find  
# the Altitude Area of an 
# isosceles triangle 
import math 
  
# function to find the atitude 
def altitude(a, b): 
      
    # return altitude 
    return math.sqrt(pow(a, 2) - 
                    (pow(b, 2) / 4)) 
  
# function to find the area 
def area(b, h): 
  
    # return area 
    return (1 * b * h) / 2
  
# Driver Code 
if __name__ == "__main__": 
  
    a = 2
    b = 3
    h = altitude(a, b) 
    print("Altitude = " + 
           str(round(h, 3)), end = ", ") 
  
    print("Area = "+ 
           str(round(area(b, h), 3))) 
  
# This code is contributed  
# by ChitraNayal 

