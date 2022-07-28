

# Python 3 program to remove all Vowels 
# in between two consonants from the string 
  
# Function to check if the character 
# x is a vowel or not 
def isVowel(x): 
    if (x == 'a' or x == 'e' or x == 'i' or 
                    x == 'o' or x == 'u'): 
        return True
    else: 
        return False
  
# Returns the updated string formed after 
# removing all the Sandwiched Vowels from  
# the given string 
def updateSandwichedVowels(a): 
    n = len(a) 
  
    # string to store the Updated String after 
    # removing the Sandwiched Vowels 
    updatedString = "" 
  
    # traverse the string from left to right 
    for i in range(0, n, 1): 
          
        # if the current character is the first  
        # or the last character of the string  
        # then, this needs to be appended to  
        # the updatedString, since the corner  
        # alphabet irrespective of it being a vowel 
        # or a consonant, is never 'Sandwiched' 
        if (i == 0 or i == n - 1): 
            updatedString += a[i] 
            continue
          
        # Check if the current character of the  
        # string is a vowel and both the previous  
        # and the next characters are consonants,  
        # if so then this is a sandwiched vowel,  
        # thus is ignored and not appended to the  
        # updated string 
        if (isVowel(a[i]) == True and 
            isVowel(a[i - 1]) == False and 
            isVowel(a[i + 1]) == False): 
            continue
  
        # if this character is not a sandwiched  
        # Vowel append it to the updated String 
        updatedString += a[i] 
  
    return updatedString 
  
# Driver Code 
if __name__ == '__main__': 
    str = "geeksforgeeks"
  
    # Remove all the Sandwitched Vowels 
    updatedString = updateSandwichedVowels(str) 
  
    print(updatedString) 
      
# This code is contributed by  
# Surendra_Gangwar     

