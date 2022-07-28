

# Python3 implementation to find the transition point 
  
# Function to find the transition point 
def findTransitionPoint(arr, n): 
      
    # perform a linear search and return the index of  
    # first 1 
    for i in range(n): 
        if(arr[i] == 1): 
            return i 
      
    # if no element is 1 
    return -1
  
# Driver code 
arr = [0, 0, 0, 0, 1, 1] 
n = len(arr) 
  
point = findTransitionPoint(arr, n) 
  
if point >= 0: 
    print("Transition point is", point) 
else:  
    print("There is no transition point") 
      
# This code is contributed by shubhamsingh10 

