

# Python3 implementation of the approach 
MAX = 10005; 
  
# To store the smallest prime factor 
spf = [0] * MAX; 
  
# Function to store spf of integers 
def sieve(): 
  
    spf[0] = 1; 
  
    # When gcd is 1 then the answer is -1 
    spf[1] = -1; 
    i = 2; 
    while (i * i < MAX): 
        if (spf[i] == 0): 
            for j in range(i * 2, MAX, i):  
                if (spf[j] == 0): 
                    spf[j] = i; 
        i += 1; 
      
    for i in range(2, MAX): 
        if (spf[i] == 0): 
            spf[i] = i; 
  
# find gcd of two no 
def __gcd(a, b):  
    if (b == 0):  
        return a;  
    return __gcd(b, a % b);  
  
# Function to return smallest possible integer 
# which divides the whole array 
def smallestInteger(arr, n): 
      
    # To store the GCD of all the array elements 
    gcd = 0; 
    for i in range(n): 
        gcd = __gcd(gcd, arr[i]); 
  
    # Return the smallest prime factor 
    # of the gcd calculated 
    return spf[gcd]; 
  
# Driver code 
sieve(); 
arr = [ 2, 4, 8 ]; 
n = len(arr); 
print(smallestInteger(arr, n)); 
  
# This code is contributed by mits 

