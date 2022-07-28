

# Python 3 Program to find the  
# the biggest rectangle  
# which can be inscribed  
# within the semicircle  
  
# Function to find the area  
# of the biggest rectangle  
def rectanglearea(r) : 
  
    # the radius cannot 
    # be negative  
    if r < 0 : 
        return -1
  
    # area of the rectangle  
    a = r * r 
  
    return a 
  
# Driver Code 
if __name__ == "__main__" : 
  
    r = 5
  
    # function calling 
    print(rectanglearea(r)) 
  
# This code is contributed  
# by ANKITRAI1 

