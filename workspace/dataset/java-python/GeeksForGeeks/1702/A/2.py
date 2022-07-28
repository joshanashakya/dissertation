

# Assuming that integer 
# takes 4 bytes, there  
# can be maximum 10  
# digits in a integer 
MAX = 11; 
  
def isMultipleof5(n): 
    s = str(n); 
    l = len(s); 
      
    # Check the last  
    # character of string 
    if (s[l - 1] == '5' or
        s[l - 1] == '0'): 
        return True; 
    return False; 
  
# Driver Code 
n = 19; 
if (isMultipleof5(n) == True ): 
    print(n, "is multiple of 5"); 
else: 
    print(n, "is not a multiple of 5"); 
  
# This code is contributed by mits 

