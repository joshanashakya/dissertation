

# Python3 implementation of the above approach 
  
# Function to calculate x^y %mod efficiently 
def power(x, y, mod): 
  
    # Initialize the answer 
    res = 1
    while (y): 
  
        # If power is odd 
        if (y & 1): 
  
            # Update the answer 
            res = (res * x) % mod 
  
        # Square the base and half the exponent 
        x = (x * x) % mod 
        y = (y >> 1) 
  
  
    # Return the value 
    return (res % mod) 
  
# Function to calculate ncr%mod efficiently 
def ncr(n, r, mod): 
  
  
    # Initialize the answer 
    res = 1
  
    # Calculate ncr in O(r) 
    for i in range(1,r+1): 
  
        # Multiply with the numerator factor 
        res = (res * (n - i + 1)) % mod 
  
        # Calculate the inverse of factor of denominator 
        inv = power(i, mod - 2, mod) 
  
        # Multiply with inverse value 
        res = (res * inv) % mod 
  
  
    # Return answer value 
    return (res%mod) 
  
# Function to return the number 
# of non intersecting chords 
def NoOfChords(A): 
  
  
    # define mod value 
    mod = 10**9 + 7
  
    # Value of C(2n, n) 
    ans = ncr(2 * A, A, mod) 
  
    # Modulo inverse of (n+1) 
    inv = power(A + 1, mod - 2, mod) 
  
    # Multiply with modulo inverse 
    ans = (ans * inv) % mod 
  
    # Return the answer 
    return (ans%mod) 
  
  
# Driver code 
  
N = 2
  
# Function call 
print(NoOfChords(N)) 
  
# This code is contributed by mohit kumar 29 

