

# Python3 program to count the steps  
# required to convert a number to 1  
  
# Method to calculate the number of actions  
def calculate_(s): 
      
    # if the size of binary is 1  
    # then the number of actions will be zero 
    if len(s) == 1: 
        return 0
  
    # initializing the number of actions as 0 at first 
    count_ = 0
    i = len(s) - 1
    while i > 0: 
          
        # start traversing from the last digit 
        # if its 0 increment the count and decrement i 
        if s[i] == '0': 
            count_ += 1
            i -= 1
              
            # if s[i] == '1' 
        else: 
            count_ += 1
              
            # stop until you get 0 in the binary 
            while s[i] == '1' and i > 0: 
                count_ += 1
                i -= 1
            if i == 0: 
                count_ += 1
            # when encounter a 0 replace it with 1 
            s = s[:i] + "1" + s[i + 1:] 
    return count_ 
  
# Driver code  
s = "10000100000"
print(calculate_(s))  
      
# This code is contributed by 
# Rajnis09 

