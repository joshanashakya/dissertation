

# Python3 program to check if a sentence 
# can be formed from a given set of words. 
  
# Function to check if the word 
# is in the dictionary or not 
def match_words(dictionary, sentence, n, m): 
      
    # map to store all words in 
    # dictionary with their count 
    mp = dict() 
  
    # adding all words in map 
    for i in range(n): 
        mp[dictionary[i]] = mp.get(dictionary[i], 0) + 1
  
    # search in map for all 
    # words in the sentence 
    for i in range(m): 
        if (mp[sentence[i]]): 
            mp[sentence[i]] -= 1
        else: 
            return False
  
    # all words of sentence are present 
    return True
  
# Driver Code 
dictionary = ["find", "a", "geeks", "all", "for", 
              "on", "geeks", "answers", "inter"] 
  
n = len(dictionary) 
  
sentence = ["find", "all", "answers", "on",  
            "geeks", "for", "geeks"] 
  
m = len(sentence) 
  
# Calling function to check if words are 
# present in the dictionary or not 
if (match_words(dictionary, sentence, n, m)): 
    print("YES") 
else: 
    print("NO") 
  
# This code is contributed by mohit kumar 

