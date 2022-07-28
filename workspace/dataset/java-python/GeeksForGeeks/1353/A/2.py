

# Python3 implementation of the approach 
  
# Function to return the minimum 
# required index 
def minIndex(arr, n, pos): 
  
    num = arr[pos] 
  
    # Start from arr[pos - 1] 
    i = pos - 1
    while (i >= 0): 
        if (arr[i] != num): 
            break
        i -= 1
      
    # All elements are equal 
    # from arr[i + 1] to arr[pos] 
    return i + 1
  
# Driver code 
arr = [2, 1, 1, 1, 5, 2 ] 
n = len(arr) 
pos = 4
  
print(minIndex(arr, n, pos)) 
  
# This code is contributed by  
# Mohit Kumar 29 

