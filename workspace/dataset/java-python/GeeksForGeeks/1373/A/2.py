

# Python3 implementation of the approach  
from math import sqrt 
  
# Function for Sieve of Eratosthenes  
def sieve(prime, n) : 
  
    prime[0] = False;  
    prime[1] = False;  
    for p in range(2, int(sqrt(n)) + 1) : 
        if (prime[p] == True) :  
            for i in range( p * p, n + 1, p) : 
                prime[i] = False;  
  
# Function to return the sum of  
# the required prime numbers  
def sumPrime(d) : 
  
    # Maximum number of d-digits  
    maxVal = (10 ** d) - 1;  
  
    # Sieve of Eratosthenes  
    prime = [True] * (maxVal + 1);  
    sieve(prime, maxVal);  
  
    # To store the required sum  
    sum = 0;  
  
    for i in range(2, maxVal + 1) :  
  
        # If current element is prime  
        if (prime[i]) : 
            sum += i;  
  
    return sum;  
  
# Driver code  
if __name__ == "__main__" :  
  
    d = 3;  
  
    print(sumPrime(d));  
  
# This code is contributed by kanugargng 

