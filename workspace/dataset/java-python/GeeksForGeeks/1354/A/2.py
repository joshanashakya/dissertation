

# Python3 implementation of the approach 
  
# Function to return the maximum difference 
def findMaximumDiff(a, n): 
    ind1 = 0
  
    # Iteratively check from back 
    for i in range(n - 1, -1, -1): 
  
        # Different numbers 
        if (a[0] != a[i]): 
            ind1 = i 
            break
  
    ind2 = 0
  
    # Iteratively check from 
    # the beginning 
    for i in range(n - 1): 
  
        # Different numbers 
        if (a[n - 1] != a[i]): 
            ind2 = (n - 1 - i) 
            break
  
    return max(ind1, ind2) 
  
# Driver code 
a = [1, 2, 3, 2, 3] 
n = len(a) 
print(findMaximumDiff(a, n)) 
  
# This code is contributed by mohit kumar 

