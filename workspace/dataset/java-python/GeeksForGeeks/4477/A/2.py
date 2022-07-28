

# Python3 implementation of  
# the above approach 
  
# Function that will find out 
# the number 
def printNumber(holes): 
  
    # If number of holes 
    # equal 0 then return 1 
    if (holes == 0): 
        print("1") 
  
    # If number of holes 
    # equal 0 then return 0 
    elif (holes == 1): 
        print("0", end = "") 
  
    # If number of holes 
    # is more than 0 or 1. 
    else: 
        rem = 0
        quo = 0
  
        rem = holes % 2
        quo = holes // 2
  
        # If number of holes is 
        # odd 
        if (rem == 1): 
            print("4", end = "") 
  
        for i in range(quo): 
            print("8", end = "") 
  
# Driver code 
holes = 3
  
# Calling Function 
printNumber(holes) 
  
# This code is contributed by Mohit kumar 

