

# Python3 implementation of the approach  
from math import sqrt 
  
N = 100000;  
  
# Create a boolean array "prime[0..n]" and  
# initialize all entries it as true.  
# A value in prime[i] will finally be 0 if 
# i is Not a prime, else true.  
# prime[i] stores 1 if i is prime  
prime = [1] * N;  
  
# divi[i] stores the count of  
# divisors of i  
divi = [0] * N;  
  
# sum[i] will store the sum of all  
# the integers from 0 to i whose  
# count of divisors is prime  
sum = [0] * N;  
  
# Function for Sieve of Eratosthenes  
def SieveOfEratosthenes() : 
  
    for i in range(N) : 
        prime[i] = 1;  
  
    # 0 and 1 is not prime  
    prime[0] = prime[1] = 0;  
  
    for p in range(2, int(sqrt(N)) + 1) :  
  
        # If prime[p] is not changed,  
        # then it is a prime  
        if (prime[p] == 1) : 
  
            # Update all multiples of p greater than or  
            # equal to the square of it  
            # numbers which are multiple of p and are  
            # less than p^2 are already been marked.  
            for i in range(p * p, N, p) : 
                prime[i] = 0;  
  
# Function to count the divisors  
def DivisorCount() : 
  
    # For each number i we will go to each of  
    # the multiple of i and update the count  
    # of divisor of its multiple j as i is one  
    # of the factor of j  
    for i in range(1, N) : 
        for j in range(i, N , i) : 
            divi[j] += 1;  
  
# Function for pre-computation  
def pre() : 
  
    for i in range(1, N) : 
  
        # If count of divisors of i is prime  
        if (prime[divi[i]] == 1) : 
            sum[i] = i;  
  
    # taking prefix sum  
    for i in range(1, N) :  
        sum[i] += sum[i - 1];  
  
# Driver code  
if __name__ == "__main__" :  
  
    l = 5; r = 8;  
  
    # Find all the prime numbers till N  
    SieveOfEratosthenes();  
  
    # Update the count of divisors  
    # of all the numbers till N  
    DivisorCount();  
  
    # Precomputation for the prefix sum array  
    pre();  
  
    # Perform query  
    print(sum[r] - sum[l - 1]);  
  
# This code is contributed by AnkitRai01 

