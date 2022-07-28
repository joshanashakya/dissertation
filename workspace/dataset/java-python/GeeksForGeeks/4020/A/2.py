

# Python 3 implementation of the approach 
from math import floor 
# Function to calculate the sum of the digits of 
# n in the given base 
def solve(n, base): 
    # Sum of digits 
    sum = 0
  
    while (n > 0): 
        # Digit of n in the given base 
        remainder = n % base 
  
        # Add the digit 
        sum = sum + remainder 
        n = int(n / base) 
      
    return sum
  
# Function to calculate the sum of 
# digits of n in bases from 2 to n/2 
def SumsOfDigits(n): 
      
    # to store digit sum in all base 
    sum = 0
    N = floor(n/2) 
    # function call for multiple bases 
    for base in range(2,N+1,1): 
        sum = sum + solve(n, base) 
  
    print(sum) 
  
# Driver program 
if __name__ == '__main__': 
    n = 8
    SumsOfDigits(n) 
      
# This code is contributed by  
# Surendra_Gangwar 

