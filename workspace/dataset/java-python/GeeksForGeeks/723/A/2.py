

# Python3 implementation of the approach 
  
# Function that returns true 
# if acter ch is a vowel 
def isVowel(ch): 
    if ch in ['i', 'a', 'e', 'o', 'u']: 
        return True
    else: 
        return False
  
# Compares two integers according 
# to their digit sum 
def isSatisfied(st, n): 
      
    # Check if there are two 
    # consecutive consonants 
    for i in range(1, n): 
        if (isVowel(st[i]) == False and 
            isVowel(st[i - 1]) == False): 
            return False
              
    # Check if there is any vowel 
    # surrounded by two consonants 
    for i in range(1, n - 1): 
        if (isVowel(st[i]) and 
            isVowel(st[i - 1]) == False and 
            isVowel(st[i + 1]) == False ): 
            return False
    return True
  
# Driver code 
st = "acaba"
n = len(st) 
  
if (isSatisfied(st, n)): 
    print("Yes") 
else: 
    print("No") 
  
# This code is contributed by Mohit Kumar 

