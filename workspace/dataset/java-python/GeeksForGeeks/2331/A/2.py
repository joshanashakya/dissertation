

# Python 3 implementation of the approach 
  
MAX = 1000000
prime = [True]*(MAX + 1) 
def SieveOfEratosthenes(): 
      
    # Create a boolean array "prime[0..n]" 
    # and initialize all the entries as true. 
    # A value in prime[i] will finally be false 
    # if i is Not a prime, else true. 
      
  
    # 0 and 1 are not prime numbers 
    prime[1] = False; 
    prime[0] = False; 
  
    p = 2
    while p * p <= MAX: 
  
        # If prime[p] is not changed,  
        # then it is a prime 
        if (prime[p] == True): 
  
            # Update all multiples of p 
            for i in range(p * 2, MAX+1, p): 
                prime[i] = False
        p+=1
  
# compute the answer 
def productOfKthPrimes(arr, n, k): 
  
    # count of primes 
    c = 0
  
    # product of the primes 
    product = 1
  
    # traverse the array 
    for i in range( n): 
  
        # if the number is a prime 
        if (prime[arr[i]]): 
  
            # increase the count 
            c+=1
  
            # if it is the K'th prime 
            if (c % k == 0) : 
                product *= arr[i] 
                c = 0
  
    print(product) 
  
# Driver code 
if __name__ == "__main__": 
  
    # create the sieve 
    SieveOfEratosthenes() 
  
    n = 5
    k = 2
  
    arr = [ 2, 3, 5, 7, 11 ] 
  
    productOfKthPrimes(arr, n, k) 
  
# This code is contributed by ChitraNayal 

