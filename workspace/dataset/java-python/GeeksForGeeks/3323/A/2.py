

# Python3 program to implement run  
# length encoding 
  
# Check if the character is  
# vowel or not 
def isVowel(c): 
      
    vowel = "aeiou"
    for i in range(len(vowel)): 
        if(vowel[i] == c): 
            return True
    return False
      
# Returns true if 'typed' is a  
# typed name given str 
def printRLE(str, typed): 
      
    n = len(str) 
    m = len(typed) 
      
    # Traverse through all  
    # characters of str 
    j = 0
    for i in range(n): 
          
        # If current characters do  
        # not match 
        if str[i] != typed[j]: 
            return False
          
        # If not vowel, simply move  
        # ahead in both 
        if isVowel(str[i]) == False: 
            j = j + 1
            continue
          
        # Count occurences of current  
        # vowel in str 
        count1 = 1
        while (i < n - 1 and (str[i] == str[i + 1])): 
            count1 = count1 + 1
            i = i + 1
              
        # Count occurence of current  
        # vowel in typed 
        count2 = 1
        while(j < m - 1 and typed[j] == str[i]): 
            count2 = count2 + 1
            j = j + 1
          
        if count1 > count2: 
            return False
      
    return True
  
# Driver code 
name = "alex"
typed = "aaalaeex"
if (printRLE(name, typed)): 
    print("Yes") 
else: 
    print("No") 
      
# This code is contributed 
# by Shashank_Sharma      

