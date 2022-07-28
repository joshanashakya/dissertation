

# Python3 implementation of the approach 
  
# Vector to store the primes 
pr=[] 
  
# Create a boolean array "prime[0..n]" 
prime = [1 for i in range(10000000 + 1)] 
def sieve(n): 
  
  
    for p in range(2, n): 
  
        if p * p > n: 
            break
  
        # If prime[p] is not changed then it is a prime 
        if (prime[p] == True): 
  
            # Update amultiples of p greater than or 
            # equal to the square of it 
            # numbers which are multiple of p and are 
            # less than p^2 are already been marked 
            for i in range(2 * p, n + 1, p): 
                prime[i] = False
      
  
    # Praprime numbers 
    for p in range(2, n + 1): 
        if (prime[p]): 
            pr.append(p) 
  
  
# Function to return the semi-prime sum 
def SemiPrimeSum(N): 
  
    # Variable to store the sum of semi-primes 
    ans = 0
  
    # Iterate over the prime values 
    for i in range(len(pr)): 
  
        for j in range(i,len(pr)): 
  
            # Break the loop once the product exceeds N 
            if (pr[i] * pr[j] > N): 
                break
  
            # Add valid products which are less than 
            # or equal to N 
            # each product is a semi-prime number 
            ans += pr[i] * pr[j] 
      
    return ans 
  
# Driver code 
N = 6
  
sieve(N) 
  
print(SemiPrimeSum(N)) 
  
# This code is contributed by mohit kumar 29 

