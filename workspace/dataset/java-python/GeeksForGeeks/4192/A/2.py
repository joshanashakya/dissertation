

# Python 3 program for find curve 
# at given point 
  
# function for find normal 
def findNormal(A, x, y): 
      
    # differentiate given equation 
    dif = A - x * 2
  
    # check that point on the curve or not 
    if (y == (2 * x - x * x)): 
          
        # if differentiate is negative 
        if (dif < 0): 
            print(0 - dif, "y =", "x",  
                 (0 - x) + (y * dif)) 
  
        elif (dif > 0): 
              
            # differentiate is positive 
            print(dif, "y =", "- x +",  
                        x + dif * y) 
  
        # differentiate is zero 
        else: 
            print("x =", x) 
  
    # other wise normal not found 
    else: 
        print("Not possible") 
  
# Driver code 
if __name__ == '__main__': 
      
    # declare variable 
    A = 2
    x = 2
    y = 0
  
    # call function findNormal 
    findNormal(A, x, y) 
      
# This code is contributed By 
# Surendra_Gangwar 

