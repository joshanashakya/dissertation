

# Python Program to Encrypt string with  
# product of number of vowels and  
# consonants in every substring of size k 
  
# isVowel() is a function that returns  
# true for a vowel and false otherwise. 
def isVowel(c): 
    return (c == 'a' or c == 'e' or 
            c == 'i' or c == 'o' or 
            c == 'u') 
  
# function to Encrypt the dtring 
def encryptString(s, n, k): 
    countVowels = 0
    countConsonants = 0
    ans = "" 
  
    # for each substring 
    for l in range(n - k + 1): 
        countVowels = 0
        countConsonants = 0
  
        # substring of size k 
        for r in range(l, l + k): 
  
            # counting number of vowels  
            # and consonants 
            if (isVowel(s[r]) == True): 
                countVowels += 1
            else: 
                countConsonants += 1
                  
        # append product to answer 
        ans += (str)(countVowels * 
                     countConsonants) 
    return ans 
  
# Driver Code 
if __name__ == '__main__': 
    s = "hello"
    n = len(s) 
    k = 2
    print(encryptString(s, n, k)) 
  
# This code is contributed  
# by PrinciRaj1992 

