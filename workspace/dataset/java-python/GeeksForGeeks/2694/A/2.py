

# python program to count substrings 
# with odd decimal value 
import math  
  
# function to count number of substrings  
# with odd decimal representation 
def countSubstr( s): 
  
    n = len(s) 
      
    # auxiliary array to store count  
    # of 1's before ith index 
    auxArr= [0 for i in range(n)] 
      
    if (s[0] == '1'): 
        auxArr[0] = 1
      
    # store count of 1's before  
    # i-th index 
    for i in range(0,n): 
          
      if (s[i] == '1'): 
            auxArr[i] = auxArr[i-1]+1
      else: 
            auxArr[i] = auxArr[i-1] 
      
      
    # variable to store answer 
    count = 0
      
    # traverse the string reversely to  
    # calculate number of odd substrings  
    # before i-th index 
    for i in range(n-1,-1,-1):  
        if (s[i] == '1'): 
            count += auxArr[i]  
      
    return count 
# Driver method 
s = "1101"
print (countSubstr(s)) 
  
# This code is contributed by Gitanjali. 

