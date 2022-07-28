

# Python3 implementation of the approach  
MAX = 10000002
prime = [0] * (MAX)  
MAX_sqrt = int(MAX ** (0.5)) 
  
# Array to store count of primes  
prime_count = [0] * (MAX) 
  
# Function to store smallest prime 
# factor in prime[]  
def sieve():  
  
    prime[0], prime[1] = 1, 1
    for i in range(2, MAX_sqrt):  
        if prime[i] == 0:  
            for j in range(i * 2, MAX, i):  
                if prime[j] == 0:  
                    prime[j] = i  
      
    for i in range(2, MAX):  
  
        # If the number is prime then it's  
        # the smallest prime factor is the 
        # number itself  
        if prime[i] == 0: 
            prime[i] = i  
  
# Function to return the count of the divisors for  
# the product of all the numbers from the array  
def numberOfDivisorsOfProduct(arr, n):  
  
    for i in range(0, n): 
        temp = arr[i]  
        while temp != 1:  
  
            # Increase the count of prime  
            # encountered  
            prime_count[prime[temp]] += 1
            temp = temp // prime[temp]  
  
    ans = 1
  
    # Multiplying the count of primes  
    # encountered  
    for i in range(2, len(prime_count)): 
        ans = ans * (prime_count[i] + 1)  
      
    return ans  
  
# Driver code  
if __name__ == "__main__":  
  
    sieve()  
    arr = [2, 4, 6]  
    n = len(arr) 
    print(numberOfDivisorsOfProduct(arr, n))  
  
# This code is contributed by Rituraj Jain 

