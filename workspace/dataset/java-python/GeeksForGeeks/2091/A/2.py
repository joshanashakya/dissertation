

# Python3 implementation of the approach  
from math import sqrt 
  
MAX = 1000000
  
# Create a boolean array "prime[0..n]" and  
# initialize all entries it as true.  
# A value in prime[i] will finally be false  
# if i is Not a prime, else true.  
prime = [True] * MAX
  
# Function for Sieve of Eratosthenes  
def SieveOfEratosthenes() : 
  
    for p in range(2, int(sqrt(MAX)) + 1) :  
  
        # If prime[p] is not changed 
        # then it is a prime  
        if (prime[p]) : 
  
            # Update all multiples of p greater than or  
            # equal to the square of it  
            # numbers which are multiple of p and are  
            # less than p^2 are already been marked.  
            for i in range(p * p, MAX, p) : 
                prime[i] = False;  
  
# Function to return the sum of  
# primes in the Kth array  
def sumPrime(k) :  
  
    # Update vector v to store all the  
    # prime numbers upto MAX  
    SieveOfEratosthenes();  
    v = [];  
    for i in range(2, MAX) : 
        if (prime[i]) : 
            v.append(i);  
  
    # To store the sum of primes  
    # in the kth array  
    sum = 0;  
  
    # Count of primes which are in  
    # the arrays from 1 to k - 1  
    skip = (k * (k - 1)) // 2;  
  
    # k is the number of primes  
    # in the kth array  
    while (k > 0) : 
        sum += v[skip];  
        skip += 1;  
  
        # A prime has been  
        # added to the sum  
        k -= 1;  
  
    return sum;  
  
# Driver code  
if __name__ == "__main__" : 
      
    k = 3; 
      
    print(sumPrime(k));  
  
# This code is contributed by AnkitRai01 

