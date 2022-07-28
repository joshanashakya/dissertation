

# Python 3 program to count all  
# distinct binary strings with  
# two consecutive 1's 
  
  
# Returns count of n length 
# binary strings with  
# consecutive 1's 
def countStrings(n) : 
      
    # Count binary strings without  
    # consecutive 1's. 
    # See the approach discussed on be 
    # ( http://goo.gl/p8A3sW ) 
    a = [0] * n 
    b = [0] * n 
    a[0] = b[0] = 1
    for i in range(1, n) : 
        a[i] = a[i - 1] + b[i - 1] 
        b[i] = a[i - 1] 
      
      
    # Subtract a[n-1]+b[n-1] from 2^n 
    return (1 << n) - a[n - 1] - b[n - 1] 
      
# Driver program  
print(countStrings(5)) 
  
  
# This code is contributed 
# by Nikita tiwari. 

