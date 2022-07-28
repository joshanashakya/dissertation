

# An simple Python program to  
# find minimum number formed  
# by bits of a given number. 
def _popcnt32(number) : 
    counter = 0
      
    while(number > 0) : 
        if(number % 2 == 1) : 
            counter = counter + 1
              
        # or number = number >> 1 
        number = int(number / 2)  
  
    return counter 
  
# Returns maximum number formed  
# by bits of a given number. 
def maximize(a) : 
      
    # _popcnt32(a) gives number  
    # of 1's present in binary  
    # representation of a. 
    n = _popcnt32(a) 
              
    # Set most significant 
    # n bits of res. 
    res = 0
    for i in range(1, n + 1) : 
        res = int(res |  
                 (1 << (32 - i))) 
  
    return abs(res) 
  
# Driver Code 
a = 1
print (maximize(a)) 
  
# This code is contributed by  
# Manish Shaw(manishshaw1) 

