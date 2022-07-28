

# Python3 implementation to find the 
# minimum elements required to  
# be inserted into an array to 
# form an arithmetic progression 
  
# Function to find the greatest  
# common divisor of two numbers 
def gcdFunc(a, b): 
    if (b == 0): 
        return a  
      
    return gcdFunc(b, a % b) 
  
# Function to find the minimum  
# the minimum number of elements 
# required to be inserted into array 
def findMinimumElements(a, n): 
    b = [0]*(n - 1) 
      
    # Difference array of consecutive  
    # elements of the array 
    for i in range(1,n): 
        b[i - 1] = a[i] - a[i - 1] 
          
    gcd = b[0] 
  
    # GCD of the difference array 
    for i in range(n-1): 
        gcd = gcdFunc(gcd, b[i]) 
      
    ans = 0
      
    # Loop to calculate the minimum 
    # number of elements required 
    for i in range(n-1): 
        ans += (b[i] // gcd) - 1
      
    return ans 
  
# Driver Code 
arr1 = [1, 6, 8, 10, 14, 16] 
n1 = len(arr1) 
# Function calling 
print(findMinimumElements(arr1, n1)) 
  
# This code is contributed by shubhamsingh10 

