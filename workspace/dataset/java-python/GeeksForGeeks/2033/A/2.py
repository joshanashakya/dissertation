

# Python3 program to print the largest 
# integer not greater than N with  
# all even digits 
import math as mt 
  
# function to return the largest  
# number with all digits even 
def largestNumber(n): 
  
    s = "" 
    duplicate = n 
  
    # convert the number to a string  
    # for easy operations 
    while (n > 0): 
        s = chr(n % 10 + 48) + s 
        n = n // 10
      
    index = -1
  
    # find first odd digit 
    for i in range(len(s)):  
        if ((ord(s[i]) - ord('0')) % 2 & 1): 
            index = i 
            break
          
    # if no digit, then N is the answer 
    if (index == -1): 
        return duplicate 
  
    num = 0
  
    # till first odd digit, add all  
    # even numbers 
    for i in range(index): 
        num = num * 10 + (ord(s[i]) - ord('0')) 
  
    # decrease 1 from the odd digit 
    num = num * 10 + (ord(s[index]) -   
                      ord('0') - 1) 
  
    # add 0 in the rest of the digits 
    for i in range(index+1,len(s)): 
        num = num * 10 + 8
  
    return num 
  
# Driver Code 
N = 24578
  
print(largestNumber(N)) 
  
# This code is contributed  
# by Mohit kumar 29 
     

