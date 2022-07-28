

# Python 3 program to Check whether  
# a given point lies inside or on 
# the rectangle or not 
  
# function to Check whether a given  
# point lies inside or on the 
# rectangle or not  
def LiesInsieRectangle(a, b, x, y) : 
  
    if(x - y - b <= 0 and 
       x - y + b >= 0 and 
       x + y - 2 * a + b <= 0 and 
       x + y - b >= 0) : 
        return True
      
    return False
  
# Driver code 
if __name__ == "__main__" : 
  
    # multiple assignments 
    a, b, x, y = 7, 2, 4, 5
  
    if LiesInsieRectangle(a, b, x, y) : 
        print("Given point lies inside"
                      " the rectangle") 
    else : 
        print("Given point does not lie" 
                    " on the rectangle") 
  
# This code is contributed by ANKITRAI1 

