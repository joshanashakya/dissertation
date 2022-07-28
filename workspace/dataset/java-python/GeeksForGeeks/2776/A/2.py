

# Python 3 Program to Encrypt string with  
# product of number of vowels and consonants  
# in substring of size k 
  
# isVowel() is a function that returns true 
# for a vowel and false otherwise. 
def isVowel(c): 
    return (c == 'a' or c == 'e' or 
            c == 'i' or c == 'o' or c == 'u') 
  
# function to Encrypt the string 
def encryptString(s, n, k): 
      
    # cv to count vowel 
    # cc to count consonants 
    cv = [0 for i in range(n)] 
    cc = [0 for i in range(n)] 
  
    if (isVowel(s[0])): 
        cv[0] = 1
    else: 
        cc[0] = 1
  
    # Counting prefix count of vowel 
    # and prefix count of consonants 
    for i in range(1,n): 
        cv[i] = cv[i - 1] + isVowel(s[i]) 
        cc[i] = cc[i - 1] + (isVowel(s[i]) == False) 
  
    ans = "" 
    prod = 0
  
    prod = cc[k - 1] * cv[k - 1] 
    ans += str(prod) 
  
    # generating the encrypted string. 
    for i in range(k, len(s)): 
        prod = ((cc[i] - cc[i - k]) * 
                (cv[i] - cv[i - k])) 
        ans += str(prod) 
  
    return ans 
  
# Driver Code 
if __name__ == '__main__': 
    s = "hello"
    n = len(s) 
    k = 2
  
    print(encryptString(s, n, k)) 
      
# This code is contributed by 
# Surendra_Gangwar 

