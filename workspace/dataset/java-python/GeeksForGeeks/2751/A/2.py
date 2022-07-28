

# Python3 implementation of the approach 
mod = 3803
d = 26
  
hash_b = 0
hash_a = [] 
mul = [] 
  
# Function to return the modular inverse 
# using Fermat's little theorem 
def mi(x): 
    global mod 
    p = mod - 2
    s = 1
    while p != 1: 
        if p % 2 == 1: 
            s = (s * x) % mod 
  
        x = (x * x) % mod 
        p //= 2
  
    return (s * x) % mod 
  
# Function to generate hash 
def genHash(a, b): 
    global hash_b, hash_a, mul, d, mod 
  
    # To store prefix-sum 
    # of rolling hash 
    hash_a = [0] * len(a) 
  
    # Multiplier for different values of i 
    mul = [0] * len(a) 
  
    # Generating hash value for string b 
    for i in range(len(b) - 1, -1, -1): 
        hash_b = (hash_b * d + 
                 (ord(b[i]) - 97)) % mod 
  
    # Generating prefix-sum of hash of a 
    mul[0] = 1
    hash_a[0] = (ord(a[0]) - 97) % mod 
    for i in range(1, len(a)): 
        mul[i] = (mul[i - 1] * d) % mod 
        hash_a[i] = (hash_a[i - 1] + mul[i] * 
                     (ord(a[i]) - 97)) % mod 
  
# Function that returns true if the 
# required sub-string in a is equal to b 
def checkEqual(i, len_a, len_b): 
    global hash_b, hash_a, mul, d, mod 
  
    # To store hash of required 
    # sub-string of A 
    x = -1
  
    # If i = 0 then 
    # requires hash value 
    if i == 0: 
        x = hash_a[len_b - 1] 
  
    # Required hash if i != 0 
    else: 
        x = (hash_a[i + len_b - 1] - 
             hash_a[i - 1] + 2 * mod) % mod 
        x = (x * mi(mul[i])) % mod 
  
    # Comparing hash with hash of B 
    if x == hash_b: 
        return True
  
    return False
  
# Driver Code 
if __name__ == "__main__": 
    a = "abababababa"
    b = "aba"
  
    # Generating hash 
    genHash(a, b) 
  
    # Queries 
    queries = [0, 1, 2, 3] 
    q = len(queries) 
  
    # Perform queries 
    for i in range(q): 
        if checkEqual(queries[i], len(a), len(b)): 
            print("Yes") 
        else: 
            print("No") 
  
# This code is contributed by 
# sanjeev2552 

