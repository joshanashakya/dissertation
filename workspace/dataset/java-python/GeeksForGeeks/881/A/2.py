

# Program to find the 
# parity of a given number 
  
# Function to find the parity 
def findParity(x): 
    y = x ^ (x >> 1); 
    y = y ^ (y >> 2); 
    y = y ^ (y >> 4); 
    y = y ^ (y >> 8); 
    y = y ^ (y >> 16); 
  
    # Rightmost bit of y holds  
    # the parity value if (y&1) 
    # is 1 then parity is odd 
    # else even 
    if (y & 1): 
        return 1; 
    return 0; 
  
# Driver code 
if(findParity(9) == 0): 
    print("Even Parity"); 
else: 
    print("Odd Parity\n"); 
  
if(findParity(13) == 0): 
    print("Even Parity"); 
else: 
    print("Odd Parity"); 
      
# This code is contributed by mits 

