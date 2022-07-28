

# Python3 program for Arrangement of words 
# without changing the relative position of  
# vowel and consonants  
  
# this function return n! 
def factorial(n): 
    res = 1
    for i in range(1, n + 1): 
        res = res * i 
    return res 
  
# this will return total number of ways  
def count(word): 
      
    # freq maintains frequency 
    # of each character in word  
    freq = [0 for i in range(30)] 
    vowel = 0
    consonant = 0
    for i in range(len(word)): 
        freq[ord(word[i]) -65 ] += 1
          
        # check character is vowel or not  
        if(word[i] == 'A'or word[i] == 'E' or 
           word[i] == 'I' or word[i] == 'O'or 
           word[i] == 'U'): 
            vowel += 1
  
        # the characters that are not  
        # vowel must be consonant 
        else: 
            consonant += 1
  
    # number of ways to arrange vowel 
    vowelArrange = factorial(vowel) 
    vowelArrange //= factorial(freq[0]) 
    vowelArrange //= factorial(freq[4]) 
    vowelArrange //= factorial(freq[8]) 
    vowelArrange //= factorial(freq[14]) 
    vowelArrange //= factorial(freq[20]) 
  
    consonantArrange = factorial(consonant) 
    for i in range(26): 
        if(i != 0 and i != 4 and i != 8 and 
           i != 14 and i != 20): 
            consonantArrange//= factorial(freq[i]) 
  
    # multiply both as these are independent 
    total = vowelArrange * consonantArrange 
    return total 
  
# Driver code 
  
# string contains only 
# capital letters 
word = "COMPUTER"
  
# this will contain ans 
ans = count(word) 
print(ans) 
  
# This code is contributed  
# by sahilshelangia 

