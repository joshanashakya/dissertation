

# Python 3 Program  to find the biggest triangle  
# which can be inscribed within the semicircle 
  
# Function to find the area  
# of the triangle  
def trianglearea(r) : 
  
    # the radius cannot be negative  
    if r < 0 : 
        return -1
  
    #  area of the triangle  
    return r * r 
  
  
# Driver Code 
if __name__ == "__main__" : 
  
    r = 5
    print(trianglearea(r)) 
  
# This code is contributed by ANKITRAI1 

