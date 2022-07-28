

# Python3 Program to check whether the given number  
# is Lychrel Number or not with given limit  
# on number of iterations.  
  
# Max Iterations  
MAX_ITERATIONS = 20;  
  
# Function to check whether number is  
# Lychrel Number  
def isLychrel(number): 
      
    for i in range(MAX_ITERATIONS):  
        number = number + reverse(number);  
          
        if (isPalindrome(number)):  
            return "false";  
      
    return "true";  
  
# Function to check whether the number  
# is Palindrome  
def isPalindrome(number):  
   
    return number == reverse(number);  
  
# Function to reverse the number  
def reverse(number):  
   
    reverse = 0;  
    while (number > 0):  
       
        remainder = number % 10;  
        reverse = (reverse * 10) + remainder;  
        number = int(number / 10);  
      
    return reverse;  
  
# Driver Code 
number = 295;  
print(number," is lychrel? ",isLychrel(number));  
  
# This code is contributed by mits  

