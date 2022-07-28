

# Python3 implementation of the approach 
  
# Function that returns true if the word is found 
def isWordPresent(sentence, word): 
      
    # To break the sentence in words 
    s = sentence.split(" ") 
  
    for i in s: 
  
        # Comparing the current word 
        # with the word to be searched 
        if (i == word): 
            return True
    return False
  
# Driver code 
s = "Geeks for Geeks"
word = "Geeks"
  
if (isWordPresent(s, word)): 
    print("Yes") 
else: 
    print("No") 
  
# This code is contributed by mohit kumar 29 

