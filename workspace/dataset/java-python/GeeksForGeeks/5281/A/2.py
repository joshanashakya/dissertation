

# Python3 program to find  
# GCD of a^n and b. 
  
# Iterative Function to 
# calculate (x^y)%p in O(log y)  
def modPower(x, y, p): 
  
    res = 1 # Initialize result 
  
    x = x % p # Update x if it is more  
              # than or equal to p 
  
    while (y > 0): 
      
        # If y is odd, multiply  
        # x with result 
        if (y & 1): 
            res = (res * x) % p 
  
        # y must be even now 
        y = y >> 1 # y = y/2 
        x = (x * x) % p 
      
    return res 
  
# Finds GCD of a and b 
def gcd(a, b): 
  
    if (b == 0): 
        return a 
    return gcd(b, a % b) 
  
# Finds GCD of a^n and c 
def gcdPow(a, n, c): 
  
    # check if c is a divisor of a 
    if (a % c == 0): 
        return c 
  
    # First compute (a^n) % c 
    modexpo = modPower(a, n, c) 
  
    # Now simply return GCD of  
    # modulo power and c. 
    return gcd(modexpo, c) 
  
# Driver code 
if __name__ == "__main__": 
    a = 10248585
    n = 1000000
    c = 12564
    print(gcdPow(a, n, c)) 
  
# This code is contributed  
# by ChitraNayal  

