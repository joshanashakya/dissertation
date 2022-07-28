

# Python3 implementation of the approach 
  
# Function to find the X and Y intercepts  
# of the line passing through  
# the given points 
def getXandYintercept(P, Q): 
  
    a = P[1] - Q[1]  
    b = P[0] - Q[0] 
      
    # if line is parallel to y axis 
    if b == 0: 
        print(P[0])         # x - intercept will be p[0] 
        print("infinity")   # y - intercept will be infinity 
        return
      
    # if line is parallel to x axis 
    if a == 0: 
        print("infinity")     # x - intercept will be infinity 
        print(P[1])           # y - intercept will be p[1] 
        return
      
      
          
    # Slope of the line 
    m = a / b 
      
    # y = mx + c in where c is unknown  
    # Use any of the given point to find c 
    x = P[0] 
    y = P[1] 
    c = y-m * x 
      
    # For finding the x-intercept put y = 0 
    y = 0
    x =(y-c)/m 
    print(x) 
      
    # For finding the y-intercept put x = 0 
    x = 0
    y = m * x + c 
    print(y)  
  
# Driver code 
p1 = [5, 2]  
p2 = [7, 2] 
getXandYintercept(p1, p2) 

