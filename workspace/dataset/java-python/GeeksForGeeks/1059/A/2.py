

# Python implementation of the approach 
  
# Function to return the number 
# of unique pairs in the array 
def countUnique(arr, n): 
    # Set to store unique pairs 
    s = set() 
  
    # Make all possible pairs 
    for i in range(n): 
        for j in range(n): 
            s.add((arr[i], arr[j])) 
  
    # Return the size of the set 
    return len(s) 
  
  
# Driver code 
  
arr = [ 1, 2, 2, 4, 2, 5, 3, 5 ] 
n = len(arr) 
print(countUnique(arr, n)) 
  
# This code is contributed by ankush_953 

