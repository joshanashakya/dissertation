

# Python3 program to check  
# a large number divisible 
# by 41 or not 
  
# Check if a number is  
# divisible by 41 or not 
def DivisibleBy41(first,  
                  second, c, n): 
  
    # array to store  
    # all the digits 
    digit = [0] * n 
  
    # base values 
    digit[0] = first 
    digit[1] = second 
  
    # calculate remaining 
    # digits 
    for i in range(2,n): 
        digit[i] = (digit[i - 1] * c +
                    digit[i - 2]) % 10
  
    # calculate answer 
    ans = digit[0] 
    for i in range(1,n): 
        ans = (ans * 10 + digit[i]) % 41
  
    # check for  
    # divisibility 
    if (ans % 41 == 0): 
        return True
    else: 
        return False
  
# Driver Code 
first = 1
second = 2
c = 1
n = 3
  
if (DivisibleBy41(first,  
                  second, c, n)): 
    print("YES") 
else: 
    print("NO") 
  
# This code is contributed  
# by Smita 

