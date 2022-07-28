

# Python 3 program to find the length of 
# Longest Prime Subsequence in an Array  
N = 100005
   
# Function to create Sieve 
# to check primes 
def SieveOfEratosthenes(prime,  p_size): 
   
    # False here indicates 
    # that it is not prime 
    prime[0] = False
    prime[1] = False
   
    p = 2
    while  p * p <= p_size: 
   
        # If prime[p] is not changed, 
        # then it is a prime 
        if (prime[p]): 
   
            # Update all multiples of p, 
            # set them to non-prime 
            for i in range( p * 2, p_size + 1, p): 
                prime[i] = False 
  
        p += 1
        
# Function to find the longest subsequence 
# which contain all prime numbers 
def longestPrimeSubsequence( arr, n): 
    prime = [True]*(N + 1) 
   
    # Precompute N primes 
    SieveOfEratosthenes(prime, N) 
   
    answer = 0
   
    # Find the length of 
    # longest prime subsequence 
    for i in range (n): 
        if (prime[arr[i]]): 
            answer += 1
   
    return answer 
   
# Driver code 
if __name__ == "__main__": 
    arr = [ 3, 4, 11, 2, 9, 21 ] 
    n = len(arr) 
   
    # Function call 
    print (longestPrimeSubsequence(arr, n)) 
  
# This code is contributed by chitranayal 

