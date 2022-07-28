

# Python3 program to remove all the 
# characters other then alphabets 
  
# function to remove characters and 
# pr new string 
def removeSpecialCharacter(s): 
  
    i = 0
  
    while i < len(s): 
  
        # Finding the character whose 
        # ASCII value fall under this 
        # range 
        if (ord(s[i]) < ord('A') or 
            ord(s[i]) > ord('Z') and 
            ord(s[i]) < ord('a') or 
            ord(s[i]) > ord('z')): 
                  
            # erase function to erase 
            # the character 
            del s[i] 
            i -= 1
        i += 1
  
    print("".join(s)) 
  
# Driver Code 
if __name__ == '__main__': 
    s = "$Gee*k;s..fo, r'Ge^eks?"
    s = [i for i in s] 
    removeSpecialCharacter(s) 
  
# This code is contributed by Mohit Kumar 

