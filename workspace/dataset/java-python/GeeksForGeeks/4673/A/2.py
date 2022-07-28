

# Python 3 program to 
# find the number  
# with maximum digit 
# sum. 
  
  
# function to calculate  
# the sum of digits of 
# a number. 
def sumOfDigits(a) : 
    sm = 0
    while (a!=0) : 
        sm = sm + a % 10
        a = a // 10
      
    return sm 
      
# Returns the maximum number 
# with maximum sum of digits. 
def findMax(x) : 
      
    # initializing b as 1 
    # and initial max sum 
    # to be of n 
    b = 1
    ans = x 
      
    # iterates from right 
    # to left in a digit 
    while (x!=0) : 
        # while iterating this  
        # is the number from 
        # right to left 
        cur = (x - 1) * b + (b - 1) 
          
        # calls the function to 
        # check if sum of cur is 
        # more then of ans 
        if (sumOfDigits(cur) > sumOfDigits(ans) or
        (sumOfDigits(cur) == sumOfDigits(ans) and
            cur > ans)) : 
                ans = cur 
  
        # reduces the number 
        # to one unit less 
        x =x // 10
        b = b * 10
      
      
    return ans 
      
# driver program to test the above function 
n = 521
print(findMax(n)) 
  
# This article is contributed by Nikita Tiwari. 

