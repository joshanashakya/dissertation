

# Python3 implementation of the  
# above approach  
  
# from math lib import sqrt 
from math import sqrt 
  
# Function to store the primes  
def sieve(maxEle, prime) : 
      
    prime[0], prime[1] = 1 , 1
  
    for i in range(2, int(sqrt(maxEle)) + 1) : 
        if (not prime[i]) : 
            for j in range(2 * i , maxEle + 1, i) : 
                prime[j] = 1
      
# Function to return the sum of digits  
def digitSum(n) :  
    sum = 0
    while (n) : 
          
        sum += n % 10
        n = n // 10
    return sum
  
# Function to print additive primes 
def printAdditivePrime(arr, n): 
    maxEle = max(arr) 
    prime = [0] * (maxEle + 1) 
    sieve(maxEle, prime) 
    for i in range(n) : 
          
        # If the number is prime 
        if (prime[arr[i]] == 0): 
            sum = digitSum(arr[i]) 
              
            # Check if it's digit sum is prime 
            if (prime[sum] == 0) : 
                print(arr[i], end = " ")  
      
# Driver code  
if __name__ == "__main__" : 
    a = [ 2, 4, 6, 11, 12, 18, 7 ] 
    n = len(a) 
    printAdditivePrime(a, n)  
  
# This code is contributed by Ryuga 

