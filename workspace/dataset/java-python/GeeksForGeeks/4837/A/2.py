

# Python3 program to check whether number  
# has exactly four distinct factors or not 
  
# Initialize global variable according to  
# given condition so that it can be  
# accessible to all function 
N = 1000001; 
fourDiv = [False] * (N + 1); 
  
# Function to calculate all number  
# having four distinct factors 
def fourDistinctFactors(): 
      
    # Create a boolean array "prime[0..n]"  
    # and initialize all entries it as true.  
    # A value in prime[i] will finally be  
    # false if i is not a prime, else true. 
    primeAll = [True] * (N + 1); 
    p = 2; 
  
    while (p * p <= N):  
  
        # If prime[p] is not changed, then it  
        # is a prime 
        if (primeAll[p] == True): 
  
            # Update all multiples of p 
            i = p * 2; 
            while (i <= N): 
                primeAll[i] = False; 
                i += p; 
        p += 1; 
  
    # Initialize prime[] array which will  
    # contain all the primes from 1-N 
    prime = []; 
  
    for p in range(2, N + 1): 
        if (primeAll[p]): 
            prime.append(p); 
  
    # Iterate over all the prime numbers 
    for i in range(len(prime)):  
        p = prime[i]; 
  
        # Mark cube root of prime numbers 
        if (1 * p * p * p <= N): 
            fourDiv[p * p * p] = True; 
  
        for j in range(i + 1, len(prime)): 
            q = prime[j]; 
  
            if (1 * p * q > N): 
                break; 
  
            # Mark product of prime numbers 
            fourDiv[p * q] = True; 
  
# Driver Code 
fourDistinctFactors(); 
  
num = 10; 
if (fourDiv[num]): 
    print("Yes"); 
else: 
    print("No"); 
  
num = 12; 
if (fourDiv[num]): 
    print("Yes"); 
else: 
    print("No"); 
  
# This code is contributed by mits 

