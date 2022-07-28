

# Python 3 implementation  
# of above approach  
  
# Function to check whether  
# it is possible to make a 
# regular polygon with a  
# given angle.  
def makePolygon(a) : 
  
    # N denotes the number of sides  
    # of polygons possible 
    n = 360 / (180 - a) 
  
    if n == int(n) : 
        print("YES") 
  
    else : 
        print("NO") 
  
# Driver Code 
if __name__ == "__main__" : 
    a = 90
  
    # function calling  
    makePolygon(a) 
      
# This code is contributed  
# by ANKITRAI1 

