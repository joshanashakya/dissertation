

# Python3 implementation of the approach 
from sys import maxsize as INT_MAX 
  
MX = 2001
OFF = 1000
  
# Represents a point in 2-D space 
class point: 
    def __init__(self, x, y): 
        self.x = x 
        self.y = y 
  
# Function to return the count of 
# required points 
def countPoints(n: int, points: list) -> int: 
  
    # Initialize minimum values to infinity 
    minx = [INT_MAX] * MX 
    miny = [INT_MAX] * MX 
  
    # Initialize maximum values to zero 
    maxx = [0] * MX 
    maxy = [0] * MX 
    x, y = 0, 0
    for i in range(n): 
  
        # Add offset to deal with negative 
        # values 
        points[i].x += OFF 
        points[i].y += OFF 
        x = points[i].x 
        y = points[i].y 
  
        # Update the minimum and maximum 
        # values 
        minx[y] = min(minx[y], x) 
        maxx[y] = max(maxx[y], x) 
        miny[x] = min(miny[x], y) 
        maxy[x] = max(maxy[x], y) 
  
    count = 0
    for i in range(n): 
        x = points[i].x 
        y = points[i].y 
  
        # Check if condition is satisfied 
        # for X coordinate 
        if (x > minx[y] and x < maxx[y]): 
  
            # Check if condition is satisfied 
            # for Y coordinate 
            if (y > miny[x] and y < maxy[x]): 
                count += 1
  
    return count 
  
# Driver Code 
if __name__ == "__main__": 
  
    points = [point(0, 0), 
              point(0, 1), 
              point(1, 0), 
              point(0, -1), 
              point(-1, 0)] 
    n = len(points) 
  
    print(countPoints(n, points)) 
  
# This code is contributed by 
# sanjeev2552 

