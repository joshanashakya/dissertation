

# Python3 implementation of the above approach 
  
# Returns the minimum number of eliminations 
def min_elimination(n, arr): 
  
    count = 0
  
    # Stores the previous element 
    prev_val = arr[0] 
  
    # Stores the new value 
    for i in range (1, n):  
        curr_val = arr[i]; 
  
        # Check if the previous and current 
        # values are of same parity 
        if (curr_val % 2 == prev_val % 2): 
            count = count + 1
  
        # Previous value is now the current value 
        prev_val = curr_val 
      
  
    # Return the counter variable 
    return count 
  
# Driver code 
arr = [ 1, 2, 3, 7, 9 ] 
n = len(arr) 
  
print(min_elimination(n, arr)); 
  
# This code is contributed by ihritik 

