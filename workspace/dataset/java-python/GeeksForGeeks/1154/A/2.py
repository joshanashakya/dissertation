

# Python3 program for printing String 
# with duplicate vowels 
  
  
# Function to check for the Vowel 
def isVowel(ch): 
    ch = ch.upper() 
    if (ch == 'A' or ch == 'E' or 
        ch == 'I' or ch == 'O' or 
        ch == 'U'): 
        return True
    else: 
        return False
  
# Function to get the resultant String 
# with vowels duplicated 
def duplicateVowels(S): 
    t = len(S) 
  
    # Another to store 
    # the resultant String 
    res = "" 
  
    # Loop to check for each character 
    for i in range(t): 
        if (isVowel(S[i])): 
            res += S[i] 
        res += S[i] 
  
    return res 
  
# Driver Code 
S = "helloworld"
  
# Print the original String 
print("Original String: ", S) 
  
res = duplicateVowels(S) 
  
# Print the resultant String 
print("String with Vowels duplicated: ", res) 
  
# This code is contributed by Mohit Kumar 

