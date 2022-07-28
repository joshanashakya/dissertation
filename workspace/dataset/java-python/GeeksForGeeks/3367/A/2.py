

# Python3 implementation of the approach 
  
# Function to return the string after 
# reversing the alternate k characters 
def revAlternateK(s, k, Len): 
    i = 0
      
    while(i < len(s)): 
  
        # If there are less than k characters 
        # starting from the current position 
        if (i + k > Len): 
            break
  
        # Reverse first k characters 
        ss = s[i:i + k] 
        s = s[:i]+ss[::-1]+s[i + k:] 
          
        # Skip the next k characters 
        i += 2 * k 
      
    return s; 
  
  
# Driver code 
  
s = "geeksforgeeks"
Len = len(s) 
k = 3
print(revAlternateK(s, k, Len)) 
  
# This code is contributed by mohit kumar 

