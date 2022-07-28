

# Python Program to calculate the 
# geometric mean of the given  
# array elements. 
import math 
  
# function to calculate geometric  
# mean and return float value. 
def geometricMean(arr, n) : 
      
    # declare product variable and 
    # initialize it to 1. 
    product = 1
      
    # Compute the product of all the 
    # elements in the array. 
    for i in range(0,n) : 
        product = product * arr[i] 
   
    # compute geometric mean through  
    # formula pow(product, 1/n) and 
    # return the value to main function. 
    gm = (float)(math.pow(product, (1 / n))) 
    return (float)(gm) 
      
      
# Driver function 
arr = [ 1, 2, 3, 4, 5, 6, 7, 8] 
n = len(arr) 
  
# to print 6 digits after decimal 
print ('{0:.6f}'.format(geometricMean(arr, n))) 
  
   
# This code is contributed by Nikita Tiwari 

