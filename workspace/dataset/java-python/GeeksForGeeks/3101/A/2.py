

# Python3 implementation of the approach 
  
# Function to return length 
# of the resulatant number 
def numLen(K): 
      
    # If K is a multiple of 2 or 5 
    if(K % 2 == 0 or K % 5 == 0): 
        return -1
  
    number = 0
  
    len = 1
  
    for len in range (1, K + 1): 
          
        # Instead of generating all possible numbers 
        # 1, 11, 111, 111, ..., K 1's 
        # Take remainder with K 
        number = ( number * 10 + 1 ) % K 
      
        # If number is divisible by k 
        # then remainder will be 0 
        if number == 0: 
            return len
  
    return -1
  
# Driver code 
K = 7
print(numLen(K)) 

