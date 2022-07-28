

# Python3 implementation of  
# above approach 
  
# Function that removes the 
# characters which have even 
# frequencies in the string 
def solve(s): 
      
    # create a map to store the 
    # frequency of each character 
    m = dict() 
    for i in range(len(s)): 
        if s[i] in m: 
            m[s[i]] = m[s[i]]+1
        else: 
            m[s[i]] = 1
              
    # to store the new string 
    new_string = "" 
      
    # remove the characters which 
    # have even frequencies 
    for i in range(len(s)): 
          
        # if the character has  
        # even frequency then skip 
        if m[s[i]]%2 == 0: 
            continue
          
        # else concatenate the 
        # character to the new string 
        new_string = new_string+s[i] 
          
    # display the modified string 
    print(new_string) 
      
#Driver code 
if __name__=='__main__': 
    s = "aabbbddeeecc"
  
# remove the characters which 
# have even frequencies 
    solve(s) 
  
# this code is contributed by  
# Shashank_Sharma 

