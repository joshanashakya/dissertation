

# Python3 program to compute 
# x^x^x^x.. %m 
  
N = 1000000
  
# Create an array to store 
# phi or totient values 
phi=[0 for i in range(N + 5)] 
  
# Function to calculate Euler 
# Totient values 
def computeTotient(): 
    # indicates not evaluated yet 
    # and initializes for product 
    # formula. 
    for i in range(1, N+1): 
        phi[i] = i 
  
    # Compute other Phi values 
    for p in range(2, N+1): 
  
        # If phi[p] is not computed already, 
        # then number p is prime 
        if (phi[p] == p): 
  
            # Phi of a prime number p is 
            # always equal to p-1. 
            phi[p] = p - 1
  
            # Update phi values of all 
            # multiples of p 
            for i in range(2*p, N+1, p): 
  
                # Add contribution of p to its 
                # multiple i by multiplying with 
                # (1 - 1/p) 
                phi[i] = (phi[i] // p) * (p - 1) 
  
  
# Iterative Function to calculate (x^y)%p in O(log y) 
def power(x, y, p): 
    res = 1 # Initialize result 
  
    x = x % p # Update x if it is more than or 
    # equal to p 
  
    while (y > 0): 
  
        # If y is odd, multiply x with result 
        if (y & 1): 
            res = (res * x) % p 
  
        # y must be even now 
        y = y >> 1 # y = y/2 
        x = (x * x) % p 
  
    return res 
  
  
# Function to calculate 
# (x^x^x^x...k times)%m 
def calculate(x, k,mod): 
    # to store different mod values 
    arr=[0 for i in range(N)] 
  
    count = 0
  
    while (mod > 1): 
        arr[count] = mod 
        count+=1
        mod = phi[mod] 
  
    result = 1
    loop = count + 1
    arr[count] = 1
  
    # run loop in reverse to calculate 
    # result 
    for i in range(min(k,loop),-1,-1): 
        result = power(x, result, arr[i]) 
  
    return result 
  
# Driver Code 
  
# compute euler totient function values 
computeTotient() 
  
x = 3
k = 2
m = 3
  
# Calling function to compute answer 
print(calculate(x, k, m)) 
  
# This code is contributed by mohit kumar 29 

