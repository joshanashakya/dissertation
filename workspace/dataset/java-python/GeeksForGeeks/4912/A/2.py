

# Python3 implementation of the approach  
from math import gcd 
  
# function to modify the string  
def convert_str(s, k):  
      
    modified_string = "" 
    for i in range(0, len(s)):  
        ascii = ord(s[i])  
  
        # check if the character is  
        # lowercase and co-prime with k  
        if (ascii >= ord('a') and
            ascii <= ord('z') and
            gcd(ascii, k) == 1):  
  
            # change the character to upper-case  
            modified_string += chr(ascii - 32) 
              
        else: 
            modified_string += s[i] 
  
    print(modified_string)  
  
# Driver code  
if __name__ == "__main__": 
  
    s = "geeksforgeeks"
    k = 4
  
    convert_str(s, k)  
  
# This code is contributed by Rituraj Jain 

