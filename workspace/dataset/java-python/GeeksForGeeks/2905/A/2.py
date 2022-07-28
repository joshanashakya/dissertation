

# Python 3 implementation of the approach 
MAX = 100005; 
MOD = 1000000007
  
# Function that returns true if the num  
# contains a and b digits only 
def check(num, a, b): 
    while (num): 
        rem = num % 10
        num = int(num / 10) 
        if (rem != a and rem != b): 
            return 0
      
    return 1
  
# Modular Exponentiation 
def power(x, y): 
    ans = 1
    while (y): 
        if (y & 1): 
            ans = (ans * x) % MOD 
        y >>= 1
        x = (x * x) % MOD 
  
    return ans % MOD 
  
# Function to return the modular  
# inverse of x modulo MOD 
def modInverse(x): 
    return power(x, MOD - 2) 
  
# Function to return the required  
# count of numbers 
def countNumbers(n, a, b): 
    fact = [0 for i in range(MAX)] 
    inv = [0 for i in range(MAX)] 
    ans = 0
  
    # Generating factorials of all numbers 
    fact[0] = 1
    for i in range(1, MAX, 1): 
        fact[i] = (1 * fact[i - 1] * i) 
        fact[i] %= MOD 
  
    # Generating inverse of factorials  
    # modulo MOD of all numbers 
    inv[MAX - 1] = modInverse(fact[MAX - 1]) 
    i = MAX - 2
    while(i >= 0): 
        inv[i] = (inv[i + 1] * (i + 1)) 
        inv[i] %= MOD 
        i -= 1
  
    # Keeping a as largest number 
    if (a < b): 
        temp = a 
        a = b 
        b = temp 
  
    # Iterate over all possible values of s and 
    # if it is a valid S then proceed further 
    for s in range(n, 9 * n + 1, 1): 
        if (check(s, a, b) == 0): 
            continue
  
        # Check for invalid cases in the equation 
        if (s < n * b or (s - n * b) % (a - b) != 0): 
            continue
        numDig = int((s - n * b) / (a - b)) 
        if (numDig > n): 
            continue
  
        # Find answer using combinatorics 
        curr = fact[n] 
        curr = (curr * inv[numDig]) % MOD 
        curr = (curr * inv[n - numDig]) % MOD 
  
        # Add this result to final answer 
        ans = (ans + curr) % MOD 
  
    return ans 
  
# Driver Code 
if __name__ == '__main__': 
    n = 3
    a = 1
    b = 3
    print(countNumbers(n, a, b)) 
  
# This code is contributed by 
# Surendra_Gangwar 

