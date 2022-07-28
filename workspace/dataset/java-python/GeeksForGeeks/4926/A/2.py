

# Python program to find number of  
# characters at same position as  
# in English alphabets  
  
# Function to count the number of  
# characters at same position as  
# in English alphabets  
def findCount(str): 
    result = 0
  
    # Traverse the input string 
    for i in range(len(str)): 
  
        # Check that index of characters of string is  
        # same as of English alphabets by using ASCII  
        # values and the fact that all lower case  
        # alphabetic characters come together in same  
        # order in ASCII table. And same is true for  
        # upper case.  
        if ((i == ord(str[i]) - ord('a')) or 
            (i == ord(str[i]) - ord('A'))): 
            result += 1
    return result 
  
# Driver Code 
str = 'AbgdeF'
print(findCount(str)) 
  
# This code is contributed 
# by SamyuktaSHegde 

