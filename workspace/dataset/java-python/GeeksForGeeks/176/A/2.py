

# Python 3 implementation to find  
# the rea of the circle  
# inscribed in a trapezoid 
# having non- parllel sides  m, n 
  
  
# Function to find area of circle  
# inscribed in a trapezoid 
# having non- parllel sides  m, n 
def area_of_circle(m, n): 
    # radius of circle by the 
    # formula i.e. root( m * n) / 2 
    # area of circle = (3.141 ) * ( R ** 2 ) 
      
    square_of_radius = ( m * n ) / 4
    area = ( 3.141 * square_of_radius ) 
    return area 
  
# Driver Code  
if __name__=='__main__':  
    n = 10
    m = 30
    print(area_of_circle(m, n)) 

