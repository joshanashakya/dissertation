

# Python3 program to implement the  
# above approach  
  
# Function that returns true if the sub-string  
# starting from index i and ending at index j  
# is a palindrome  
def isPalindrome(s, i, j) :  
      
    while (i < j) : 
          
        if (s[i] != s[j]) : 
            return False;  
              
        i += 1;  
        j -= 1;  
  
    return True;  
  
# Function to get the required index  
def getIndex(s1, s2, length) : 
      
    i = 0 ; j = length - 1;  
  
    # Start comparing the two strings  
    # from both ends.  
    while (i < j) : 
          
        # Break from the loop at first mismatch  
        if (s1[i] != s2[j]) : 
            break;  
  
        i += 1;  
        j -= 1;  
  
    # If it is possible to concatenate  
    # the strings to form palindrome,  
    # return index  
    if (i == j) : 
        return i - 1;  
  
    # If remaining part for s2  
    # is palindrome  
    elif (isPalindrome(s2, i, j)) : 
        return i - 1;  
  
    # If remaining part for s1  
    # is palindrome  
    elif (isPalindrome(s1, i, j)) : 
        return j;  
  
    # If not possible, return -1  
    return -1;  
  
# Driver Code  
if __name__ == "__main__" : 
  
    s1 = "abcdf" ; 
    s2 = "sfgba";  
    length = len(s1) ;  
  
    print(getIndex(s1, s2, length));  
      
# This code is contributed by Ryuga 

