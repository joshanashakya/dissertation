

# Python3 implementation of the approach 
  
# Function to return the prime subset  
# product of the given array 
def product(A): 
      
    # Create Sieve to check whether a  
    # number is prime or not 
    N = 100010
    mod = 1000000007
    prime = [1] * N 
    prime[0] = prime[1] = 0
    i = 2
    while i * i < N: 
        if prime[i]: 
            for j in range(i * i, N, i): 
                prime[j] = 0
          
        i += 1
      
    # Length of the array 
    n = len(A) 
      
    # Calculating 2^(n-1) % mod 
    t = pow(2, n-1, mod-1) 
      
    ans = 1
      
    for i in A: 
          
        # If element is prime then add 
        # its contribution in the result 
        if prime[i]: 
            ans *= pow(i, t, mod) 
            ans %= mod 
              
    return ans 
      
# Driver code 
A = [3, 7] 
print(product(A)) 

