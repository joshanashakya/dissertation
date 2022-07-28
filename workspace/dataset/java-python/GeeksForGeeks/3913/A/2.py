

# Python program to print all funny words in a string 
def checkFunny(word): 
    i = 1
    j = len(word) - 2
    word = word.lower() 
      
    while (i <= j): 
        if ((abs(ord(word[i]) - ord(word[i - 1]))) 
           != abs((ord(word[j]) - ord(word[j + 1])))): 
            return False
        i = i + 1
        j = j - 1
    return True
      
def printFunnyWords(str): 
  
    # to extract last word of sentence 
    str = str + " "
  
    # to word stores each word of sentence 
    word = "" 
    i = 0
    for i in range(len(str)): 
        ch = str[i] 
  
        # extracting each word 
        if (ch != ' '): 
            word = word + ch 
        else: 
            if (checkFunny(word)): 
                print (word) 
            word = "" 
  
# Driver code 
printFunnyWords("Miss Arora teaches us malayalam bdwy ") 
  
# This code is contributed by Prateek Bajaj 

