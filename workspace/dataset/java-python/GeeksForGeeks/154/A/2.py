

# Python3 implementation of the approach  
from math import sqrt 
  
maxSize = 10 ** 5 + 1;  
isPrime = [0] * maxSize;  
prefix = [0] * maxSize;  
  
# Function to return the  
# digit sum of num  
def digitSum(num) : 
      
    s = 0;  
    while (num != 0) : 
        s = s + num % 10;  
        num = num // 10;  
  
    return s;  
  
# Sieve Function to generate  
# all primes opto maxSize  
def sieveOfEratosthenes() : 
  
    for i in range(2, maxSize) : 
        isPrime[i] = True;  
  
    for i in range(2, int(sqrt(maxSize)) + 1) : 
        if (isPrime[i]) : 
            for j in range(i * i, maxSize, i) :  
                isPrime[j] = False;  
          
# Pre-Computation till maxSize  
# and for a given K  
def precompute(k) :  
  
    sieveOfEratosthenes();  
      
    for i in range(1, maxSize) :  
          
        # Getting Digit Sum  
        sum = digitSum(i);  
          
        # Check if the digit sum  
        # is prime and divisible by k  
        if (isPrime[sum] == True and 
                    sum % k == 0) : 
            prefix[i] += 1; 
  
    # Taking Prefix Sum  
    for i in range(1, maxSize) : 
        prefix[i] = prefix[i] + prefix[i - 1];  
  
# Function to perform the queries  
def performQueries(k, q, query) :  
  
    # Precompute the results  
    precompute(k);  
  
    for i in range(q) : 
        l = query[i][0]; r = query[i][1];  
  
        # Getting count of range in range [L, R]  
        cnt = prefix[r] - prefix[l - 1];  
        print(cnt);  
          
# Driver code  
if __name__ == "__main__" : 
  
    query = [ [ 1, 11 ],  
              [ 5, 15 ],  
              [ 2, 24 ] ];  
              
    k = 2; q = len(query);  
    performQueries(k, q, query);  
      
# This code is contributed by kanugargng 

