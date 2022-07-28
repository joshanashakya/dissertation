

# Python implementation of the approach 
  
# Function that returns true if 
# str[i...j] is a palindrome 
def isPalindrome(str, i, j): 
    while (i < j): 
        if (str[i] != str[j]): 
            return False; 
        i+=1; 
        j-=1; 
    return True; 
  
  
# Function to return the length of the 
# longest palindromic sub-string such that 
# it starts and ends with the character ch 
def maxLenPalindrome(str, n, ch): 
    maxLen = 0; 
  
    for i in range(n): 
  
        # If current character is 
        # a valid starting index 
        if (str[i] == ch): 
  
            # Instead of finding the ending index from 
            # the beginning, find the index from the end 
            # This is because if the current sub-string 
            # is a palindrome then there is no need to check 
            # the sub-strings of smaller length and we can 
            # skip to the next iteration of the outer loop 
            for j in range(n-1,i+1,-1): 
                # If current character is 
                # a valid ending index 
                if (str[j] == ch): 
  
                    # If str[i...j] is a palindrome then update 
                    # the length of the maximum palindrome so far 
                    if (isPalindrome(str, i, j)): 
                        maxLen = max(maxLen, j - i + 1); 
                        break; 
  
    return maxLen; 
  
# Driver code 
str = "lapqooqpqpl"; 
n = len(str); 
ch = 'p'; 
  
print(maxLenPalindrome(str, n, ch)); 
      
# This code is contributed by 29AjayKumar 

