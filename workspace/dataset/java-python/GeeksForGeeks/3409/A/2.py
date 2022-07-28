

# Python 3 program to count Twin 
# Prime pairs in array 
  
# A utility function that find 
# the Prime Numbers till N 
def computePrime( N): 
  
    # Resize the Prime Number 
    Prime = [True]*(N + 1) 
    Prime[0] = False
    Prime[1] = False
  
    # Loop till sqrt(N) to find 
    # prime numbers and make their 
    # multiple false in the bool 
    # array Prime 
    i = 2
    while i * i <= N: 
        if (Prime[i]): 
            for j in range( i * i, N, i): 
                Prime[j] = False
        i += 1
  
    return Prime 
  
# Function that returns the count 
# of Twin Prime Pairs 
def countTwinPairs(arr, n): 
  
    # Find the maximum element in 
    # the given array arr[] 
    maxE = max(arr) 
  
    # Function to calculate the 
    # prime numbers till N 
    Prime = computePrime(maxE) 
  
    # To store the count of pairs 
    count = 0
  
    # To store the frequency of 
    # element in the array arr[] 
    freq = [0]*(maxE + 2) 
  
    for i in range( n): 
        freq[arr[i]] += 1
  
    # Sort before traversing the array 
    arr.sort() 
  
    # Traverse the array and find 
    # the pairs with Twin Primes 
    for i in range(n): 
  
        # If current element is 
        # Prime, then check for 
        # (current element + 2) 
        if (Prime[arr[i]]): 
            if ((arr[i] + 2) <= (maxE) and freq[arr[i] + 2] > 0
                and Prime[arr[i] + 2]): 
                count += 1
  
    # Return the count of pairs 
    return count 
  
# Driver's code 
if __name__ == "__main__": 
      
    arr = [ 2, 4, 3, 5, 7 ] 
    n = len(arr) 
  
    # Function call to find 
    # Twin Primes pair 
    print( countTwinPairs(arr, n)) 
      
# This code is contributed by chitranayal 

