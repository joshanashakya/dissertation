

# Python3 program of the above approach 
   
# Calculates modular exponentiation, i.e., 
 # (x^y)%p in O(log y)  
def power( x,  y,  p): 
  
    res = 1  # Initialize result 
   
    x = x % p # Update x if it is more than or 
    # equal to p 
   
    while (y > 0) : 
   
        # If y is odd, multiply x with result 
        if (y & 1): 
            res = (res * x) % p 
   
        # y must be even now 
        y = y >> 1   # y = y/2 
        x = (x * x) % p 
      
    return res 
   
   
def gcd(a,  b): 
  
    if (a == 0): 
        return b 
    return gcd(b % a, a) 
   
# Returns GCD of a^n and b 
def powerGCD( a,  b,  n): 
  
    e = power(a, n, b) 
    return gcd(e, b) 
   
# Driver code 
if __name__ == "__main__": 
  
    a = 5
    b = 4
    n = 2
    print (powerGCD(a, b, n)) 

