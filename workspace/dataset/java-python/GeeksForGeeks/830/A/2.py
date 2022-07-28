

# Python3 implementation to count the 
# number of times the graph 
# crosses the x-axis. 
  
# Function to to count the 
# number of times the graph 
# crosses the x-axis. 
def times(steps, n): 
  
    current_level = 0
    previous_level = 0
    count = 0
  
    # Iterate over the steps array 
    for i in range(n): 
  
        # Update the previous level and 
        # current level by value given 
        #in the steps array 
        previous_level = current_level 
        current_level = current_level+ steps[i] 
  
        # Condition to check that the 
        # graph crosses the origin. 
        if ((previous_level < 0
            and current_level >= 0) 
            or (previous_level > 0
                and current_level <= 0)): 
            count += 1
  
    return count 
  
# Driver Code 
steps = [1, -1, 0, 0, 1, 1, -3, 2] 
n = len(steps) 
  
print(times(steps, n)) 
  
# This code is contributed by mohit kumar 29 

