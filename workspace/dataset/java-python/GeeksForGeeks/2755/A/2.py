

# Python 3 program to check if there is  
# a substring palindrome of even length. 
  
# function to check if two consecutive 
# same characters are present 
def check(s): 
  
    for i in range (0, len(s)): 
        if (s[i] == s[i + 1]): 
            return True
              
    return False
  
# Driver Code 
s = "xzyyz"
if(check(s)): 
    print("YES") 
else: 
    print("NO") 
      
# This code is contributed 
# by iAyushRAJ 

