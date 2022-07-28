

# Python3 program to check if a string can  
# be converted to other string by replacing 
# vowels and consonants 
  
# Function to check if the character 
# is vowel or not 
def isVowel(c): 
  
    if (c == 'a' or c == 'e' or
        c == 'i' or c == 'o' or c == 'u'): 
        return True
  
    return False
  
# Function that checks if a string can  
# be converted to another string 
def checkPossibility(s1, s2): 
  
    # Find length of string 
    l1 = len(s1) 
    l2 = len(s2) 
  
    # If length is not same 
    if (l1 != l2): 
        return False
  
    # Iterate for every character 
    for i in range(l1):  
          
        # If both vowel 
        if (isVowel(s1[i]) and isVowel(s2[i])): 
            continue
  
        # Both are consonants 
        elif ((isVowel(s1[i])) == False and 
              (isVowel(s2[i]) == False)): 
            continue
        else: 
            return False
      
    return True
  
# Driver Code 
S1, S2 = "abcgle", "ezggli"
if (checkPossibility(S1, S2)): 
    print("Yes") 
else: 
    print("No") 
  
# This code is contributed by Mohit Kumar 

