

# Python 3 program to find the sum of  
# all odd length palindromic numbers 
# within the given range 
  
# Function that returns true if 
# the given number is a palindrome 
def isPalindrome(num): 
    reverse_num = 0
      
    # Here we are generating a new number  
    # (reverse_num) by reversing the digits  
    # of original input number 
    temp = num 
    while (temp != 0): 
        remainder = temp % 10
        reverse_num = reverse_num * 10 + remainder 
        temp = int(temp/10) 
  
    # If the original input number (num) is  
    # equal to its reverse (reverse_num) then  
    # its palindrome else it is not. 
    if (reverse_num == num): 
        return True
  
    return False
  
# Function that returns true if the given  
# number is of odd length 
def isOddLength(num): 
    count = 0
    while (num > 0): 
        num = int (num / 10) 
        count += 1
  
    if (count % 2 != 0): 
        return True
  
    return False
  
# Function to return the sum of all odd length 
# palindromic numbers within the given range 
def sumOfAllPalindrome(L, R): 
    sum = 0
    if (L <= R): 
        for i in range(L, R + 1, 1): 
              
            # if number is palindrome and of  
            # odd length 
            if (isPalindrome(i) and isOddLength(i)): 
                sum += i 
              
    return sum
  
# Driver code 
if __name__ == '__main__': 
    L = 110
    R = 1130
    print(sumOfAllPalindrome(L, R)) 
  
# This code is contributed by 
# Shashank_Sharma 

