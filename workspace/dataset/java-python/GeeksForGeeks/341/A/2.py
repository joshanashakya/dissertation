

# Python implementation of the approach 
  
# Recursive Function  
# global variables p and f 
p = 1.0
f = 1.0
  
def e(x, n) : 
  
    global p, f 
      
    # Termination condition 
    if (n == 0) : 
        return 1
      
    # Recursive call 
    r = e(x, n - 1) 
      
    # Update the power of x 
    p = p * x 
      
    # Factorial 
    f = f * n 
      
    return (r + p / f) 
  
# Driver code 
  
x = 4
n = 15
print(e(x, n)) 
  
# This contributed by ihritik 

