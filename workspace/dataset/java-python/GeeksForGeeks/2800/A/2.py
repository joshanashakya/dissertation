

# Python3 program to find the number of ordered 
# pairs such that a * p + b * q = N 
# where p and q are primes 
from math import sqrt 
size = 1000
prime = [0 for i in range(size)]  
freq = [0 for i in range(size)] 
  
# Sieve of erastothenes 
# to store the prime numbers 
# and their frequency in form a*p+b*q 
def sieve(a, b): 
    prime[1] = 1
  
    # Performing Sieve of Eratosthenes 
    # to find the prime numbers unto 10001 
    for i in range(2, int(sqrt(size)) + 1, 1): 
        if (prime[i] == 0): 
            for j in range(i*2, size, i): 
                prime[j] = 1
  
    # Loop to find the number of 
    # ordered pairs for every combination 
    # of the prime numbers 
    for p in range(1, size, 1): 
        for q in range(1, size, 1): 
            if (prime[p] == 0 and prime[q] == 0 and a * p + b * q < size): 
                freq[a * p + b * q] += 1
  
# Driver code 
if __name__ == '__main__': 
    queries = 2
    a = 1
    b = 2
    sieve(a, b) 
    arr = [15, 25] 
  
    # Printing the number of ordered pairs 
    # for every query 
    for i in range(queries): 
        print(freq[arr[i]],end = " ") 
  
# This code is contributed by Surendra_Gangwar 

