

# Python 3 program to find maximum  
# differences between two prime numbers  
# in given ranges 
from math import sqrt 
  
MAX = 100005
  
# Precompute Sieve, Prefix array, Suffix array 
def precompute(prefix, suffix): 
    prime = [True for i in range(MAX)] 
  
    # Sieve of Eratosthenes 
    k = int(sqrt(MAX)) 
    for i in range(2, k, 1): 
        if (prime[i]): 
            for j in range(i + i, MAX, i): 
                prime[j] = False
  
    prefix[1] = 1
    suffix[MAX - 1] = int(1e9 + 7) 
  
    # Precomputing Prefix array. 
    for i in range(2, MAX, 1): 
        if (prime[i]): 
            prefix[i] = i 
        else: 
            prefix[i] = prefix[i - 1] 
      
    # Precompute Suffix array. 
    i = MAX - 2
    while(i > 1): 
        if (prime[i]): 
            suffix[i] = i 
        else: 
            suffix[i] = suffix[i + 1] 
        i -= 1
  
# Function to solve each query 
def query(prefix, suffix, L, R): 
    if (prefix[R] < L or suffix[L] > R): 
        return 0
    else: 
        return prefix[R] - suffix[L] 
  
# Driver Code 
if __name__ == '__main__': 
    q = 3
    L = [2, 2, 24]  
    R = [5, 2, 28] 
  
    prefix = [ 0 for i in range(MAX)] 
    suffix = [ 0 for i in range(MAX)] 
    precompute(prefix, suffix) 
  
    for i in range(0, q, 1): 
        print(query(prefix, suffix,  
                        L[i], R[i])) 
  
# This code is contributed by 
# Surendra_Gangwar 

