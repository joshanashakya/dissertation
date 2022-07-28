

# Python 3 program to illustrate 
# the above problem 
  
# function to get the minimum length of 
# the shorter side of the triangle 
def shortestLength(n, x, y): 
    answer = 0
  
    # traversing through each 
    # points on the plane 
    i = 0
    while n > 0:  
          
        # if sum of a points is greater  
        # than the previous one, the  
        # maximum gets replaced 
        if (x[i] + y[i] > answer): 
            answer = x[i] + y[i] 
  
        i += 1
        n -= 1
  
    # print the length 
    print("Length -> "+ str(answer)) 
    print( "Path -> "+
        "( 1, " +str(answer)+ " )"+
        "and ( "+str( answer) +", 1 )") 
  
# Driver code 
if __name__ == "__main__": 
      
    # initialize the number of points 
    n = 4
  
    # points on the plane 
    x = [ 1, 4, 2, 1 ] 
    y = [ 4, 1, 1, 2 ]  
    shortestLength(n, x, y) 
  
# This code is contributed  
# by ChitraNayal 

