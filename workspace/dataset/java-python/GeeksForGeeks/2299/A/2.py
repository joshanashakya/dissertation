

# Python3 implementation of the approach 
MAX = 100000; 
prime = [True] * (MAX + 1); 
  
def SieveOfEratosthenes(): 
  
    # Create a boolean array "prime[0..n]" 
    # and initialize all the entries  
    # as true. A value in prime[i] will  
    # finally be false if i is Not a prime, 
    # else true. 
      
    # 0 and 1 are not prime numbers 
    prime[1] = False; 
    prime[0] = False; 
  
    p = 2; 
    while(p * p <= MAX): 
  
        # If prime[p] is not changed, 
        # then it is a prime 
        if (prime[p]):  
  
            # Update all multiples of p 
            i = p * 2; 
            while(i <= MAX): 
                prime[i] = False; 
                i += p; 
        p += 1; 
  
# compute the answer 
def SumOfKthPrimes(arr, n, k): 
      
    # count of primes 
    c = 0; 
  
    # sum of the primes 
    sum = 0; 
  
    # traverse the array 
    for i in range(n): 
  
        # if the number is a prime 
        if (prime[arr[i]]): 
              
            # increase the count 
            c+=1; 
  
            # if it is the K'th prime 
            if (c % k == 0):  
                sum += arr[i]; 
                c = 0; 
      
    print(sum); 
  
# Driver code 
  
# create the sieve 
SieveOfEratosthenes(); 
  
arr = [ 2, 3, 5, 7, 11 ]; 
n = len(arr); 
k = 2; 
  
SumOfKthPrimes(arr, n, k); 
  
# This code is contributed by mits 

