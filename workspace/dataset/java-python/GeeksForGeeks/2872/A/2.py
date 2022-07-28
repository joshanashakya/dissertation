

# Python3 implementation of the approach  
  
# Function to print the ordering of words  
def reArrange(words, n): 
    # Creating list of words and assigning  
    # them index numbers 
    mp = {} 
    for i in range(n): 
        mp[words[i]] = i + 1
  
    # Sort the list of words 
    # lexicographically 
    words.sort(); 
  
    # Print the ordering 
    for i in range(n): 
        print(mp[words[i]], end = " ")  
  
# Driver Code  
  
words = [ "live", "place", "travel", "word", "sky" ]  
n = len(words)  
reArrange(words, n);  
  
# This code is contributed by  
# Rajnis09  

