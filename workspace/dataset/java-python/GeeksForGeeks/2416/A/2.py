

# Python3 implementation of the approach  
  
# Function that returns true if num is palindrome  
def isPalindrome(num) :  
  
    # Convert the given floating point number  
    # into a string  
    s = str(num)  
      
    # Pointers pointing to the first and  
    # the last character of the string  
    low = 0
    high = len(s) - 1
  
    while (low < high):  
      
        # Not a palindrome  
        if (s[low] != s[high]):  
            return False
  
        # Update the pointers  
        low += 1
        high -= 1
      
    return True
  
# Driver code  
n = 123.321
  
if (isPalindrome(n)):  
    print("Yes")  
else:  
    print("No")  
  
# This code is contributed by ihritik  

