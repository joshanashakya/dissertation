

# Python3 program to check if any repeated 
# subsequence exists in the String 
MAX_CHAR = 256
  
# A function to check  
# if a String Str is palindrome 
def isPalindrome(Str, l, h): 
      
    # l and h are leftmost and rightmost corners of Str 
    # Keep comparing characters while they are same 
    while (h > l): 
        if (Str[l] != Str[h]): 
            l += 1
            h -= 1
            return False
  
    return True
  
# The main function that checks if repeated 
# subsequence exists in the String 
def check(Str): 
      
    # Find length of input String 
    n = len(Str) 
  
    # Create an array to store all characters  
    # and their frequencies in Str[] 
    freq = [0 for i in range(MAX_CHAR)] 
  
    # Traverse the input String and  
    # store frequencies of all characters 
    # in freq[] array. 
    for i in range(n): 
  
        freq[ord(Str[i])] += 1
  
        # If the character count is more than 2 
        # we found a repetition 
        if (freq[ord(Str[i])] > 2): 
            return True
  
    # In-place remove non-repeating characters 
    # from the String 
    k = 0
    for i in range(n): 
        if (freq[ord(Str[i])] > 1): 
            Str[k] = Str[i] 
            k += 1
    Str[k] = '\0'
  
    # check if the resultant String is palindrome 
    if (isPalindrome(Str, 0, k - 1)): 
          
        # special case - if length is odd 
        # return true if the middle characer is 
        # same as previous one 
        if (k & 1): 
            return Str[k // 2] == Str[k // 2 - 1] 
  
        # return false if String is a palindrome 
        return False
  
    # return true if String is not a palindrome 
    return True
  
# Driver code 
S = "ABCABD"
Str = [i for i in S] 
  
if (check(Str)): 
    print("Repeated Subsequence Exists") 
else: 
    print("Repeated Subsequence Doesn't Exists") 
  
# This code is contributed by Mohit Kumar 

