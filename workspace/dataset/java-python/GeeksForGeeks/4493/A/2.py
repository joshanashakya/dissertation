

# Python 3 to check whether 
# the number has only 
# first and last bits set 
  
# function to check whether 
# the number has only 
# first and last bits set 
def onlyFirstAndLastAreSet(n): 
  
    if (n == 1):  
        return True
    if (n == 2):  
        return False
  
    return (((n - 1) &  
             (n - 2)) == 0) 
  
# Driver Code 
n = 9
if (onlyFirstAndLastAreSet(n)): 
    print("Yes") 
else: 
    print("No") 
      
# This code is contributed 
# by Smitha 

