

# A simple python program to find  
# first natural number whose  
# factorial divides x. 
  
# Returns first number whose  
# factorial divides x. 
def firstFactorialDivisibleNumber(x): 
    i = 1; # Result 
    fact = 1; 
    for i in range(1, x): 
        fact = fact * i 
        if (fact % x == 0): 
            break
    return i 
  
# Driver code 
x = 16
print(firstFactorialDivisibleNumber(x)) 
  
# This code is contributed  
# by 29AjayKumar 

