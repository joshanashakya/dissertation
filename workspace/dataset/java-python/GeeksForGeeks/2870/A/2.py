

# Python3 program to print Number of Words, 
# Vowels and Frequency of Each Character 
  
# A method to count the number of  
# uppercase character, vowels and number of words 
def words(str): 
    wcount = vcount = ucount = i = 0
    while i < len(str): 
        ch = str[i] 
          
        # condition checking for word count 
        if (ch == " " or ch == "."): 
            wcount += 1
              
        # condition checking for vowels  
        # in lower case      
        if(ch == "a" or ch == "e" or 
           ch == "i" or ch == 'o' or ch == "u"): 
            vcount += 1
              
        # condition checking for vowels in uppercase  
        if (ch == "A" or ch == "E" or 
            ch == "I" or ch == 'O' or ch == "U"): 
            vcount += 1
              
        # condition checking for upper case characters  
        if (ord(ch) >= 65 and ord(ch) <= 90): 
            ucount += 1
        i += 1
          
    print("number of words = ", wcount) 
    print("number of vowels = ", vcount) 
    print("number of upper case characters = ",  
                                        ucount) 
      
# a method to print the frequency  
# of each character.  
def frequency(str): 
    i = 1
      
    # checking each and every 
    # ascii code character  
    while i < 127: 
        ch1 = chr(i) 
        c = 0
        j = 0
        while j < len(str): 
            ch2 = str[j] 
            if(ch1 == ch2): 
                c += 1
            j += 1
              
        # condition to print the freqency  
        if c > 0: 
            print("Character:", ch1 + 
                  " Frequency:", c) 
        i += 1
          
# Driver Code 
  
# sample string to check the code      
s = "Geeks for Geeks."
  
# function calling 
words(s) 
frequency(s) 
  
# This code is contributed by Animesh_Gupta 

