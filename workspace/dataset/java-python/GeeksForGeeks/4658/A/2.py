

# Python3 implementation of the approach 
  
# Function to reverse the given word except 
# the first and the last character 
def reverseWord(Str): 
      
    # len = len(Str) 
  
    # Pointer to the second character 
    # of the String 
    i = 1
  
    # Pointer to the second last 
    # character of the String 
    j = len(Str) - 2
    while (i < j): 
  
        # Swap Str[i] and Str[j] 
        temp = Str[i] 
        Str[i] = Str[j] 
        Str[j] = temp 
        i += 1
        j -= 1
  
    return "".join(Str) 
  
# Function to reverse every word of the 
# sentence except the first and the 
# last character of the words 
def reverseWords(Str): 
    Str = Str.split() 
  
    # While there are words left 
    for i in Str: 
  
        # Print the reversed word 
        j = [h for h in i] 
        print(reverseWord(j), end = " ") 
  
# Driver code 
Str= "geeks for geeks"
reverseWords(Str) 
  
# This code is contributed by Mohit Kumar 

