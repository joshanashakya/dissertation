

# Python3 program to count words  
# in a given string 
OUT = 0
IN = 1
  
# Returns number of words in string 
def countWords(string): 
    state = OUT 
    wc = 0
  
    # Scan all characters one by one 
    for i in range(len(string)): 
  
        # If next character is a separator,  
        # set the state as OUT 
        if (string[i] == ' ' or string[i] == '\n' or
            string[i] == '\t'): 
            state = OUT 
  
        # If next character is not a word  
        # separator and state is OUT, then  
        # set the state as IN and increment  
        # word count 
        elif state == OUT: 
            state = IN 
            wc += 1
  
    # Return the number of words 
    return wc 
  
# Driver Code 
string = "One two         three\n four\tfive "
print("No. of words : " + str(countWords(string))) 
  
# This code is contributed by BHAVYA JAIN 

