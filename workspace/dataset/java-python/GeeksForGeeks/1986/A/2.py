

# Python3 implementation of the above approach 
  
# Function to return the required number 
def getMaxNum(a, b, c): 
  
    # If b % c = 0 then b is the 
    # required number 
    if (b % c == 0): 
        return b 
  
    # Else get the maximum multiple  
    # of c smaller than b 
    x = ((b //c) * c) 
      
    if (x >= a and x <= b): 
        return x 
    else: 
        return -1
  
# Driver code 
a, b, c = 2, 10, 3
print(getMaxNum(a, b, c)) 
  
# This code is contributed  
# by Mohit Kumar 

