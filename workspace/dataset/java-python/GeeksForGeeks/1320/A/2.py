

# Python program to calculate 
# sum of Perrin Numbers 
  
# function for sum of first 
# n Perrin number. 
def calSum(n): 
  
    a = 3
    b = 0
    c = 2
  
    if (n == 0):  # n = 0 
        return 3
    if (n == 1):  # n = 1 
        return 3
    if (n == 2):  # n = 2 
        return 5
   
    # calculate k = 5 sum of 
    # three previous step. 
    sum = 5
   
    # Sum remaining numbers 
    while (n > 2): 
  
        # calculate next term 
        d = a + b 
        sum = sum + d 
        a = b 
        b = c 
        c = d 
        n = n-1
      
    return sum
  
# Driver code 
  
n = 9
print(calSum(n)) 
  
# This code is contributed 
# by Anant Agarwal. 

