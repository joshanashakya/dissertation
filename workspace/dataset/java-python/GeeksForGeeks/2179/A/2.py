

# Python implimentation of above approach 
  
import heapq 
  
  
# Function for Sieve of Eratosthenes 
def SieveOfEratosthenes(max_val: int) -> list: 
  
    # Create a boolean vector "prime[0..n]". A 
    # value in prime[i] will finally be false 
    # if i is Not a prime, else true. 
    prime = [True] * (max_val + 1) 
  
    # Set 0 and 1 as non-primes as 
    # they don't need to be 
    # counted as prime numbers 
    prime[0] = False
    prime[1] = False
  
    p = 2
    while p * p <= max_val: 
  
        # If prime[p] is not changed, then 
        # it is a prime 
        if prime[p]: 
  
            # Update all multiples of p 
            for i in range(p * 2, max_val + 1, p): 
                prime[i] = False
        p += 1
    return prime 
  
  
# Function that calculates the xor 
# of k smallest and k 
# largest prime numbers in an array 
def kMaxXOR(arr: list, n: int, k: int): 
  
    # Find maximum value in the array 
    max_val = max(arr) 
  
    # Use sieve to find all prime numbers 
    # less than or equal to max_val 
    prime = SieveOfEratosthenes(max_val) 
  
    # Min Heaps to store the max K prime 
    # and composite numbers 
    minHeapPrime, minHeapNonPrime = [], [] 
    heapq.heapify(minHeapPrime) 
    heapq.heapify(minHeapNonPrime) 
  
    for i in range(n): 
  
        # If current element is prime 
        if prime[arr[i]]: 
  
            # Min heap will only store k elements 
            if len(minHeapPrime) < k: 
                heapq.heappush(minHeapPrime, arr[i]) 
  
            # If the size of min heap is K and the 
            # top element is smaller than the current 
            # element than it needs to be replaced 
            # by the current element as only 
            # max k elements are required 
            elif heapq.nsmallest(1, minHeapPrime)[0] < arr[i]: 
                heapq.heappop(minHeapPrime) 
                heapq.heappush(minHeapPrime, arr[i]) 
  
        # If current element is composite 
        elif arr[i] != 1: 
  
            # Heap will only store k elements 
            if len(minHeapNonPrime) < k: 
                heapq.heappush(minHeapNonPrime, arr[i]) 
  
            # If the size of min heap is K and the 
            # top element is smaller than the current 
            # element than it needs to be replaced 
            # by the current element as only 
            # max k elements are required 
            elif heapq.nsmallest(1, minHeapNonPrime)[0] < arr[i]: 
                heapq.heappop(minHeapNonPrime) 
                heapq.heappush(minHeapNonPrime, arr[i]) 
  
    primeXOR = 0
    nonPrimeXor = 0
  
    while k > 0: 
  
        # Calculate the xor 
        if len(minHeapPrime) > 0: 
            primeXOR ^= heapq.nsmallest(1, minHeapPrime)[0] 
            heapq.heappop(minHeapPrime) 
  
        if len(minHeapNonPrime) > 0: 
            nonPrimeXor ^= heapq.nsmallest(1, minHeapNonPrime)[0] 
            heapq.heappop(minHeapNonPrime) 
        k -= 1
  
    print("Prime XOR =", primeXOR) 
    print("Composite XOR =", nonPrimeXor) 
  
  
# Driver Code 
if __name__ == "__main__": 
  
    arr = [4, 2, 12, 13, 5, 19] 
    n = len(arr) 
    k = 3
    kMaxXOR(arr, n, k) 
  
# This code is contributed by 
# sanjeev2552 

