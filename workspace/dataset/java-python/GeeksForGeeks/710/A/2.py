

# Python implementation of the above approach 
  
# Function to find the maximum sum 
def maxSum(a, n): 
  
    # Maximum AND is maximum element 
    maxAnd = max(a) 
  
    # Maximum OR is bitwise OR of all. 
    maxOR = 0
    for i in range(n): 
        maxOR|= a[i] 
          
    print(maxAnd + maxOR) 
  
# Driver code 
n = 4
a = [3, 5, 6, 1] 
maxSum(a, n) 

