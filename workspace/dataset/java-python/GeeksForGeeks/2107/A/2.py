

# An efficient python program to 
# find different (x, y) pairs  
# that satisfy x*x + y*y < n. 
  
# This function counts number of 
# pairs (x, y) that satisfy the 
# inequality x*x + y*y < n. 
def countSolutions(n): 
      
    x = 0
    res = 0
    yCount = 0
  
    # Find the count of different 
    # y values for x = 0. 
    while(yCount * yCount < n): 
        yCount = yCount + 1
          
    # One by one increase value of 
    # x, and find yCount for current 
    # x. If yCount becomes 0, then  
    # we have reached maximum  
    # possible value of x. 
    while (yCount != 0): 
        # Add yCount (count of  
        # different possible values 
        # of y for current x) to 
        # result 
        res = res + yCount 
  
        # Increment x 
        x = x + 1
  
        # Update yCount for current  
        # x. Keep reducing yCount 
        # while the inequality is  
        # not satisfied. 
        while (yCount != 0 and (x * x  
                     + (yCount - 1) *
                     (yCount - 1) >= n)): 
            yCount = yCount - 1
          
    return res 
  
# Driver program to test  
# above function 
print ("Total Number of distinct ", 
           "Non-Negative pairs is "
               , countSolutions(6)) 
  
# This code is contributed by Sam007. 

