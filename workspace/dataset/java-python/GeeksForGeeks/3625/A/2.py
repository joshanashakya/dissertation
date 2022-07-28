

# Python3 program to capitalise the first  
# and last character of each word in a string.  
def FirstAndLast(string) :  
      
    # Create an equivalent char array  
    # of given string  
    ch = list(string);  
      
    i = 0 ; 
    while i < len(ch): 
  
        # k stores index of first character  
        # and i is going to store index of last  
        # character.  
        k = i;  
          
        while (i < len(ch) and ch[i] != ' ') : 
            i += 1;  
  
        # Check if the character is a small letter  
        # If yes, then Capitalise  
        if (ord(ch[k]) >= 97 and 
            ord(ch[k]) <= 122 ): 
            ch[k] = chr(ord(ch[k]) - 32); 
        else : 
            ch[k] = ch[k] 
              
        if (ord(ch[i - 1]) >= 90 and 
            ord(ch[i - 1]) <= 122 ): 
            ch[i - 1] = chr(ord(ch[i - 1]) - 32); 
        else : 
            ch[i - 1] = ch[i - 1] 
              
        i += 1
          
    return "" . join(ch);  
      
# Driver code  
if __name__ == "__main__" : 
      
    string = "Geeks for Geeks";  
      
    print(string);  
    print(FirstAndLast(string));  
      
# This code is contributed by Ryuga 

