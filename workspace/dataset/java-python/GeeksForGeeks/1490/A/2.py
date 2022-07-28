

# Python3 implementation of the approach 
  
# Function to find the missing elements 
def missing_elements(vec): 
  
    # Vector to store the list 
    # of missing elements 
    mis = [] 
  
    # For every given element 
    for i in range(len(vec)): 
  
        # Find its index 
        temp = abs(vec[i]) - 1
  
        # Update the element at the found index 
        if vec[temp] > 0: 
            vec[temp] = -vec[temp] 
  
    for i in range(len(vec)): 
  
        # Current element was not present 
        # in the original vector 
        if (vec[i] > 0): 
            mis.append(i + 1) 
  
    return mis 
  
# Driver code 
vec = [3, 3, 3, 5, 1] 
  
# Vector to store the returned 
# list of missing elements 
miss_ele = missing_elements(vec) 
  
# Print the list of elements 
for i in range(len(miss_ele)): 
    print(miss_ele[i], end = " ") 
  
# This code is contributed by Mohit Kumar 

