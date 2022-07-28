

# Python3 implementation of the approach 
  
# Function to return the kth odd  
# element from the array 
def kthOdd (arr, n, k): 
  
    # Traverse the array 
    for i in range(n): 
  
        # If current element is odd 
        if (arr[i] % 2 == 1): 
            k -= 1; 
  
        # If kth odd element is found 
        if (k == 0): 
            return arr[i]; 
  
    # Total odd elements in the  
    # array are < k 
    return -1; 
  
# Driver code 
arr = [ 1, 2, 3, 4, 5 ]; 
n = len(arr);  
k = 2; 
print(kthOdd(arr, n, k)); 
  
# This code is contributed by mits 

