

# Python 3 program to find counter clockwise 
# shifts to make string palindrome. 
  
# Function to check if given string  
# is palindrome or not. 
def isPalindrome(str, l, r): 
  
    while (l < r) : 
        if (str[l] != str[r]): 
            return False
  
        l += 1
        r -= 1
  
    return True
  
# Function to find counter clockwise  
# shifts to make string palindrome. 
def CyclicShifts(str): 
  
    n = len(str) 
  
    # Pointer to starting of current 
    # shifted string. 
    left = 0
  
    # Pointer to ending of current 
    # shifted string. 
    right = n - 1
  
    # Concatenate string with itself 
    str = str + str
  
    # To store counterclockwise shifts 
    cnt = 0
  
    # Move left and right pointers  
    # one step at a time. 
    while (right < 2 * n - 1) : 
  
        # Check if current shifted string 
        # is palindrome or not 
        if (isPalindrome(str, left, right)): 
            break
  
        # If string is not palindrome 
        # then increase count of number 
        # of shifts by 1. 
        cnt += 1
  
        left += 1
        right += 1
  
    return cnt 
  
# Driver code. 
if __name__ == "__main__": 
      
    str = "bccbbaab"; 
  
    print(CyclicShifts(str)) 
  
# This code is contributed by ita_c 

