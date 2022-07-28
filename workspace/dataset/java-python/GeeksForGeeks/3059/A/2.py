

# Python3 implementation of the approach 
  
# Function to return the maximized 
# value of A 
def maxValue(a, b): 
      
    # Sort digits in ascending order 
    b = sorted(b) 
    bi = [i for i in b] 
    ai = [i for i in a] 
      
    n = len(a) 
    m = len(b) 
  
    # j points to largest digit in B 
    j = m - 1
    for i in range(n): 
  
        # If all the digits of b  
        # have been used 
        if (j < 0): 
            break
  
        if (bi[j] > ai[i]): 
            ai[i] = bi[j] 
  
            # Current digit has been used 
            j -= 1
          
    # Return the maximized value 
    x = "" . join(ai) 
    return x 
  
# Driver code 
a = "1234"
b = "4321"
  
print(maxValue(a, b)) 
  
# This code is contributed  
# by mohit kumar 

