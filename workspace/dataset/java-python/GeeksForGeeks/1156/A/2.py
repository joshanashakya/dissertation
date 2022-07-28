

# Recursive Python 3 program to count the  
# total number of vowels using recursion 
  
# Function to check the Vowel 
def isVowel(ch): 
    return ch.upper() in ['A', 'E', 'I', 'O', 'U'] 
  
# to count total number of 
# vowel from 0 to n 
def countVovels(str, n): 
    if (n == 1): 
        return isVowel(str[n - 1]); 
  
    return (countVovels(str, n - 1) +
                isVowel(str[n - 1])); 
  
# Driver Code 
  
# string object 
str = "abc de"; 
  
# Total numbers of Vowel 
print(countVovels(str, len(str))) 
  
# This code is contributed  
# by Akanksha Rai 

