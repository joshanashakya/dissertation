

# Python3 implementation of  
# above approach  
  
# Function that checks whether the vowel  
# characters in a string are  
# in alphabetical order or not  
def areVowelsInOrder(s) : 
  
    n = len(s) 
  
    # ASCII Value 64 is less than  
    # all the alphabets  
    # so using it as a default value  
    c = chr(64) 
  
    # check if the vowels in  
    # the string are sorted or not  
    for i in range(1, n) : 
          
        if (s[i] == 'a' or s[i] == 'e' or s[i] ==
            'i' or s[i] == 'o' or s[i] == 'u') : 
  
            # if the vowel is smaller  
            # than the previous vowel  
            if s[i] < c : 
                return False
            else : 
                  
                # store the vowel  
                c = s[i] 
  
    return True
  
# Driver code      
if __name__ == "__main__" : 
  
    s = "aabbbddeecc"
  
    # check whether the vowel  
    # characters in a string are  
    # in alphabetical order or not  
    if areVowelsInOrder(s) : 
        print("Yes") 
  
    else : 
        print("No") 
  
# This code is contributed by  
# ANKITRAI1 

