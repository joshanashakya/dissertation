

# Efficient Python3 program to find maximum  
# number of characters between two occurrences  
# of same character 
  
MAX_CHAR = 256
  
def maximumChars(str1): 
  
    n = len(str1) 
    res = -1
  
    # Initialize all indexes as -1. 
    firstInd = [-1 for i in range(MAX_CHAR)] 
  
    for i in range(n):  
        first_ind = firstInd[ord(str1[i])] 
  
        # If this is first occurrence  
        if (first_ind == -1): 
            firstInd[ord(str1[i])] = i 
  
        # Else find distance from previous 
        # occurrence and update result (if 
        # required).  
        else: 
            res = max(res, abs(i - first_ind - 1)) 
      
    return res 
  
# Driver code 
str1 = "abba"
print(maximumChars(str1)) 
  
# This code is contributed by Mohit kumar 29 

