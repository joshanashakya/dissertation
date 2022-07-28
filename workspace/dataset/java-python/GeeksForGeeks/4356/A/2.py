

# Python3 implementation of the approach 
  
# Function that returns true if the prisoners 
# can be placed such that the minimum distance 
# between any two prisoners is at least sep 
def canPlace(a, n, p, sep): 
      
    # Considering the first prisoner 
    # is placed at 1st cell 
    prisoners_placed = 1
  
    # If the first prisoner is placed at 
    # the first cell then the last_prisoner_placed 
    # will be the first prisoner placed 
    # and that will be in cell[0] 
    last_prisoner_placed = a[0] 
  
    for i in range(1, n): 
        current_cell = a[i] 
  
        # Checking if the prisoner can be 
        # placed at ith cell or not 
        if (current_cell - last_prisoner_placed >= sep): 
            prisoners_placed += 1
            last_prisoner_placed = current_cell 
  
            # If all the prisoners got placed 
            # then return true 
            if (prisoners_placed == p): 
                return True
  
    return False
  
# Function to return the maximized distance 
def maxDistance(cell, n, p): 
  
    # Sort the array so that binary 
    # search can be applied on it 
    cell = sorted(cell) 
  
    # Minimum possible distance 
    # for the search space 
    start = 0
  
    # Maximum possible distance 
    # for the search space 
    end = cell[n - 1] - cell[0] 
  
    # To store the result 
    ans = 0
  
    # Binary search 
    while (start <= end): 
        mid = start + ((end - start) // 2) 
  
        # If the prisoners can be placed such that 
        # the minimum distance between any two 
        # prisoners is at least mid 
        if (canPlace(cell, n, p, mid)): 
  
            # Update the answer 
            ans = mid 
            start = mid + 1
        else : 
            end = mid - 1
  
    return ans 
  
# Driver code 
cell= [1, 2, 8, 4, 9] 
n = len(cell) 
p = 3
  
print(maxDistance(cell, n, p)) 
  
# This code is contributed by mohit kumar 29 

