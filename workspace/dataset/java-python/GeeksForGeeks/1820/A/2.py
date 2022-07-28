

# Python3 program to check if  
# octal representation of  
# a number is prime 
MAX_DIGITS = 20; 
  
# Function to Check no  
# is in octal or not 
def isOctal(n): 
    while(n): 
        if((n % 10) >= 8): 
            return False
        else: 
            n = int(n / 10) 
    return True
  
# Function To check no  
# is palindrome or not 
def isPalindrome(n): 
    # If number is already in  
    # octal, we traverse digits  
    # using repeated division  
    # with 10. Else we traverse  
    # digits using repeated  
    # division with 8 
    divide = 8 if(isOctal(n) == False) else 10
  
    # To store individual digits  
    octal=[] 
  
    # Traversing all digits 
    while (n != 0): 
        octal.append(n % divide) 
        n = int(n / divide) 
  
    # checking if octal  
    # no is palindrome 
    j = len(octal)-1
    k = 0
    while(k <= j): 
        if(octal[j] != octal[k]): 
            return False
        j-=1
        k+=1
    return True
  
  
# Driver Code 
if __name__=='__main__': 
    n = 97; 
    if (isPalindrome(n)): 
        print("Yes") 
    else: 
        print("No") 
  
# This code is contributed by mits 

