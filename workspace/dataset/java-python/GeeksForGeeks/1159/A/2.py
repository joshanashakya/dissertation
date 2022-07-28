

# Python 3 implementation of the approach 
  
# Function to check if a character is vowel 
def isVowel(c): 
    c = c.lower() 
    if (c == 'a' or c == 'e' or 
        c == 'i' or c == 'o' or c == 'u'): 
        return True
    return False
  
# Function to return first X vowels 
def firstXvowels(s, x): 
      
    # String to store first X vowels 
    result = "" 
    for i in range(0, len(s), 1): 
          
        # If s[i] is a vowel then 
        # append it to the result 
        if (isVowel(s[i])): 
            result += s[i] 
  
        # If the desired length is reached 
        if (len(result) == x): 
            return result 
      
    # If total vowels are < X 
    return "-1"
  
# Driver code 
if __name__ == '__main__': 
    str = "GeeksForGeeks"
    x = 3
  
    print(firstXvowels(str, x)) 
  
# This code is implemented by 
# Surendra_Gangwar 

