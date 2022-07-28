

# Python3 implementation to find the 
# maximum area inscribed in an 
# equilateral triangle 
  
# Function to find the maximum area 
# of the rectangle inscribed in an 
# equilateral triangle of side S 
def solve(s): 
      
    # Maximum area of the rectangle 
    # inscribed in an equilateral 
    # triangle of side S 
    area = (1.732 * s**2)/8
    return area 
      
      
# Driver Code 
if __name__=='__main__': 
    n = 14
    print(solve(n)) 

