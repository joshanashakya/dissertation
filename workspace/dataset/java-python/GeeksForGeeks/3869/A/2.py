

# Python3 implementation of the approach 
  
# function to return the count of digit of n 
def numberofDigits(n): 
    cnt = 0
    while n > 0: 
        cnt += 1
        n //= 10
    return cnt 
      
# function to print the left shift numbers 
def cal(num): 
    digit = numberofDigits(num) 
    powTen = pow(10, digit - 1) 
      
    for i in range(digit - 1): 
          
        firstDigit = num // powTen 
          
        # formula to calculate left shift  
        # from previous number 
        left = (num * 10 + firstDigit - 
               (firstDigit * powTen * 10)) 
        print(left, end = " ") 
          
        # Update the original number 
        num = left 
          
# Driver code 
num = 1445
cal(num) 
  
# This code is contributed 
# by Mohit Kumar 

