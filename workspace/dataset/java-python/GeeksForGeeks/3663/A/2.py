

# Python3 implementation of the above approach  
  
# Function calculate the area of the inner circle  
def innerCirclearea(radius) : 
  
    # the radius cannot be negative  
    if (radius < 0) : 
        return -1; 
          
    # area of the circle 
    r = radius / 2; 
    Area = (3.14 * pow(r, 2));  
  
    return Area;  
      
# Driver Code  
if __name__ == "__main__" : 
      
    radius = 4;  
    print("Area of circle c2 =",  
           innerCirclearea(radius));  
  
# This code is contributed by AnkitRai01 

