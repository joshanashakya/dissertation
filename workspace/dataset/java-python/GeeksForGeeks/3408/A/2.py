

# Python 3 program to count Twin 
# Prime pairs in array 
from math import sqrt 
  
# A utility function to check if 
# the number n is prime or not 
def isPrime(n): 
      
    # Base Cases 
    if (n <= 1): 
        return False
    if (n <= 3): 
        return True
  
    # Check to skip middle five 
    # numbers in below loop 
    if (n % 2 == 0 or n % 3 == 0): 
        return False
  
    for i in range(5,int(sqrt(n))+1,6): 
          
        # If n is divisible by i and i+2 
        # then it is not prime 
        if (n % i == 0 or n % (i + 2) == 0): 
            return False
  
    return True
  
# A utility function that check 
# if n1 and n2 are Twin Primes 
# or not 
def twinPrime(n1, n2): 
    return (isPrime(n1) and isPrime(n2) and abs(n1 - n2) == 2) 
  
# Function to find Twin Prime 
# pairs from the given array 
def countTwinPairs(arr, n): 
    count = 0
  
    # Iterate through all pairs 
    for i in range(n): 
        for j in range(i + 1,n): 
              
            # Increment count if 
            # twin prime pair 
            if (twinPrime(arr[i], arr[j])): 
                count += 1
  
    return count 
  
# Driver's code 
if __name__ == '__main__': 
    arr = [2, 3, 5, 11] 
    n = len(arr) 
  
    # Function call to find 
    # Twin Primes pair 
    print(countTwinPairs(arr, n)) 
  
# This code is contributed by Surendra_Gangwar 

