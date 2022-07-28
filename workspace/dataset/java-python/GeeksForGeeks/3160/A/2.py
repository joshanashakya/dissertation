

# Python program to check 
# if a number is power of 
# another number 
  
# Returns true if y is a 
# power of x  
def isPower (x, y): 
      
    # The only power of 1 
    # is 1 itself 
    if (x == 1): 
        return (y == 1) 
          
    # Repeatedly compute 
    # power of x 
    pow = 1
    while (pow < y): 
        pow = pow * x 
  
    # Check if power of x 
    # becomes y 
    return (pow == y) 
      
      
# Driver Code 
# check the result for 
# true/false and print. 
if(isPower(10, 1)): print("True") 
else: print("False") 
  
if(isPower(1, 20)): print("True") 
else: print("False") 
  
if(isPower(2, 128)): print("True") 
else: print("False") 
  
if(isPower(2, 30)): print("True") 
else: print("False") 
     

