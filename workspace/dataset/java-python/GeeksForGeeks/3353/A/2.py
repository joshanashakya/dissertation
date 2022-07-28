

# Python 3 implementation of the approach 
   
# Function to check if a string 
# is made up of k alternating characters 
def isKAlternating( s, k): 
    if (len(s) < k): 
        return False
   
    checker = 0
   
    # Check if all the characters at 
    # indices 0 to K-1 are different 
    for i in range( k): 
   
        bitAtIndex = ord(s[i]) - ord('a') 
   
        # If that bit is already set in 
        # checker, return false 
        if ((checker & (1 << bitAtIndex)) > 0): 
            return False
   
        # Otherwise update and continue by 
        # setting that bit in the checker 
        checker = checker | (1 << bitAtIndex) 
   
    for i in range(k,len(s)): 
        if (s[i - k] != s[i]): 
            return False
   
    return True
   
# Driver code 
if __name__ =="__main__": 
  
    st = "acdeac"
    K = 4
   
    if (isKAlternating(st, K)): 
        print ("Yes") 
    else: 
        print ("No") 
   
# This code is contributed by chitranayal    

