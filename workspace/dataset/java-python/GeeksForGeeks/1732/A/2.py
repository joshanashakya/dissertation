

# Python3 program to calculate to find last  
# digit of above expression  
  
# Iterative Function to calculate (x^y)%p in O(log y)  
def powermod(x, y, p):  
   
    res = 1; # Initialise result  
  
    x = x % p; # Update x if it is more than or  
            # equal to p  
  
    while (y > 0): 
  
        # If y is odd, multiply x with result  
        if ((y & 1)>0):  
            res = (res * x) % p;  
  
        # y must be even now  
        y = y >> 1; # y = y/2  
        x = (x * x) % p; 
          
    return res;  
  
# Returns modulo inverse of a with respect to m  
# using extended Euclid Algorithm  
def modInverse(a, m): 
   
    m0 = m;  
    x0 = 0; 
    x1 = 1;  
  
    if (m == 1):  
        return 0;  
  
    while (a > 1):  
  
        # q is quotient  
        q = int(a / m);  
  
        t = m;  
  
        # m is remainder now, process same as  
        # Euclid's algo  
        m = a % m; 
        a = t;  
  
        t = x0;  
  
        x0 = x1 - q * x0;  
  
        x1 = t;  
  
    # Make x1 positive  
    if (x1 < 0):  
        x1 += m0;  
  
    return x1;  
  
# Function to calculate the above expression  
def evaluteExpression(n):  
   
    # Initialize the result  
    firstsum = 0; 
    mod = 10;  
  
    # Compute first part of expression 
    i=2; 
    j=0; 
    while ((1 << j) <= n):  
        firstsum = (firstsum + i) % mod; 
        i *= i; 
        j+=1; 
  
    # Compute second part of expression  
    # i.e., ((4^(n+1) - 1) / 3) mod 10  
    # Since division of 3 in modulo can't  
    # be performed directly therefore we  
    # need to find it's modulo Inverse  
    secondsum = (powermod(4, n + 1, mod) - 1) * modInverse(3, mod);  
  
    return (firstsum * secondsum) % mod;  
  
# Driver code  
  
n = 3;  
print(evaluteExpression(n));  
  
n = 10;  
print(evaluteExpression(n));  
  
# This code is contributed by mits 

