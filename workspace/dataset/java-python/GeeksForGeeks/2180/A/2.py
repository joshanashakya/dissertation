

from math import sqrt 
# Python 3 implementation of the approach 
  
# Function for Sieve of Eratosthenes 
def SieveOfEratosthenes(max_val): 
      
    # Create a boolean vector "prime[0..n]". A 
    # value in prime[i] will finally be false 
    # if i is Not a prime, else true. 
    prime = [True for i in range(max_val + 1)] 
  
    # Set 0 and 1 as non-primes as 
    # they don't need to be 
    # counted as prime numbers 
    prime[0] = False
    prime[1] = False
  
    for p in range(2,int(sqrt(max_val)) + 1, 1): 
          
        # If prime[p] is not changed, then 
        # it is a prime 
        if (prime[p] == True): 
              
            # Update all multiples of p 
            for i in range(p * 2,max_val+1,p): 
                prime[i] = False
  
    return prime 
  
# Function that calculates the xor 
# of k smallest and k 
# largest prime numbers in an array 
def kMinXOR(arr, n, k): 
      
    # Find maximum value in the array 
    max_val = max(arr) 
  
    # Use sieve to find all prime numbers 
    # less than or equal to max_val 
    prime = SieveOfEratosthenes(max_val) 
  
    # Max Heaps to store all the 
    # prime and composite numbers 
    maxHeapPrime = [] 
    maxHeapNonPrime = [] 
  
    for i in range(n): 
          
        # If current element is prime  
        if (prime[arr[i]]): 
  
            # Max heap will only store k elements 
            if (len(maxHeapPrime) < k): 
                maxHeapPrime.append(arr[i])  
                maxHeapPrime.sort(reverse = True) 
  
            # If the size of max heap is K and the  
            # top element is greater than the current  
            # element than it needs to be replaced  
            # by the current element as only  
            # minimum k elements are required  
            elif(maxHeapPrime[0] > arr[i]): 
                maxHeapPrime.remove(maxHeapPrime[0])  
                maxHeapPrime.append(arr[i]) 
                maxHeapPrime.sort(reverse = True) 
  
        # If current element is composite 
        elif(arr[i] != 1): 
              
            # Heap will only store k elements  
            if (len(maxHeapNonPrime) < k): 
                maxHeapNonPrime.append(arr[i]) 
                maxHeapNonPrime.sort(reverse = True)  
  
            # If the size of max heap is K and the  
            # top element is greater than the current  
            # element than it needs to be replaced  
            # by the current element as only  
            # minimum k elements are required  
            elif(maxHeapNonPrime[0] > arr[i]): 
                maxHeapNonPrime.remove(maxHeapNonPrime[0])  
                maxHeapNonPrime.append(arr[i]) 
                maxHeapNonPrime.sort(reverse = True) 
  
    primeXOR = 0
    nonPrimeXor = 0
    while (k): 
          
        # Calculate the xor 
        if (len(maxHeapPrime) > 0): 
            primeXOR ^= maxHeapPrime[0] 
            maxHeapPrime.remove(maxHeapPrime[0]) 
  
        if (len(maxHeapNonPrime) > 0): 
            nonPrimeXor ^= maxHeapNonPrime[0]; 
            maxHeapNonPrime.remove(maxHeapNonPrime[0]) 
          
        k -= 1
  
    print("Prime XOR = ",primeXOR) 
    print("Composite XOR = ",nonPrimeXor) 
  
# Driver code 
if __name__ == '__main__': 
    arr = [4, 2, 12, 13, 5, 19] 
    n = len(arr) 
    k = 3
  
    kMinXOR(arr, n, k); 
  
# This code is contributed by Surendra_Gangwar 

