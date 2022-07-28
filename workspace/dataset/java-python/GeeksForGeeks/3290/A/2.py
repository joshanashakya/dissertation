

# Python 3 implementation of  
# a more efficient approach. 
# return sum of all occurrences of all vowels 
def sumVowel(string): 
    n = len(string) 
    sum = 0
    string = string.lower() 
  
    # iterate through every character in the string 
    for i in range(0, n): 
        s = string[i] 
  
        # checks if the character is a vovel or not 
        if (s=="a" or s == "e" or s == "i" or s == "o" or s == "u"): 
  
            # uses below expression to calculate the count  
                        # of all occurrences of character in substrings  
                        # of the string 
            sum += ((n - i) * (i + 1))             
  
    # return total sum of occurrence 
    return sum
  
#driver code 
if __name__ == '__main__': 
    #input string here 
    string = "abhay"
    #print returned sum 
    print(vovel(string)) 
  
# This code is contributed by  
# Abhay Subramanian K 

