

# Python3 implementation of the approach 
  
# Function to return the minimum number 
# of elements to be removed from the ends 
# of the array to make it sorted 
def findMin(arr, n): 
  
    # To store the final answer 
    ans = 1
  
    # Two pointer loop 
    for i in range(n): 
        j = i + 1
  
        # While the array is increasing increment j 
        while (j < n and arr[j] >= arr[j - 1]): 
            j += 1
  
        # Updating the ans 
        ans = max(ans, j - i) 
  
        # Updating the left pointer 
        i = j - 1
  
    # Returning the final answer 
    return n - ans 
  
# Driver code 
arr = [3, 2, 1] 
n = len(arr) 
  
print(findMin(arr, n)) 
  
# This code is contributed by Mohit Kumar 

