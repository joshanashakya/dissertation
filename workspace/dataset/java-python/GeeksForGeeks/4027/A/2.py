

# Python implementation to check whether the array 
# contains a set of contiguous integers 
  
# Function to check whether the array  
# contains a set of contiguous integers 
def areElementsContiguous(arr): 
    # Storing elements of 'arr[]' in a hash table 'us'  
    us = set() 
    for i in arr: us.add(i) 
  
    # As arr[0] is present in 'us' 
    count = 1
  
    # Starting with previous smaller element of arr[0] 
    curr_ele = arr[0] - 1
  
    # If 'curr_ele' is present in 'us' 
    while curr_ele in us: 
  
        # Increment count 
        count += 1
  
        # Update 'curr_ele" 
        curr_ele -= 1
  
    # Starting with next greater element of arr[0] 
    curr_ele = arr[0] + 1
  
    # If 'curr_ele' is present in 'us' 
    while curr_ele in us: 
  
        # Increment count 
        count += 1
  
        # Update 'curr_ele" 
        curr_ele += 1
  
    # Returns true if array contains a set of 
    # contiguous integers else returns false 
    return (count == len(us)) 
  
# Driver code 
arr = [ 5, 2, 3, 6, 4, 4, 6, 6 ] 
if areElementsContiguous(arr): print("Yes") 
else: print("No") 
  
# This code is contributed by 'Ansu Kumari' 

