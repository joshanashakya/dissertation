

# Python3 implementation for printing  
# sentence without repetitive vowels 
  
# function which returns True or False 
# for occurrence of a vowel 
def is_vow(c): 
  
    # this compares vowel with  
    # character 'c' 
    return ((c == 'a') or (c == 'e') or 
            (c == 'i') or (c == 'o') or 
            (c == 'u')); 
  
# function to print resultant string 
def removeVowels(str): 
  
    # print 1st character 
    print(str[0], end = ""); 
  
    # loop to check for each character 
    for i in range(1,len(str)): 
  
        # comparison of consecutive 
        # characters 
        if ((is_vow(str[i - 1]) != True) or 
            (is_vow(str[i]) != True)): 
              
            print(str[i], end = ""); 
  
# Driver code 
str= " geeks for geeks"; 
removeVowels(str); 
  
# This code is contributed by mits  

