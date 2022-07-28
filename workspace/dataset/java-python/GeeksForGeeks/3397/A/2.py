

# Python3 implementation of the approach 
  
# Function to return the minimum number of 
# increment operations required to make 
# any k elements of the array equal 
def minOperations(ar, k): 
  
    # Sort the array in increasing order 
    ar = sorted(ar) 
  
    # Calculate the number of operations 
    # needed to make 1st k elements equal to 
    # the kth element i.e. the 1st window 
    opsNeeded = 0
    for i in range(k): 
        opsNeeded += ar[k - 1] - ar[i] 
  
    # Answer will be the minimum of all 
    # possible k sized windows 
    ans = opsNeeded 
  
    # Find the operations needed to make 
    # k elements equal to ith element 
    for i in range(k, len(ar)): 
  
        # Slide the window to the right and 
        # subtract increments spent on leftmost 
        # element of the previous window 
        opsNeeded = opsNeeded - (ar[i - 1] - ar[i - k]) 
  
        # Add increments needed to make the 1st k-1 
        # elements of this window equal to the 
        # kth element of the current window 
        opsNeeded += (k - 1) * (ar[i] - ar[i - 1]) 
        ans = min(ans, opsNeeded) 
  
    return ans 
  
# Driver code 
arr = [3, 1, 9, 100] 
n = len(arr) 
k = 3
  
print(minOperations(arr, k)) 
  
# This code is contributed by Mohit Kumar 

