

# Python 3 program to count words  whose ith letter 
# is either (i-1)th, ith, or (i+1)th letter 
# of given word. 
   
# Return the count of words. 
def countWords( str,  l): 
  
    count = 1; 
   
    # If word contain single letter, return 1. 
    if (l == 1): 
        return count 
   
    # Checking for first letter. 
    if (str[0] == str[1]): 
        count *= 1
    else: 
        count *= 2
   
    # Traversing the string and multiplying 
    # for combinations. 
    for j in range(1,l-1): 
        # If all three letters are same. 
        if (str[j] == str[j-1] and str[j] == str[j+1]): 
            count *= 1
   
        # If two letter are distinct. 
        elif (str[j] == str[j-1] or
                 str[j] == str[j+1] or
                 str[j-1] == str[j+1]): 
            count *= 2
   
        # If all three letter are distinct. 
        else: 
            count *= 3
   
    # Checking for last letter. 
    if (str[l - 1] == str[l - 2]): 
        count *= 1
    else: 
        count *= 2
   
    return count 
   
# Driven Program 
if __name__ == "__main__": 
      
    str = "abc"
    l = len(str) 
   
    print(countWords(str, l)) 

