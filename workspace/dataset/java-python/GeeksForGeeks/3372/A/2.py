

# Python program to Check  
# if it is possible to  
# convert the string into  
# palindrome string by  
# changing only one character. 
  
# Function to check if  
# it is possible to 
# convert the string  
# into palindrome 
def checkPalindrome(str) : 
      
    n = len(str) 
      
    # Counting number of  
    # characters that  
    # should be changed. 
    count = 0
    for i in range(0, int(n / 2)) : 
        if (str[i] != str[n - i - 1]) : 
            count = count + 1
      
    # If count of changes  
    # is less than 
    # or equal to 1 
    if(count <= 1) : 
        return True
    else : 
        return False
  
# Driver Code 
str = "abccaa"
if (checkPalindrome(str)) : 
    print ("Yes") 
else : 
    print ("No") 
      
# This code is contributed by  
# Manish Shaw(manishshaw1) 

