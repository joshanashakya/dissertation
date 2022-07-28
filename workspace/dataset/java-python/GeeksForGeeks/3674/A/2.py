

# Python3 program to Check  
# if a point lies on or  
# inside a rectangle | Set-2 
  
# function to find if  
# given point lies inside  
# a given rectangle or not. 
def FindPoint(x1, y1, x2,  
              y2, x, y) : 
    if (x > x1 and x < x2 and 
        y > y1 and y < y2) : 
        return True
    else : 
        return False
  
# Driver code 
if __name__ == "__main__" : 
  
    # bottom-left and top-right 
    # corners of rectangle. 
    # use multiple assigment 
    x1 , y1 , x2 , y2 = 0, 0, 10, 8
  
    # given point 
    x, y = 1, 5
  
    # function call 
    if FindPoint(x1, y1, x2,  
                 y2, x, y) : 
        print("Yes") 
    else : 
        print("No") 
  
# This code is contributed 
# by Ankit Rai 

