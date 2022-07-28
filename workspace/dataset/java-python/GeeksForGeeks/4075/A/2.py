

# Python 3 program to find sum of all second largest divisor 
# after splitting a number into one or more parts 
  
from math import sqrt 
# Function to find a number is prime or not 
def prime(n): 
    if (n == 1): 
        return False
  
    # If there is any divisor 
    for i in range(2,int(sqrt(n))+1,1): 
        if (n % i == 0): 
            return False
  
    return True
  
# Function to find the sum of all second largest divisor 
# after splitting a number into one or more parts 
def Min_Sum(n): 
    # If number is prime 
    if (prime(n)): 
        return 1
  
    # If n is even 
    if (n % 2 == 0): 
        return 2
  
    # If the number is odd 
    else: 
        # If N-2 is prime 
        if (prime(n - 2)): 
            return 2
  
        # There exists 3 primes x1, x2, x3 
        # such that x1 + x2 + x3 = n 
        else: 
            return 3
  
# Driver code 
if __name__ == '__main__': 
    n = 27
  
    # Function call 
    print(Min_Sum(n)) 
  
# This code is contributed by 
# Surendra_Gangwar 

