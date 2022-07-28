

# Python3 implementation of the approach  
  
# Function to find foot of perpendicular  
# from a point in 2 D plane to a Line  
def findFoot(a, b, c, x1, y1):  
  
    temp = (-1 * (a * x1 + b * y1 + c) //
                  (a * a + b * b))  
    x = temp * a + x1  
    y = temp * b + y1  
    return (x, y)  
  
# Driver Code  
if __name__ == "__main__": 
  
    # Equation of line is  
    # ax + by + c = 0  
    a, b, c = 0.0, 1.0, -2
      
    # Coordinates of point p(x1, y1).  
    x1, y1 = 3.0, 3.0
  
    foot = findFoot(a, b, c, x1, y1)  
    print(int(foot[0]), int(foot[1]))  
          
# This code is contributed 
# by Rituraj Jain 

