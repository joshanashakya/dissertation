

# Python3 program to calculate  
# the smallest multiple of x  
# closest to a given number 
  
# Function to calculate 
# the smallest multiple 
def closestMultiple(n, x): 
    if x > n: 
        return x; 
    z = (int)(x / 2); 
    n = n + z; 
    n = n - (n % x); 
    return n; 
  
# Driver Code 
n = 56287; 
x = 27; 
print(closestMultiple(n, x)); 
  
# This code is contributed 
# by mits 

