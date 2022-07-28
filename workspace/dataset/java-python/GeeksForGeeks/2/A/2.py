

# Python3 implementation of the approach  
from math import sqrt 
  
# Function that returns true  
# if n is prime  
def Prime(n) :  
  
    # There is no prime  
    # less than 2  
    if (n < 2) : 
        return False;  
  
    # Run a loop from 2 to sqrt(n)  
    for i in range(2, int(sqrt(n)) + 1) : 
  
        # If there is any factor  
        if (n % i == 0) : 
            return False;  
  
    return True;  
  
# Function that returns true if n  
# has a prime count of divisors  
def primeCountDivisors(n) :  
  
    if (n < 2) : 
        return False;  
  
    # Find the prime factors  
    for i in range(2, int(sqrt(n)) + 1) : 
        if (n % i == 0) : 
  
            # Find the maximum value of i for every  
            # prime divisor p such that n % (p^i) == 0  
            a = n; c = 0;  
            while (a % i == 0) : 
                a //= i;  
                c += 1;  
  
            # If c + 1 is a prime number and a = 1  
            if (a == 1 and Prime(c + 1)) : 
                return True;  
  
            # The number cannot have two factors  
            # to have count of divisors prime  
            else : 
                return False;  
          
    # Else the number is prime so  
    # it has only two divisors  
    return True;  
  
# Driver code  
if __name__ == "__main__" :  
  
    n = 13;  
  
    if (primeCountDivisors(n)) : 
        print("Yes");  
    else : 
        print("No");  
  
# This code is contributed by AnkitRai01 

