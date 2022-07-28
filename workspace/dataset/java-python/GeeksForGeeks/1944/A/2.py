

# Python3 implementation of the approach 
  
# Function to find product of  
# all elements in all subsets 
def product(a, n): 
    ans = 1
    val = pow(2, n - 1) 
  
  
    for i in range(n): 
        ans *= pow(a[i], val) 
  
    return ans 
  
# Driver Code 
n = 2
a = [3, 7] 
  
print(product(a, n)) 
  
# This code is contributed by mohit kumar 

