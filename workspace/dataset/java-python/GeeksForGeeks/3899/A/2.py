

   
# Python3 program to check if 
# a destination is reachable 
# from source with two movements allowed 
  
def isReachable(sx, sy, dx, dy): 
  
    # base case 
    if (sx > dx or sy > dy): 
        return False
  
    # current point is equal to destination 
    if (sx == dx and sy == dy): 
        return True
  
    # check for other 2 possibilities 
    return (isReachable(sx + sy, sy, dx, dy) or
            isReachable(sx, sy + sx, dx, dy)) 
  
# Driver code 
source_x, source_y = 2, 10
dest_x, dest_y = 26, 12
if (isReachable(source_x, source_y, dest_x, dest_y)): 
    print("True") 
else: 
    print("False") 
      
# This code is contributed by Anant Agarwal. 

