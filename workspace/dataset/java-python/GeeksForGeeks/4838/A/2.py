

# Python 3 code for finding the  
# longest length integer 
  
def longestInteger(s, length): 
    count = 0
    maximum = 0
    pos = -1
    l = 0
      
    # Traverse the string 
    for i in range(length): 
          
        # Store the previous position 
        # and previous length of  
        # the digits encountered. 
        pre_pos = pos 
        pre_len = l 
        count = 0
        l = 0
  
        # If first digit occurs, 
        # store its position in pos 
        if (s[i].isdecimal()): 
            pos = i 
  
        # Traverse the string  
        # till a character occurs. 
        while (s[i].isdecimal()): 
            count += 1
            i += 1
            l += 1
  
        # Check if the length of  
        # the string is greater  
        # than the previous ones 
        # or not. 
        if (count > maximum): 
            maximum = count 
          
        else: 
            pos = pre_pos 
            l = pre_len 
  
    return (s[pos: pos + l]) 
  
# Driver code 
s = "geeks100for1234geeks"
length = len(s) 
print(longestInteger(s, length)) 
  
# This code is contributed  
# by ChitraNayal 

