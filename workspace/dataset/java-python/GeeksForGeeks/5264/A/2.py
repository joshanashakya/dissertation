

# Python3 implementation of the approach 
  
# Function to return the lexicographically 
# smallest palindrome that can be made from 
# the given string after replacing 
# the required characters 
def makePalindrome(str1): 
    i = 0
    j = len(str1) - 1
    str1 = list(str1) 
    while (i <= j): 
          
        # If characters are missing  
        # at both the positions 
        # then substitute it with 'a' 
        if (str1[i] == '*' and str1[j] == '*'): 
            str1[i] = 'a'
            str1[j] = 'a'
  
        # If only str1[j] = '*' then update it 
        # with the value at str1[i] 
        elif (str1[j] == '*'): 
            str1[j] = str1[i] 
  
        # If only str1[i] = '*' then update it 
        # with the value at str1[j] 
        elif (str1[i] == '*'): 
            str1[i] = str1[j] 
  
        # If characters at both positions 
        # are not equal and != '*' then the string 
        # cannot be made palindrome 
        elif (str1[i] != str1[j]): 
            str1 = '' . join(str1) 
            return "-1"
  
        i += 1
        j -= 1
  
    # Return the required palindrome 
    str1 = '' . join(str1) 
    return str1 
  
# Driver code 
if __name__ == '__main__': 
    str1 = "na*an"
  
    print(makePalindrome(str1)) 
      
# This code is contributed by 
# Surendra_Gangwar 

