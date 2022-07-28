

# Python 3 implementation of above approach 
  
# Function that checks whether 
# the string is in alphabetical 
# order or not 
def isAlphabaticOrder(s): 
      
    # length of the string 
    n = len(s) 
  
    # create a character array 
    # of the length of the string 
    c = [s[i] for i in range(len(s))] 
  
    # sort the character array 
    c.sort(reverse = False) 
  
    # check if the character array 
    # is equal to the string or not 
    for i in range(n): 
        if (c[i] != s[i]): 
            return False
          
    return True
  
# Driver code 
if __name__ == '__main__': 
    s = "aabbbcc"
  
    # check whether the string is 
    # in alphabetical order or not 
    if (isAlphabaticOrder(s)): 
        print("Yes") 
    else: 
        print("No") 
  
# This code is contributed by 
# Surendra_Gangwar 

