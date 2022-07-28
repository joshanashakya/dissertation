

# Python3 implementation of the approach  
  
# Function that returns true if the word is found  
def isWordPresent(sentence, word) : 
      
    # To convert the word in uppercase  
    word = word.upper() 
  
    # To convert the complete sentence in uppercase  
    sentence = sentence.upper() 
  
    # Both strings are converted to the same case,  
    # so that the search is not case-sensitive  
  
    # To break the sentence in words  
    s = sentence.split();  
  
    for temp in s : 
  
        # Compare the current word  
        # with the word to be searched  
        if (temp == word) : 
            return True;  
  
    return False;  
  
# Driver code  
if __name__ == "__main__" :  
  
    s = "Geeks for Geeks";  
    word = "geeks";  
  
    if (isWordPresent(s, word)) : 
        print("Yes");  
    else : 
        print("No");  
  
# This code is contributed by AnkitRai01 

