

# Python 3 Program to find the biggest rectangle  
# which can be inscribed within the ellipse  
  
#  Function to find the area  
# of the rectangle  
def rectanglearea(a, b) : 
  
    # a and b cannot be negative  
    if a < 0 or b < 0 : 
        return -1
  
    # area of the rectangle 
    return 2 * a * b 
   
  
# Driver code      
if __name__ == "__main__" : 
  
    a, b = 10, 8
    print(rectanglearea(a, b)) 
  
  
# This code is contributed by ANKITRAI1 

