

# Efficient Python program to   
# count n digit divisible numbers. 
  
# Find the number of term 
def numberofterm(digit, number): 
      
    # compute the first and last term 
    firstnum = pow(10, digit - 1) 
    lastnum = pow(10, digit) 
  
    # First number which is divisible by given number 
    firstnum = (firstnum - firstnum % number) + number 
  
    # last number which is divisible by given number 
    lastnum = (lastnum - lastnum % number) 
  
    # Apply the formula here 
    return ((lastnum - firstnum) // number + 1); 
  
# Driver code 
n = 3; number = 7
print(numberofterm(n, number)) 
  
# This code is contributed by Ajit. 

