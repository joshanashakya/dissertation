

# Python implementation of the approach 
  
# Function to return the count 
# of indices that satisfy 
# the given condition 
def countIndices(arr, n): 
  
    # To store the result 
    cnt = 0; 
  
    # To store the current maximum 
    # Initialized to 0 since there are only 
    # positive elements in the array 
    max = 0; 
    for i in range(n): 
        # i is a valid index 
        if (max < arr[i]):  
  
            # Update the maximum so far 
            max = arr[i]; 
  
            # Increment the counter 
            cnt += 1; 
  
    return cnt; 
  
# Driver code 
if __name__ == '__main__': 
    arr = [ 1, 2, 3, 4 ]; 
    n = len(arr); 
  
    print(countIndices(arr, n)); 
  
# This code is contributed by 29AjayKumar 

