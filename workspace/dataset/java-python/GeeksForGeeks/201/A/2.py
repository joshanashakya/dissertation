

# Python3 program to find the longest  
# palindrome in a string formed by  
# concatenating its prefix and suffix 
   
# Function to check whether 
# the string is a palindrome 
def isPalindrome(r): 
  
    p = r 
   
    # Reverse the string to 
    # compare with the 
    # original string 
    p = "".join(reversed(p)) 
   
    # Check if both are same 
    return (r == p) 
   
# Function to find the longest 
# palindrome in a string formed by 
# concatenating its prefix and suffix 
def PrefixSuffixPalindrome(st): 
  
    # Length of the string 
    n = len(st) 
    length = 0
   
    # Finding the length upto which 
    # the suffix and prefix forms a 
    # palindrome together 
    for i in range( n // 2): 
        if (st[i] != st[n - i - 1]): 
            length = i 
            break
   
    # Check whether the string 
    # has prefix and suffix substrings 
    # which are palindromes. 
    prefix = "" 
    suffix = "" 
    midPal = "" 
   
    # Removing the suffix and prefix 
    # substrings which already forms 
    # a palindrome and storing them 
    # in separate strings 
    prefix = st[:length] 
    suffix = st[n - length:] 
    st = st[length: n - 2 * length+length] 
  
    # Check all prefix substrings 
    # in the remaining string str 
    for i in range(1,len(st)+1): 
        y = st[0: i] 
   
        # Check if the prefix substring 
        # is a palindrome 
        if (isPalindrome(y)): 
   
            # If the prefix substring 
            # is a palindrome then check 
            # if it is of maximum length 
            # so far 
            if (len(midPal) < len(y)): 
                midPal = y 
   
    # Check all the suffix substrings 
    # in the remaining string str 
    for i in range(1,len(st)+1): 
        y = st[len(st)-i] 
   
        # Check if the suffix substring 
        # is a palindrome 
        if (isPalindrome(y)): 
   
            # If the suffix substring 
            # is a palindrome then check 
            # if it is of maximum length 
            # so far 
            if (len(midPal) < len(y)): 
                midPal = y 
   
    # Combining all the thee parts 
    # of the answer 
    answer = prefix + midPal + suffix 
   
    return answer 
   
# Driver code 
if __name__ == "__main__": 
      
    st = "abcdfdcecba"; 
   
    print(PrefixSuffixPalindrome(st)) 
   
# This code is contributed by chitranayal 
     

