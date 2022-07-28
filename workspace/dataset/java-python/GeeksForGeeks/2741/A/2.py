

# Python3 program to check if there exists 
# at least 1 sub-sequence in a string 
# which is not palindrome 
  
  
# Function to check if there exists 
# at least 1 sub-sequence in a string 
# which is not palindrome 
def isAnyNotPalindrome(s): 
  
    # use set to count number of 
    # distinct characters 
    unique=set()  
  
    # insert each character in set 
    for i in range(0,len(s)): 
        unique.add(s[i])  
  
    # If there is more than 1 unique 
    # characters, return true 
    if (len(unique) > 1): 
        return True
          
    # Else, return false 
    else: 
        return False
  
  
# Driver code 
if __name__=='__main__': 
    s = "aaaaab"
  
    if (isAnyNotPalindrome(s)): 
        print("YES")  
    else: 
        print("NO")  
  
# This code is contributed by 
# ihritik 

