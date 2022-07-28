

# A naive approach of Python3 program  
# of finding nth palindrome of k digit  
import math; 
# Utility function to  
# reverse the number n  
def reverseNum(n):  
    rev = 0;  
    while (n):  
        rem = n % 10;  
        rev = (rev * 10) + rem;  
        n = int(n / 10);  
   
    return rev;  
  
# Boolean Function to check for  
# palindromic number  
def isPalindrom(num): 
    return num == reverseNum(num);  
  
# Function for finding nth  
# palindrome of k digits  
def nthPalindrome(n, k):  
    # Get the smallest k digit number  
    num = math.pow(10, k - 1);  
  
    while (True):  
        # check the number is  
        # palindrom or not  
        if (isPalindrom(num)):  
            n-=1;  
  
        # if n'th palindrome found  
        # break the loop  
        if (not n):  
            break;  
  
        # Increment number for checking 
        # next palindrome  
        num+=1;  
  
    return int(num);  
  
# Driver code  
n = 6; 
k = 5;  
print(n,"th palindrome of",k,"digit =",nthPalindrome(n, k));  
  
n = 10; 
k = 6;  
print(n,"th palindrome of",k,"digit =",nthPalindrome(n, k)); 
  
# This code is contributed by mits 

