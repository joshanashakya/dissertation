

# Program to calculate the  
# geometric mean of the  
# given array elements. 
import math 
  
# function to calculate  
# geometric mean and  
# return float value. 
def geometricMean(arr, n): 
      
    # declare sum variable and 
    # initialize it to 1. 
    sum = 0; 
      
    # Compute the sum of all  
    # the elements in the array. 
    for i in range(n): 
        sum = sum + math.log(arr[i]); 
      
    # compute geometric mean  
    # through formula antilog 
    # (((log(1) + log(2) + . . 
    # ... + log(n))/n) 
    # and return the value to  
    # main function. 
    sum = sum / n; 
      
    return math.exp(sum); 
  
# Driver Code 
arr= [ 1, 2, 3, 4, 5, 6, 7, 8 ]; 
n = len(arr); 
  
# function call 
print(geometricMean(arr, n)); 
  
# This code is contributed by mits. 

