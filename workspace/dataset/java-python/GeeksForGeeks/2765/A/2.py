

# Python3 code to check if a two character string can   
# be made using given strings  
  
# Function to check if str can be made using  
# given words  
def makeAndCheckString(words, str): 
    n = len(words) 
    first = second = False
  
    for i in range(n): 
        # If str itself is present 
        if words[i]==str: 
            return True
  
        # Match first character of str  
        # with second of word and vice versa  
        if str[0] == words[i][1]: 
            first = True
        if str[1] == words[i][0]: 
            second = True
  
        # If both characters found. 
        if first and second: 
            return True
      
    return False
      
# Driver Code  
str = 'ya'
words = ['ah', 'oy', 'to', 'ha'] 
if makeAndCheckString(words, str): 
    print('YES') 
else: 
    print('NO') 
  
# This code is contributed   
# by SamyuktaSHegde  

