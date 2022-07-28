

# Utility function to return the number 
# of distinct elements in an array 
def countDistinct(arr, Len): 
  
    hs = dict() 
  
    for i in range(Len): 
          
        # add all the elements to the HashSet 
        hs[arr[i]] = 1
  
    # Return the size of hashset as 
    # it consists of all unique elements 
    return len(hs) 
  
# Function to return the count of 
# positions the person went to 
def getDistinctPoints(current_pos, path): 
  
    # Length of path 
    Len = len(path) 
  
    # Array to store all the points traveled 
    points = [0 for i in range(Len + 1)] 
  
    # The first pois the current_pos 
    points[0] = current_pos 
  
    # For all the directions in path 
    for i in range(Len): 
  
        # Get whether the direction  
        # was left or right 
        ch = path[i] 
  
        # If the direction is left 
        if (ch == '0'): 
  
            # Decrement the current position by 1 
            current_pos -= 1
  
            # Store the current position in array 
            points[i + 1] = current_pos 
  
        # If the direction is right 
        else: 
  
            # Increment the current position by 1 
            current_pos += 1
  
            # Store the current position in array 
            points[i + 1] = current_pos 
          
    return countDistinct(points, Len + 1) 
  
# Driver code 
current_pos = 5
path = "011101"
  
print(getDistinctPoints(current_pos, path)) 
  
# This code is contributed by mohit kumar 

