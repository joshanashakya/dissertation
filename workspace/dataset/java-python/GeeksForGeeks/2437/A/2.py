

# Efficient Python3 program to   
# find the sum divisible numbers. 
  
# find the Sum of having n digit  
# and divisible by the number 
def totalSumDivisibleByNum(digit, number): 
  
    # compute the first and last term 
    firstnum = pow(10, digit - 1) 
    lastnum = pow(10, digit) 
  
    # first number which is divisible 
    # by given number 
    firstnum = (firstnum - firstnum % number) + number 
  
    # last number which is divisible 
    # by given number 
    lastnum = (lastnum - lastnum % number) 
  
    # total divisible number 
    count = ((lastnum - firstnum) / number + 1) 
  
    # return the total sum 
    return int(((lastnum + firstnum) * count) / 2) 
  
  
# Driver code 
digit = 3; num = 7
print(totalSumDivisibleByNum(digit, num)) 
  
# This code is contributed by Smitha Dinesh Semwal 

