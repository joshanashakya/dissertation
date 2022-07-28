

# Python3 implementation of the approach 
  
# Function to return the minimum value of k 
# that satisfies the given condition 
def findMinimumK(a, n, s): 
      
    # Find the maximum element 
    maximum = a[0] 
    for i in range(n): 
        maximum = max(maximum, a[i]) 
  
    # Lowest answer can be 1 and the 
    # highest answer can be (maximum + 1) 
    low = 1
    high = maximum + 1
  
    ans = high 
  
    # Binary search 
    while (low <= high): 
  
        # Get the mid element 
        mid = (low + high) // 2
        sum = 0
  
        # Calculate the sum after dividing 
        # the array by new K which is mid 
        for i in range(n): 
            sum += (a[i] // mid) 
  
        # Search in the second half 
        if (sum > s): 
            low = mid + 1
  
        # First half 
        else: 
            ans = min(ans, mid) 
            high = mid - 1
  
    return ans 
  
# Driver code 
a = [10, 7, 8, 10, 12, 19] 
n = len(a) 
s = 27
  
print(findMinimumK(a, n, s)) 
  
# This code is contributed by Mohit Kumar 

