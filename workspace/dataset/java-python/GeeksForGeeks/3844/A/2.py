

# Python3 implementation of the approach  
  
# Function to return the count  
# of primes in the given array  
def primeCount(arr, n):  
   
    # Find maximum value in the array  
    max_val = max(arr)  
  
    # USE SIEVE TO FIND ALL PRIME NUMBERS LESS  
    # THAN OR EQUAL TO max_val  
    # Create a boolean array "prime[0..n]". A  
    # value in prime[i] will finally be False  
    # if i is Not a prime, else True.  
    prime = [True] * (max_val+1)  
  
    # Remaining part of SIEVE  
    prime[0] = prime[1] = False
    p = 2
    while p * p <= max_val:   
  
        # If prime[p] is not changed,  
        # then it is a prime  
        if prime[p] == True:   
  
            # Update all multiples of p  
            for i in range(p * 2, max_val+1, p):  
                prime[i] = False
                  
        p += 1
           
    # Find all primes in arr[]  
    count = 0 
    for i in range(0, n):  
        if prime[arr[i]]:  
            count += 1 
  
    return count  
   
# Function to generate the prefix array  
def getPrefixArray(arr, n, pre):  
   
    # Fill the prefix array  
    pre[0] = arr[0]  
    for i in range(1, n):   
        pre[i] = pre[i - 1] + arr[i]  
  
# Driver code  
if __name__ == "__main__": 
   
    arr = [1, 4, 8, 4]   
    n = len(arr)  
  
    # Prefix array of arr[]  
    pre = [None] * n  
    getPrefixArray(arr, n, pre)  
  
    # Count of primes in the prefix array  
    print(primeCount(pre, n))  
  
# This code is contributed by Rituraj Jain 

