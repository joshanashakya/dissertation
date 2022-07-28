

# Python program to count minimum 
# palindromic subsequences to  
# be removed to make an string 
# empty. 
  
# A function to check if a  
# string str is palindrome 
def isPalindrome(str): 
      
    # Start from leftmost and  
    # rightmost corners of str 
    l = 0
    h = len(str) - 1
      
    # Keep comparing characters  
    # while they are same 
    while (h > l): 
        if (str[l] != str[h]): 
            return 0
        l = l + 1
        h = h - 1
          
    return 1
      
# Returns count of minimum  
# palindromic subseuqnces to 
# be removed to make string 
# empty 
def minRemovals(str): 
      
    #If string is empty 
    if (str[0] == ''): 
        return 0
      
    #If string is palindrome 
    if (isPalindrome(str)): 
        return 1
      
    # If string is not palindrome 
    return 2
      
# Driver code  
print(minRemovals("010010")) 
print(minRemovals("0100101")) 
  
# This code is contributed by Sam007. 

