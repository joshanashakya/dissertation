

# Python3 implementation of the above approach 
  
# Function to calculate the 
# value of ncr effectively 
def ncr(n, r): 
  
  
    # Initializing the result 
    res = 1
  
    for i in range(1,r+1): 
  
        # Multiply and divide simultaneously 
        # to avoid overflow 
        res *= (n - r + i) 
        res //= i 
  
    # Return the answer 
    return res 
  
# Function to return the number of sequences 
# of length N such that their product is M 
def NoofSequences(N, M): 
  
    # Hashmap to store the prime factors of M 
    prime={} 
  
    # Calculate the prime factors of M 
    for i in range(2,int(M**(.5))+1): 
  
        # If i divides M it means it is a factor 
        # Divide M by i till it could be 
        # divided to store the exponent 
        while (M % i == 0): 
  
            # Increase the exponent count 
            prime[i]= prime.get(i,0)+1
            M //= i 
  
  
    # If the number is a prime number 
    # greater than sqrt(M) 
    if (M > 1): 
        prime[M] =prime.get(M,0) + 1
  
    # Initializing the ans 
    ans = 1
  
    # Multiply the answer for every prime factor 
    for it in prime: 
  
        # it.second represents the 
        # exponent of every prime factor 
        ans *= (ncr(N + prime[it] - 1, N - 1)) 
  
    # Return the result 
    return ans 
  
# Driver code 
  
N = 2
M = 6
  
print(NoofSequences(N, M)) 
  
# This code is contributed by mohit kumar 29 

