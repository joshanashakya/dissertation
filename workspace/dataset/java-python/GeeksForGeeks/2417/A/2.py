

# Python 3 implementation of the approach 
  
# Function that returns true if  
# str is a palindrome 
def isPalindrome(s): 
  
    l = len(s) 
    for i in range(l // 2): 
        if (s[i] != s[l - 1 - i]): 
            return False
    return True
  
# Function that returns true if the  
# generated string is a palindrome 
def createStringAndCheckPalindrome(N): 
      
    # sub contains N as a string 
    sub = "" + chr(N) 
    res_str = "" 
  
    sum = 0
  
    # Calculate the sum of the digits 
    while (N > 0) : 
        digit = N % 10
        sum += digit 
        N = N // 10
  
    # Repeat the substring until the length 
    # of the resultant string < sum 
    while (len(res_str) < sum): 
        res_str += sub 
  
    # If length of the resultant string exceeded  
    # sum then take substring from 0 to sum - 1 
    if (len(res_str) > sum): 
        res_str = res_str[0: sum] 
  
    # If the generated string is a palindrome 
    if (isPalindrome(res_str)): 
        return True
  
    return False
  
# Driver code 
if __name__ == "__main__": 
      
    N = 10101
    if (createStringAndCheckPalindrome(N)): 
        print("Yes") 
    else: 
        print("No") 
  
# This code is contributed by ita_c 

