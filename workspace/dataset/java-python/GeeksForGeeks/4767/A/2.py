

# Python3 implementation of the approach  
from math import sqrt 
  
# check if a number is prime or not  
def isPrime(x) :  
  
    # run a loop upto square root of x  
    for i in range(2, int(sqrt(x)) + 1) : 
        if (x % i == 0) : 
            return 0;  
              
    return 1;  
  
# Function to return the minimized cost  
def minimumCost(n) : 
  
    # If n is prime  
    if (isPrime(n)) : 
        return 1;  
  
    # If n is odd and can be  
    # split into (prime + 2)  
    # then cost will be 1 + 1 = 2  
    if (n % 2 == 1 and isPrime(n - 2)) :  
        return 2;  
  
    # Every non-prime even number  
    # can be expressed as the  
    # sum of two primes  
    if (n % 2 == 0) : 
        return 2;  
  
    # n is odd so n can be split into  
    # (3 + even) further even part can be  
    # split into (prime + prime)  
    # (3 + prime + prime) will cost 3  
    return 3;  
  
# Driver code  
if __name__ == "__main__" :  
  
    n = 6;  
    print(minimumCost(n));  
      
# This code is contributed by Ryuga 

