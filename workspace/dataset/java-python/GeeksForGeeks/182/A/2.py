

# Python 3 program to find the longest 
# subsequence containing only vowels 
  
# Function to check whether 
# a character is vowel or not 
def isVowel(x): 
  
    # Returns true if x is vowel 
    return (x == 'a' or x == 'e'or x == 'i' or x == 'o' or x == 'u') 
      
# Function to find the longest subsequence 
# which contain all vowels 
def longestVowelSubsequence(str): 
      
    answer = "" 
  
    # Length of the string 
    n = len(str) 
  
    # Iterating through the string 
    for i in range(n): 
  
        # Checking if the character is a 
        # vowel or not 
        if (isVowel(str[i])): 
              
            # If it is a vowel, then add it 
            # to the final string 
            answer += str[i] 
  
    return answer 
  
# Driver code 
str = "geeksforgeeks"
print(longestVowelSubsequence(str)) 
  
# This code is contributed by apurva raj 

