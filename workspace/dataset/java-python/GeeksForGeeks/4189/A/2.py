

# Python code to check if x exist  
# or not in the given AP. 
  
def isMember(a, d, x): 
      
    # If difference is 0, then x 
    # must be same as a. 
    if d == 0: 
        return x == a 
      
    # Else difference between x  
    # and a must be divisible by d. 
    return ((x - a) % d == 0 & int((x - a) / d) >= 0) 
  
# driver code 
a = 1
x = 7
d = 3
  
if isMember(a, d, x): 
    print( "Yes") 
else: 
    print("No") 
  
# This code is contributed by "Abhishek Sharma 44" 

