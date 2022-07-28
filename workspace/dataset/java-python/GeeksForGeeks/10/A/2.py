

# Python 3 program to check if a prime  
# number can be expressed as sum of  
# two Prime Numbers  
import math 
  
# Function to check whether a number  
# is prime or not  
def isPrime(n): 
    if n <= 1: 
        return False
      
    if n == 2: 
        return True
          
    if n%2 == 0: 
        return False
          
    for i in range(3, int(math.sqrt(n))+1, 2): 
        if n%i == 0: 
            return False
    return True
  
# Function to check if a prime number  
# can be expressed as sum of  
# two Prime Numbers  
def isPossible(n): 
  
    # if the number is prime,  
    # and number-2 is also prime  
    if isPrime(n) and isPrime(n - 2): 
        return True
    else: 
        return False
  
# Driver code 
n = 13
if isPossible(n) == True: 
    print("Yes") 
else: 
    print("No") 
      
# This code is contributed by Shrikant13 

