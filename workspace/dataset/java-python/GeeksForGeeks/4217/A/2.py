

# Python3 implementation of the approach 
import math as mt 
  
# Function to return the count of  
# the required strings 
def findAnswer(str1, str2, n): 
  
    l, r = 0, 0
    ans = 2
  
    # Searching index after longest  
    # common prefix ends 
    for i in range(n): 
        if (str1[i] != str2[i]): 
            l = i 
            break
          
    # Searching index before longest  
    # common suffix ends 
    for i in range(n - 1, -1, -1):  
        if (str1[i] != str2[i]): 
            r = i 
            break
          
    if (r < l): 
        return 26 * (n + 1) 
  
    # If only 1 character is different 
    # in both the strings 
    elif (l == r): 
        return ans 
    else: 
  
        # Checking remaining part of  
        # string for equality 
        for i in range(l + 1, r + 1):  
            if (str1[i] != str2[i - 1]): 
                ans -= 1
                break
              
        # Searching in right of string h 
        # (g to h) 
        for i in range(l + 1, r + 1):  
            if (str1[i - 1] != str2[i]):  
                ans -= 1
                break
              
        return ans 
      
# Driver code 
str1 = "toy"
str2 = "try"
n = len(str1) 
print(findAnswer(str1, str2, n)) 
  
# This code is contributed 
# by Mohit kumar 29 

