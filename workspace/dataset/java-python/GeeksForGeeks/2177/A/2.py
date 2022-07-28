

# Python3 implementation of the  
# above approach  
  
# Function calculate cummalative sum  
# of x, y, x^2, y^2 coordinates.  
def cumm(x, y, cummx, cummy,  
               cummx2, cummy2, n):  
  
    for i in range(1, n+1):  
        cummx[i] = cummx[i - 1] + x[i]  
        cummy[i] = cummy[i - 1] + y[i]  
        cummx2[i] = cummx2[i - 1] + x[i] * x[i]  
        cummy2[i] = cummy2[i - 1] + y[i] * y[i]  
  
# Function ot calculate the  
# hammered distance  
def calHammeredDistance(n, x, y):  
  
    # cummx conatins cummulative sum of x  
    # cummy conatins cummulative sum of y  
    cummx = [0] * (n + 1) 
    cummy = [0] * (n + 1)  
  
    # cummx2 conatins cummulative sum of x^2  
    # cummy2 conatins cummulative sum of y^2  
    cummx2 = [0] * (n + 1) 
    cummy2 = [0] * (n + 1)  
  
    # calculate cumulative of x , y, x^2, y^2,  
    # because these terms are required in the 
    # formula to reduce complexity.  
  
    # This function calculate all required terms.  
    cumm(x, y, cummx, cummy, cummx2, cummy2, n)  
  
    # hdx calculate hammer distance for x coordinate  
    # hdy calculate hammer distance for y coordinate  
    hdx, hdy = 0, 0
  
    for i in range(1, n + 1):  
  
        # came from formula describe in explanation  
        hdx += ((i - 1) * x[i] * x[i] + cummx2[i - 1] -
                             2 * x[i] * cummx[i - 1]) 
  
        # came from formula describe in explanation  
        hdy += ((i - 1) * y[i] * y[i] + cummy2[i - 1] - 
                             2 * y[i] * cummy[i - 1]) 
      
    # total is the sum of both x and y.  
    total = hdx + hdy  
    return total  
  
# Driver Code 
if __name__ == "__main__": 
  
    # number of points  
    n = 3
  
    # x contains the x coordinates  
    # y conatins the y coordinates  
    x = [0, 0, 1, 0]  
    y = [1, 0, 0, 0]  
  
    print(calHammeredDistance(n, x, y))  
  
# This code is contributed by Rituraj Jain 

