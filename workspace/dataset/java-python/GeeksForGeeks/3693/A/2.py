

# Python3 implementation of the approach 
  
# Function to return the value of nCk 
def binomialCoeff(n, k): 
  
    res = 1
  
    # Since C(n, k) = C(n, n-k) 
    if (k > n - k): 
        k = n - k 
  
    # Calculate value of 
    # [n * (n-1) *---* (n-k+1)] /  
    # [k * (k-1) *---* 1] 
    for i in range(k): 
        res *= (n - i) 
        res //= (i + 1) 
  
    return res 
  
# Function to return the number 
# of paths 
def countPaths(x1, y1, x2, y2): 
  
    # Difference between the 'x'  
    # coordinates of the given points 
    m = abs(x1 - x2) 
  
    # Difference between the 'y'  
    # coordinates of the given points 
    n = abs(y1 - y2) 
  
    return (binomialCoeff(m + n, n)) 
  
# Driver code 
x1, y1, x2, y2 = 2, 3, 4, 5
print(countPaths(x1, y1, x2, y2)) 
  
# This code is contributed  
# by Mohit Kumar 

