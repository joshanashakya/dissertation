

# Python implementation of the approach 
  
# Function to check if  
# the string is palindrome 
def checkPalindrome(s): 
    for i in range(len(s)): 
        if(s[i] != s[len(s)-i-1]): 
            return False
    return True
  
# Function that checks whether  
# all the palindromic  
# sub-strings are of odd length. 
def CheckOdd(s): 
    n = len(s) 
    for i in range(n): 
  
        # Creating each substring 
        x = "" 
        for j in range(i, n): 
            x += s[j] 
            # If the sub-string is  
            # of even length and  
            # is a palindrome then,  
            # we return False 
            if(len(x)% 2 == 0 
                  and checkPalindrome(x) == True): 
                return False
    return True
  
# Driver code 
s = "geeksforgeeks"
if(CheckOdd(s)): 
    print("YES") 
else: 
    print("NO") 

