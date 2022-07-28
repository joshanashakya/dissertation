

# Python3 implementation of the approach 
MAX = 26
  
# Function that returns true if both 
# the strings can be made equal 
# with the given operation 
def canBeMadeEqual(str1, str2): 
    len1 = len(str1) 
    len2 = len(str2) 
  
    # Lengths of both the strings 
    # have to be equal 
    if (len1 == len2): 
  
        # To store the frequency of the 
        # characters of str1 
        freq = [0 for i in range(MAX)] 
        for i in range(len1): 
            freq[ord(str1[i]) - ord('a')] += 1
  
        # For every character of str2 
        for i in range(len2): 
  
            # If current character of str2 
            # also appears in str1 
            if (freq[ord(str2[i]) - ord('a')] > 0): 
                return True
  
    return False
  
# Driver code 
str1 = "abc"
str2 = "defa"
  
if (canBeMadeEqual(str1, str2)): 
    print("Yes") 
else: 
    print("No") 
  
# This code is contributed by Mohit Kumar 

