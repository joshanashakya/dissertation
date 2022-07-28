

# Python program to check if a number 
# has same number of set and unset bits 
  
# Function to check if a number 
# has same setbits and unset bits 
def checkSame(n): 
    set, unset = 0, 0
  
    # iterate for all bits of a number 
    while(n): 
  
        # if set 
        if (n and 1): 
            set + 1
              
        # if unset 
        else: 
            unset += 1
  
        # right shift number by 1 
        n = n >> 1
          
    # is number of set bits are 
    # equal to unset bits 
    if (set == unset): 
        return True
    else: 
        return False
  
# Driver Code 
if __name__ == '__main__': 
    n = 12
  
    # function to check 
    if (checkSame(n)): 
        print("YES") 
    else: 
        print("NO") 
  
# This code is contributed  
# by 29AjayKumar 

