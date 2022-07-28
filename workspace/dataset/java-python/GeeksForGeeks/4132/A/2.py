

# python implementation to find the 
# transition point 
  
# Function to find the transition 
# point 
def findTransitionPoint(arr, n): 
    # Initialise lower and upper 
    # bounnds 
    lb = 0
    ub = n - 1
  
    # Perform Binary search 
    while (lb <= ub): 
        # Find mid 
        mid = (int)((lb + ub) / 2) 
  
        # update lower_bound if 
        # mid contains 0 
        if (arr[mid] == 0): 
            lb = mid + 1
  
        # If mid contains 1 
        elif (arr[mid] == 1): 
              
            # Check if it is the  
            # left most 1 Return 
            # mid, if yes 
            if (arr[mid - 1] == 0): 
                return mid 
  
            # Else update  
            # upper_bound 
            ub = mid-1
      
    return -1
  
# Driver code 
arr = [0, 0, 0, 0, 1, 1] 
n = len(arr) 
point = findTransitionPoint(arr, n); 
if(point >= 0): 
    print("Transition point is ", point) 
else: 
    print("There is no transition point") 
  
# This code is contributed by Sam007 

