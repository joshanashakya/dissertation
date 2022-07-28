

# Python implementation of the approach 
  
# Function to return the maximum count of  
# selection possible from the given array  
# following the given process 
def maxSelectionCount(a, n): 
    # Initialize result 
    res = 0; 
  
    # Sorting the array 
    a.sort(); 
  
    # Initialize the select variable 
    select = 1; 
  
    # Loop through array 
    for i in range(n): 
        # If selection is possible 
        if (a[i] >= select): 
            res += 1; # Increment result 
            select += 1; # Increment selection variable 
  
    return res; 
  
  
# Driver Code 
arr = [ 4, 2, 1, 3, 5, 1, 4 ]; 
N = len(arr); 
print(maxSelectionCount(arr, N)); 
  
# This code contributed by PrinciRaj1992 

