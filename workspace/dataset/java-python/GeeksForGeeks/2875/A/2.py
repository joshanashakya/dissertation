

# Python3 implementation to find 
# the length of the longest  
# substring having frequency 
# of each character less than  
# equal to k 
  
# import library 
import numpy as np 
  
SIZE = 26
  
# Function to find the length 
# of the longest sub having 
# frequency of each character 
# less than equal to k 
def longSub(str, k): 
      
    # Hash table to store frequency 
    # of each table 
    freq = np.zeros(26, dtype = np.int ) 
  
    # 'start' index of the  
    # current substring 
    start = 0
  
    # To store the maximum length 
    maxLen = 0
      
    n = len(str) 
  
    # Traverse the 'str' 
    for i in range(0, n): 
          
        # Get the current character 
        # as 'ch' 
        ch = str[i] 
  
        # Increase frequency of  
        # 'ch' in 'freq[]' 
        freq[ord(ch) - ord('a') ] += 1
  
        # If frequency of 'ch'  
        # becomes more than 'k' 
        if (freq[ord(ch) - ord('a')] > k): 
            # update 'maxLen' 
            if (maxLen < (i - start)): 
                maxLen = i - start 
  
            # decrease frequency of  
            # each character as they  
            # are encountered from  
            # the 'start' index until  
            # frequency of 'ch' is  
            # greater than 'k' 
            while (freq[ord(ch) - ord('a')] > k): 
                  
                # decrement frequency  
                # by '1' 
                freq[ord(str[start]) - ord('a')] -= 1
  
                # increment 'start' 
                start = start + 1
  
    # Update maxLen 
    if (maxLen < (n - start)): 
        maxLen = n - start 
  
    # required length 
    return maxLen; 
  
  
# Driver Code 
str = "babcaag"
k = 1
  
print ("Length =", longSub(str, k)) 
   
# This code is contributed by 'saloni1297' 

