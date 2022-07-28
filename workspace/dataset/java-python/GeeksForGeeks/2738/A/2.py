

# Python3 implementation of the approach  
  
MAX_CHAR = 256
  
# Function to return the count 
# of valid sub-strings  
def countSubStrings(s, anotherStr, k) : 
      
    # Store all characters of anotherStr in 
    # a direct index table for quick lookup.  
    illegal = [False] * MAX_CHAR 
      
    for i in range(len(anotherStr)) : 
        illegal[ord(anotherStr[i])] = True
          
    # To store distinct output substrings  
    us = set()  
      
    # Traverse through the given string  
    # and one by one generate substrings  
    # beginning from s[i].  
    for i in range(len(s)) : 
          
        # One by one generate substrings  
        # ending with s[j]  
        ss = ""  
          
        count = 0
        for j in range(i, len(s)) : 
              
            # If character is illegal 
            if (illegal[ord(s[j])]) : 
                count += 1
            ss = ss + s[j] 
              
            # If current substring is valid 
            if (count <= k) : 
                us.add(ss) 
              
            # If current substring is invalid, 
            # adding more characters would not 
            # help. 
            else : 
                break
      
    # Return the count of distinct 
    # sub-strings  
    return len(us) 
  
# Driver code  
if __name__ == "__main__" :  
  
    string = "acbacbacaa"
    anotherStr = "abcdefghijklmnopqrstuvwxyz"
    k = 2
    print(countSubStrings(string,  
                          anotherStr, k)) 
  
# This code is contributed by Ryuga 

