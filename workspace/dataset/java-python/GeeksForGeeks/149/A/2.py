

# Python3 implementation of the approach 
  
# Function to find the absolute difference 
# between the XOR of non-primes and the 
# XOR of primes in the given array 
def calculateDifference(arr, n): 
  
    # Find maximum value in the array 
    max_val = max(arr) 
  
    # USE SIEVE TO FIND ALL PRIME NUMBERS  
    # LESS THAN OR EQUAL TO max_val 
    # Create a boolean array "prime[0..n]".  
    # A value in prime[i] will finally be  
    # false if i is Not a prime, else true. 
    prime = [True for i in range(max_val + 1)] 
  
    # Remaining part of SIEVE 
    prime[0] = False
    prime[1] = False
    for p in range(2, max_val + 1): 
  
        if p * p > max_val + 1: 
            break
  
        # If prime[p] is not changed,  
        # then it is a prime 
        if (prime[p] == True): 
  
            # Update all multiples of p 
            for i in range(2 * p, max_val + 1, p): 
                prime[i] = False
  
    # Store the XOR of primes in X1 and 
    # the XOR of non primes in X2 
    X1 = 1
    X2 = 1
    for i in range(n): 
  
        if (prime[arr[i]]): 
  
            # The number is prime 
            X1 ^= arr[i] 
  
        elif (arr[i] != 1): 
  
            # The number is non-prime 
            X2 ^= arr[i] 
  
    # Return the absolute difference 
    return abs(X1 - X2) 
  
# Driver code 
arr = [1, 3, 5, 10, 15, 7] 
n = len(arr) 
  
# Find the absolute difference 
print(calculateDifference(arr, n)) 
  
# This code is contributed by Mohit Kumar 

