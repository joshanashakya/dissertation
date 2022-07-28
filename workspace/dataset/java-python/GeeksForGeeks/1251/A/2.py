

# Python 3 program to find number is palindrome  
# or not without using any extra space. 
  
# Function to check if the number is palindrome  
def isPalindrome(n) : 
  
    # if divisible by 11 then return True  
    if n % 11 == 0 : 
        return True
  
    # if not divisible by 11 then return False 
    return False
  
# Driver code 
if __name__ == "__main__" : 
  
    n = 123321
       
    if isPalindrome(n) : 
        print("Palindrome") 
    else : 
        print("Not Palindrome") 
              
# This code is contributed by ANKITRAI1 

