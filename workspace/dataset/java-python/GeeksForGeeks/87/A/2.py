

# Python3 implementation of the approach 
  
# Function to return the amount of wood 
# collected if the cut is made at height m 
def woodCollected(height, n, m): 
    sum = 0
    for i in range(n - 1, -1, -1): 
        if (height[i] - m <= 0): 
            break
        sum += (height[i] - m) 
  
    return sum
  
# Function that returns Height at 
# which cut should be made 
def collectKWood(height, n, k): 
      
    # Sort the heights of the trees 
    height = sorted(height) 
  
    # The minimum and the maximum 
    # cut that can be made 
    low = 0
    high = height[n - 1] 
  
    # Binary search to find the answer 
    while (low <= high): 
        mid = low + ((high - low) // 2) 
  
        # The amount of wood collected 
        # when cut is made at the mid 
        collected = woodCollected(height, n, mid) 
  
        # If the current collected wood is 
        # equal to the required amount 
        if (collected == k): 
            return mid 
  
        # If it is more than the required amount 
        # then the cut needs to be made at a 
        # height higher than the current height 
        if (collected > k): 
            low = mid + 1
  
        # Else made the cut at a lower height 
        else: 
            high = mid - 1
  
    return -1
  
# Driver code 
height = [1, 2, 1, 2] 
n = len(height) 
k = 2
  
print(collectKWood(height, n, k)) 
  
# This code is contributed by Mohit Kumar 

