

# Python3 implementation of the approach  
  
# Function to print the uncommon  
# characters in the given string  
# in sorted order  
def printUncommon(str1, str2) :  
  
    a1 = 0; a2 = 0;  
      
    for i in range(len(str1)) : 
  
        # Converting character to ASCII code  
        ch = ord(str1[i]) - ord('a');  
  
        # Bit operation  
        a1 = a1 | (1 << ch);  
      
    for i in range(len(str2)) :  
  
        # Converting character to ASCII code  
        ch = ord(str2[i]) - ord('a');  
  
        # Bit operation  
        a2 = a2 | (1 << ch);  
  
    # XOR operation leaves only uncommon  
    # characters in the ans variable  
    ans = a1 ^ a2;  
  
    i = 0;  
    while (i < 26) : 
        if (ans % 2 == 1) : 
            print(chr(ord('a') + i),end="");  
          
        ans = ans // 2;  
        i += 1;  
  
# Driver code  
if __name__ == "__main__" :  
  
    str1 = "geeksforgeeks";  
    str2 = "geeksquiz";  
  
    printUncommon(str1, str2);  
      
    # This code is contributed by AnkitRai01 

