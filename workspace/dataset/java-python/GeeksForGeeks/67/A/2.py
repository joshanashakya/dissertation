

# Python3 implementation of the above approach 
  
# Function that arrange the array such that 
# all absolute difference between adjacent 
# element are sorted 
def sortedAdjacentDifferences(arr, n): 
      
    # To store the resultant array 
    ans = [0]*n 
  
    # Sorting the given array 
    # in ascending order 
    arr = sorted(arr) 
  
    # Variable to represent left and right 
    # ends of the given array 
    l = 0
    r = n - 1
  
    # Traversing the answer array in reverse 
    # order and arrange the array elements from 
    # arr[] in reverse order 
    for i in range(n - 1, -1, -1): 
  
        # Inserting elements in zig-zag manner 
        if (i % 2): 
            ans[i] = arr[l] 
            l += 1
        else: 
            ans[i] = arr[r] 
            r -= 1
  
    # Displaying the resultant array 
    for i in range(n): 
        print(ans[i], end=" ") 
  
# Driver Code 
if __name__ == '__main__': 
    arr=[5, -2, 4, 8, 6, 4, 5] 
    n = len(arr) 
  
    # Function Call 
    sortedAdjacentDifferences(arr, n) 
      
# This code is contributed by mohit kumar 29 

