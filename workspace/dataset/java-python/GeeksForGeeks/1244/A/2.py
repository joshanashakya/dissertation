

# Python3 implementation of the approach 
CHARS = "0123456789ABCDEF";  
DIGITS = 16;  
  
# Function that returns true  
# if s is divisible by m  
def isDivisible(s, m) : 
  
    # Map to map characters to real value 
    mp = dict.fromkeys(CHARS, 0);  
  
    for i in range( DIGITS) : 
        mp[CHARS[i]] = i;  
  
    # To store the remainder at any stage  
    r = 0;  
  
    # Find the remainder  
    for i in range(len(s)) : 
        r = (r * 16 + mp[s[i]]) % m;  
  
    # Check the value of remainder  
    if (not r) : 
        return True;  
          
    return False;  
  
# Driver code  
if __name__ == "__main__" :  
      
    s = "10";  
    m = 3;  
  
    if (isDivisible(s, m)) : 
        print("Yes");  
    else : 
        print("No");  
  
# This code is contributed by AnkitRai01 

