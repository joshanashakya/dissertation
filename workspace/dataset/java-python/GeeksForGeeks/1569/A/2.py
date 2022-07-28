

# Python 3 Program to find the "GFG"  
# subsequence in the given string 
MAX = 100
  
# Print the count of "GFG" subsequence  
# in the string 
def countSubsequence(s, n): 
    cntG = 0
    cntF = 0
    result = 0
    C=0
  
  
    # Traversing the given string 
    for i in range(n): 
        if (s[i] == 'G'): 
              
            # If the character is 'G', increment 
            # the count of 'G', increase the result 
            # and update the array. 
            cntG += 1
            result += C 
            continue
  
        # If the character is 'F', increment 
        # the count of 'F' and update the array. 
        if (s[i] == 'F'): 
            cntF += 1
            C += cntG 
            continue
  
        # Ignore other character. 
        else: 
            continue
      
    print(result) 
  
# Driver Code 
if __name__ == '__main__': 
    s = "GFGFG"
    n = len(s) 
    countSubsequence(s, n) 
      
# This code is contributed by 
# Sanjit_Prasad 

