

# Python 3 program to find the  
# area of the circle  
# which can be inscribed within the hexagon 
  
# Function to find the area  
# of the inscribed circle  
def circlearea(a) : 
  
    # the side cannot be negative  
    if a < 0 : 
        return -1
  
    #  area of the circle 
    A = (3.14 * 3 * pow(a,2)) / 4
  
    return A 
  
  
# Driver code      
if __name__ == "__main__" : 
  
    a = 4
    print(circlearea(a)) 
  
  
# This code is contributed by ANKITRAI1 

