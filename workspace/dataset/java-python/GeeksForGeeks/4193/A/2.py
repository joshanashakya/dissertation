

# Python3 program for find Tangent  
# on a curve at given point  
  
# function for find Tangent 
def findTangent(A, x, y) : 
  
    #  differentiate given equation  
    dif = A - x * 2
  
    #  check that point on the curve or not  
    if y == (2 * x - x * x) : 
  
        # if differentiate is negative  
        if dif < 0 : 
  
            print("y =",dif,"x",(x * dif) + (y)) 
  
        # differentiate is positive  
        elif dif > 0 : 
  
            print("y =",dif,"x+",-x * dif + y) 
  
        # differentiate is zero  
        else : 
              
            print("Not Possible") 
              
   
# Driver code      
if __name__ == "__main__" : 
  
    # declare variable  
    A, x, y = 2, 2, 0
  
    # call function findTangent 
    findTangent(A, x, y) 
                   
# This code is contributed by  
# ANKITRAI1 

