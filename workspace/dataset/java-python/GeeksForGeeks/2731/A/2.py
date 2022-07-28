

# Python3 implementation of the approach  
  
# Function to check whether  
# the string is a palindrome  
def isPalindrome(r):  
      
    # Reverse the string and assign  
    # it to new variable for comparison 
    p = r[::-1] 
  
    # check if both are same  
    return r == p  
  
# Function to check whether the string  
# has prefix and suffix substrings  
# of length greater than 1  
# which are palindromes.  
def CheckStr(s):  
  
    l = len(s)  
  
    # check all prefix substrings  
    i = 0
    for i in range(2, l + 1):  
  
        # check if the prefix substring  
        # is a palindrome  
        if isPalindrome(s[0:i]) == True:  
            break
      
    # If we did not find any palindrome  
    # prefix of length greater than 1.  
    if i == (l + 1):  
        return False
  
    # check all suffix substrings,  
    # as the string is reversed now  
    for i in range(2, l + 1): 
  
        # check if the suffix substring  
        # is a palindrome  
        if isPalindrome(s[l - i : l]) == True:  
            return True
      
    # If we did not find a suffix  
    return False    
  
# Driver code  
if __name__ == "__main__": 
  
    s = "abccbarfgdbd"
      
    if CheckStr(s) == True:  
        print("YES")  
    else: 
        print("NO")  
      
# This code is contributed by Rituraj Jain 

