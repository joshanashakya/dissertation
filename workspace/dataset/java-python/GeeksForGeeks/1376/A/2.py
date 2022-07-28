

# Python3 implementation of the approach  
from math import sqrt 
  
MAX = 100000
  
# Create a boolean array "prime[0..n]" and  
# initialize all entries it as true.  
# A value in prime[i] will finally be false  
# if i is Not a prime, else true.  
prime = [True] * (MAX + 1) 
  
def SieveOfEratosthenes() :  
  
    for p in range(2, int(sqrt(MAX)) + 1) :  
  
        # If prime[p] is not changed, 
        # then it is a prime  
        if (prime[p] == True) : 
  
            # Update all multiples of p greater than or  
            # equal to the square of it  
            # numbers which are multiple of p and are  
            # less than p^2 are already been marked.  
            for i in range(p * p, MAX + 1, p) : 
                prime[i] = False;  
  
# Function to return the smallest prime  
# number with d digits  
def smallestPrime(d) :  
  
    l = 10 ** (d - 1);  
    r = (10 ** d) - 1;  
    for i in range(l, r + 1) :  
  
        # check if prime  
        if (prime[i]) : 
            return i;  
  
    return -1;  
  
# Function to return the largest prime  
# number with d digits  
def largestPrime(d) :  
  
    l = 10 ** (d - 1);  
    r = (10 ** d) - 1;  
    for i in range(r, l , -1) : 
  
        # check if prime  
        if (prime[i]) : 
            return i;  
              
    return -1;  
  
# Driver code  
if __name__ == "__main__" :  
  
    SieveOfEratosthenes();  
  
    queries = [ 2, 5 ];  
    q = len(queries);  
  
    # Perform queries  
    for i in range(q) : 
        print(smallestPrime(queries[i]), " ", 
              largestPrime(queries[i]));  
  
# This code is contributed by AnkitRai01 

