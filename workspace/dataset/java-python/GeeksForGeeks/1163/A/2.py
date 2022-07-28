

# Python3 implementation of the approach 
  
# Function that return true 
# if character ch is a vowel 
def isVowel(ch): 
    if ch in ['a', 'e', 'i', 'o', 'u']: 
        return True
    else:  
        return False
  
# Function to return the count of adjacent 
# vowel pairs in the given string 
def vowelPairs(s, n): 
  
    cnt = 0
    for i in range(n - 1): 
  
        # If current character and the 
        # character after it are both vowels 
        if (isVowel(s[i]) and
            isVowel(s[i + 1])): 
            cnt += 1
  
    return cnt 
  
# Driver code 
s = "abaebio"
n = len(s) 
print(vowelPairs(s, n)) 
  
# This code is contributed 
# by mohit kumar 

