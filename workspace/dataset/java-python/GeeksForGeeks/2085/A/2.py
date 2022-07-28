

# Python program to find Sum of digits of a 
# number formed by repeating a number X number  
# of times until sum become single digit. 
  
# Return single digit sum of a number 
def digSum(n): 
    if n == 0: 
        return 0
    return (n % 9 == 0) and 9 or (n % 9) 
      
# Returns recursive sum of digits of a number  
# formed by repeating a number X number of 
# times until sum become single digit. 
def repeatedNumberSum(n, x): 
    sum = x * digSum(n) 
    return digSum(sum) 
  
# Driver Code 
n = 24; x = 3
print(repeatedNumberSum(n, x)) 
  
# This code is contributed by Ajit. 

