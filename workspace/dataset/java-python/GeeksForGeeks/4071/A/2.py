

# Python3 program to find the end 
# point of a line 
  
# function to find the end point 
# of a line 
def otherEndPoint(x1, y1, m1, m2): 
      
    # find end point for x cordinates 
    x2 = (2 * m1 - x1) 
  
    # find end point for y cordinates 
    y2 = (2 * m2 - y1) 
  
    print ("x2 = {}, y2 = {}" 
               . format(x2, y2)) 
  
# Driven Program 
x1 = -4
y1 = -1
m1 = 3
m2 = 5
otherEndPoint(x1, y1, m1, m2) 
  
# This code is contributed by  
# Manish Shaw (manishshaw1) 

