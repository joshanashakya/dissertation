

# Program to find number 
# of integer such that 
# integer - digSum  > s 
  
# function for digit sum 
def digitSum(n): 
  
    digSum = 0
  
    while (n>0): 
        digSum += n % 10
        n //= 10
    
    return digSum 
   
# function to calculate 
# count of integer s.t. 
# integer - digSum > s 
   
def countInteger(n, s): 
      
    # if n < s no integer possible 
    if (n < s): 
        return 0
   
    # iterate for s range 
    # and then calculate  
    # total count of such 
    # integer if starting  
    # integer is found 
    for i in range(s,min(n, s + 163)+1): 
        if ((i - digitSum(i)) > s): 
            return (n - i + 1) 
   
    # if no integer found return 0 
    return 0
  
# driver code 
n = 1000
s = 100
  
print(countInteger(n, s)) 
  
# This code is contributed 
# by Anant Agarwal. 

