

# Python 3 program to illustrate  
# the above problem  
  
# function to check if it's possible to  
# divide the square in two equal parts  
def halfsquare(n, x, y) : 
    half = n // 2
  
    # if the painted square is  
    # linked anyway to the center  
    # of the square then it's  
    # not possible  
    if ((half == x or half == x - 1) and
        (half == y or half == y - 1)) : 
        print("NO") 
  
    # else yes it's possible  
    else : 
        print("YES") 
          
# Driver code      
if __name__ == "__main__" : 
  
    # initialize the size of the square  
    n = 100
  
    # initialize the dimension  
    # of the painted square  
    x, y = 51, 100
  
    halfsquare(n, x, y) 
  
# This code is contributed by ANKITRAI1 

