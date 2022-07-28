

# Program to calculate  
# nth term of a series 
  
# func for calualtion 
def seriesFunc(n): 
  
    # for summation of square  
    # of first n-natural nos. 
    sumSquare = (n * (n + 1) * 
                (2 * n + 1)) / 6
  
    # summation of first n  
    # natural nos. 
    sumNatural = (n * (n + 1) / 2) 
  
    # return result 
    return (sumSquare + sumNatural + 1) 
  
# Driver Code 
n = 8
print (int(seriesFunc(n))) 
  
n = 13
print (int(seriesFunc(n))) 
  
# This is code is contributed by Shreyanshi Arun.  

