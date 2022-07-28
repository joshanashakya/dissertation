

# Python3 implementation of the approach 
  
# Function to return the value of nCk 
def binomialCoeff(n, k): 
    if (k == 0 or k == n): 
        return 1
  
    return binomialCoeff(n - 1, k - 1) + \ 
           binomialCoeff(n - 1, k) 
  
# Function to return the factorial of n 
def fact(n): 
    if (n >= 1): 
        return n * fact(n - 1) 
    else: 
        return 1
  
# Function that returns true if ch is a vowel 
def isVowel(ch): 
  
    if (ch == 'a' or ch == 'e' or 
        ch == 'i' or ch == 'o' or ch == 'u'): 
        return True
  
    return False
  
# Function to return the number of words possible 
def countWords(s, p, q): 
  
    # To store the count of vowels and 
    # consonanats in the given string 
    countc = 0
    countv = 0
    for i in range(len(s)): 
  
        # If current character is a vowel 
        if (isVowel(s[i])): 
            countv += 1
        else: 
            countc += 1
  
    # Find the total possible words 
    a = binomialCoeff(countc, p) 
    b = binomialCoeff(countv, q) 
    c = fact(p + q) 
    ans = (a * b) * c 
    return ans 
  
# Driver code 
s = "crackathon"
p = 4
q = 3
  
print(countWords(s, p, q)) 
  
# This code is contributed by Mohit Kumar 

