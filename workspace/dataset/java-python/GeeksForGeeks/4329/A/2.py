

# Python3 program to find minimum  
# (or maximum) element in an array. 
def getMin(arr, n): 
  
    # If there is single element, return it. 
    # Else return minimum of first element  
    # and minimum of remaining array. 
    return min(arr); 
  
def getMax( arr, n): 
  
    # If there is single element, return it. 
    # Else return maximum of first element  
    # and maximum of remaining array. 
    return max(arr); 
  
# Driver code 
arr = [12, 1234, 45, 67, 1] 
n = len(arr) 
print("Minimum element of array: ",  
                   getMin(arr, n)); 
print("Maximum element of array: ", 
                   getMax(arr, n)); 
  
# This code is contributed by  
# Mohit Kumar 29 

