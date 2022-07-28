

# Python3 implementation of the approach 
  
# Function to return the count 
# of minimum operations required 
def Minimum_Operations(a, n): 
  
    # To store the count of negative integers 
    # on the right of the current index (inclusive) 
    np = [0 for i in range(n + 1)] 
  
    # Find the count of negative integers 
    # on the right 
    for i in range(n - 1, -1, -1): 
        np[i] = np[i + 1] 
  
        # If current element is negative 
        if (a[i] <= 0): 
            np[i] += 1
  
    # To store the count of positive elements 
    pos = 0
    ans = n 
  
    # Find the positive integers 
    # on the left 
    for i in range(n - 1): 
  
        # If current element is positive 
        if (a[i] >= 0): 
            pos += 1
  
        # Update the answer 
        ans = min(ans, pos + np[i + 1]) 
  
    # Return the required answer 
    return ans 
  
# Driver code 
a = [-1, 0, 1, 2] 
n = len(a) 
print(Minimum_Operations(a, n)) 
  
# This code is contributed by mohit kumar 

