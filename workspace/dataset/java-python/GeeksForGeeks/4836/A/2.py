

# Python 3 program to check whether number 
# has exactly three distinct factors 
# or not 
  
from math import sqrt 
# Utility function to check whether a 
# number is prime or not 
def isPrime(n): 
    # Corner cases 
    if (n <= 1): 
        return False
    if (n <= 3): 
        return True
  
    # This is checked so that we can skip 
    # middle five numbers in below loop 
    if (n % 2 == 0 or n % 3 == 0): 
        return False
      
    k= int(sqrt(n))+1
    for i in range(5,k,6): 
        if (n % i == 0 or n % (i + 2) == 0): 
            return False
  
    return True
  
# Function to check whether given number 
# has three distinct factors or not 
def isThreeDisctFactors(n): 
    # Find square root of number 
    sq = int(sqrt(n)) 
  
    # Check whether number is perfect 
    # square or not 
    if (1 * sq * sq != n): 
        return False
  
    # If number is perfect square, check 
    # whether square root is prime or 
    # not 
    if (isPrime(sq)): 
        return True
    else: 
        return False
  
# Driver program 
if __name__ == '__main__': 
    num = 9
    if (isThreeDisctFactors(num)): 
        print("Yes") 
    else: 
        print("No") 
  
    num = 15
    if (isThreeDisctFactors(num)): 
        print("Yes") 
    else: 
        print("No") 
  
    num = 12397923568441
    if (isThreeDisctFactors(num)): 
        print("Yes") 
    else: 
        print("No") 
  
# This code is contributd by  
# Surendra_Gangwar 

