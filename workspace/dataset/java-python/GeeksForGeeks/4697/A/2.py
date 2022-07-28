

# Python 3 program to find intersection 
# rectangle of given two rectangles. 
  
# function to find intersection 
# rectangle of given two rectangles. 
def FindPoints(x1, y1, x2, y2,  
               x3, y3, x4, y4): 
  
    # gives bottom-left point 
    # of intersection rectangle 
    x5 = max(x1, x3) 
    y5 = max(y1, y3) 
  
    # gives top-right point 
    # of intersection rectangle 
    x6 = min(x2, x4) 
    y6 = min(y2, y4) 
  
    # no intersection 
    if (x5 > x6 or y5 > y6) : 
        print("No intersection") 
        return
  
    print( "(", x5, ", ", y5, ") ", end = " ") 
  
    print( "(", x6, ", ", y6, ") ", end = " ") 
  
    # gives top-left point 
    # of intersection rectangle 
    x7 = x5 
    y7 = y6 
  
    print( "(", x7, ", ", y7, ") ", end = " ") 
  
    # gives bottom-right point 
    # of intersection rectangle 
    x8 = x6 
    y8 = y5 
  
    print( "(", x8, ", ", y8, ") ") 
  
# Driver code 
if __name__ == "__main__": 
      
    # bottom-left and top-right 
    # corners of first rectangle 
    x1 = 0
    y1 = 0
    x2 = 10
    y2 = 8
  
    # bottom-left and top-right 
    # corners of first rectangle 
    x3 = 2
    y3 = 3
    x4 = 7
    y4 = 9
  
    # function call 
    FindPoints(x1, y1, x2, y2, x3, y3, x4, y4) 
  
# This code is contributed  
# by ChitraNayal 

