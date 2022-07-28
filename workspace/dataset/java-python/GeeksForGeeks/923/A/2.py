

# Python program to find the sum  
# and product of k smallest and  
# k largest prime numbers in an array  
import heapq 
  
def SieveOfEratosthenes(max_val): 
    # Create a boolean vector "prime[0..n]". A  
    # value in prime[i] will finally be false  
    # if i is Not a prime, else true.  
    prime = [True for i in range(max_val+1)] 
    p = 2
    while p*p <= max_val: 
        # If prime[p] is not changed, then  
        # it is a prime  
        if (prime[p] == True): 
  
            # Update all multiples of p  
            for j in range(2*p,max_val+1,p): 
                prime[j] = False
        p += 1
      
    return prime 
  
# Function that calculates the sum  
# and product of k smallest and k  
# largest prime numbers in an array  
def primeSumAndProduct(arr, n, k): 
    # Find maximum value in the array  
    max_val = max(arr) 
  
    # Use sieve to find all prime numbers  
    # less than or equal to max_val  
    prime = SieveOfEratosthenes(max_val) 
  
    # Set 0 and 1 as non-primes as  
    # they don't need to be  
    # counted as prime numbers  
    prime[0] = False
    prime[1] = False
  
    # Heap to store all the prime numbers  
    Heap = [] 
  
    # Push all the prime numbers  
    # from the array to the heaps  
    for i in range(n):  
        if (prime[arr[i]]): 
            Heap.append(arr[i])  
      
    minProduct = 1
    maxProduct = 1
    minSum = 0
    maxSum = 0
  
    min_k = heapq.nsmallest(k,Heap) 
    max_k = heapq.nlargest(k,Heap) 
  
    minSum = sum(min_k) 
    maxSum = sum(max_k) 
      
    for val in min_k: 
        minProduct *= val 
      
    for val in max_k: 
        maxProduct *= val 
      
    print("Sum of k-minimum prime numbers is", minSum)  
    print("Sum of k-maximum prime numbers is", maxSum)  
    print("Product of k-minimum prime numbers is", minProduct) 
    print("Product of k-maximum prime numbers is", maxProduct)  
  
# Driver code  
arr = [ 4, 2, 12, 13, 5, 19 ] 
n = len(arr) 
k = 3
primeSumAndProduct(arr, n, k) 
  
# This code is contributed by ankush_953 

