

# Python3 program to find first   
# and last digits of a number 
import math 
  
# Find the first digit 
def firstDigit(n) : 
      
    # Find total number of digits - 1 
    digits = (int)(math.log10(n)) 
  
    # Find first digit 
    n = (int)(n / pow(10, digits)) 
  
    # Return first digit 
    return n; 
  
# Find the last digit 
def lastDigit(n) : 
      
    # return the last digit 
    return (n % 10) 
  
# Driver Code 
n = 98562; 
print(firstDigit(n), end = " ")  
print(lastDigit(n)) 
  
# This code is contributed by rishabh_jain 

