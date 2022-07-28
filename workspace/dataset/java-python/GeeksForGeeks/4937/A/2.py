

# Python3 program to find Smallest and  
# Largest Word in a String 
  
# defining the method to find the longest  
# word and the shortest word 
def minMaxLengthWords(inp): 
    length = len(inp) 
    si = ei = 0
    min_length = length 
    min_start_index = max_length = max_start_index = 0
      
    # loop to find the length and stating index 
    # of both longest and shortest words 
    while ei <= length: 
        if (ei < length) and (inp[ei] != " "): 
            ei += 1
        else: 
            curr_length = ei - si 
              
            # condition checking for the shortest word 
            if curr_length < min_length: 
                min_length = curr_length 
                min_start_index = si 
                  
            # condition for the longest word  
            if curr_length > max_length: 
                max_length = curr_length 
                max_start_index = si 
            ei += 1
            si = ei 
              
    # extracting the shortest word using  
    # it's starting index and length      
    minWord = inp[min_start_index :  
                  min_start_index + min_length] 
      
    # extracting the longest word using  
    # it's starting index and length      
    maxWord = inp[max_start_index : max_length] 
      
    # printing the final result 
    print("Minimum length word: ", minWord) 
    print ("Maximum length word: ", maxWord) 
      
# Driver Code 
  
# Using this sting to test our code 
a = "GeeksforGeeks A Computer Science portal for Geeks"
minMaxLengthWords(a) 
  
# This code is contributed by Animesh_Gupta 

