

# Python3 implementation of the above approach  
  
# Function to find the length  
# of the longest substring  
def lenoflongestnonpalindrome(s):  
  
    # initializing the variables  
    max1, length = 1, 0
  
    for i in range(0, len(s) - 1):  
          
        # checking palindrome of  
        # size 2 example: aa  
        if s[i] == s[i + 1]:  
            length = 0
              
        # checking palindrome of  
        # size 3 example: aba  
        elif s[i + 1] == s[i - 1] and i > 0: 
            length = 1
        else: # incrementing length of substring  
            length += 1
        max1 = max(max1, length + 1) # finding maximum  
  
    # If there exits single character  
    # then it is always palindrome  
    if max1 == 1:  
        return 0
    else: 
        return max1  
  
# Driver Code  
if __name__ == "__main__": 
  
    s = "synapse"
    print(lenoflongestnonpalindrome(s)) 
      
# This code is contributed by Rituraj Jain 

