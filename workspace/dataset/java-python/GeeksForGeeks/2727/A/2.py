

# Python3 implementation of the approach 
  
# Function that returns true if s is palindrome 
def isPalindrome(s): 
    i = 0; 
    j = len(s) - 1; 
  
    while (i < j): 
        if (s[i] is not s[j]): 
            return False; 
        i += 1; 
        j -= 1; 
  
    return True; 
  
# Function to return the required index 
def getIndex(S1, S2, n): 
  
    S = ""; 
  
    for i in range(n): 
  
        # Copy the ith character in S 
        S = S + S1[i]; 
        Temp = ""; 
  
        # Copy all the character of string s2 in Temp 
        for j in range(i + 1, n): 
            Temp += S2[j]; 
  
        # Check whether the string is palindrome 
        if (isPalindrome(S + Temp)): 
            return i; 
  
    return -1; 
  
# Driver code 
S1 = "abcdf"; S2 = "sfgba"; 
n = len(S1); 
  
print(getIndex(S1, S2, n)); 
  
# This code is contributed by Rajput-Ji 

