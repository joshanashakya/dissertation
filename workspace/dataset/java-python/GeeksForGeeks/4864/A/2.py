

# Python3 implementation of the  
# above approach  
N = 1000005
  
# To check if a number is prime or not 
prime = [True for i in range(N)] 
  
# Sieve of Eratosthenes 
# function to find all prime numbers 
def sieve(): 
    prime[1] = False
    prime[0] = False
  
    for i in range(2, N): 
        if (prime[i]==True): 
            for j in range(i * 2, N, i): 
                prime[j] = False
  
# Function to return the sum of 
# all truncatable primes below n 
def sumTruncatablePrimes(n): 
  
    # To store the required sum 
    sum = 0
  
    # Check every number below n 
    for i in range(2, n): 
  
        num = i 
        flag = True
  
        # Check from right to left 
        while (num): 
  
            # If number is not prime at any stage 
            if (prime[num] == False): 
                flag = False
                break
  
            num //= 10
  
        num = i 
        power = 10
  
        # Check from left to right 
        while (num // power): 
  
            # If number is not prime at any stage 
            if (prime[num % power] == False): 
                flag = False
                break
  
            power *= 10
  
        # If flag is still true 
        if (flag==True): 
            sum += i 
  
    # Return the required sum 
    return sum
  
# Driver code 
n = 25
sieve() 
print(sumTruncatablePrimes(n)) 
  
# This code is contributed by mohit kumar 

