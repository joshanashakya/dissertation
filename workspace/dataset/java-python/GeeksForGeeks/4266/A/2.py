

# Python3 implementation of the approach  
def SieveOfEratosthenes():  
  
    # 0 and 1 are not prime numbers  
    prime[1] = False
    prime[0] = False
    p = 2
      
    while p * p <= MAX:  
  
        # If prime[p] is not changed,  
        # then it is a prime  
        if prime[p] == True:  
  
            # Update all multiples of p  
            for i in range(p * 2, MAX + 1, p):  
                prime[i] = False
          
        p += 1
  
# Compute the answer  
def solve(arr, n, k):  
  
    # count of primes  
    c = 0
  
    # sum of the primes  
    Sum = 0
  
    # Traverse the array  
    for i in range(0, n):  
  
        # if the number is a prime  
        if prime[arr[i]]:  
  
            # increase the count  
            c += 1
            # if it is the K'th prime  
            if c % k == 0:  
                Sum += arr[i]  
                c = 0
              
    print(Sum) 
  
# Driver code  
if __name__ == "__main__": 
  
    MAX = 1000000
    prime = [True] * (MAX + 1)  
  
    # Create the sieve  
    SieveOfEratosthenes()  
  
    n, k = 5, 2
    arr = [2, 3, 5, 7, 11]  
  
    solve(arr, n, k)  
      
# This code is contributed by Rituraj Jain 

