

# Python3 implementation of the approach  
M = 1000000007
  
# Iterative function to calculate  
# (x^y)%p in O(log y)  
def power(x, y, p):  
  
    # Initialize result  
    res = 1
  
    # Update x if it is greater  
    # than or equal to p  
    x = x % p  
  
    while (y > 0) :  
  
        # If y is odd then multiply  
        # x with the result  
        if (y & 1) :  
            res = (res * x) % p  
  
        # y must be even now  
        y = y >> 1 # y = y/2  
        x = (x * x) % p  
          
    return res  
  
# Function to return n^(-1) mod p  
def modInverse(n, p) :  
  
    return power(n, p - 2, p)  
  
# Function to return (nCr % p) using  
# Fermat's little theorem  
def nCrModPFermat(n, r, p) :  
      
    # Base case  
    if (r == 0) :  
        return 1
  
    # Fill factorial array so that we  
    # can find all factorial of r, n  
    # and n-r  
    fac = [0] * (n+1)  
    fac[0] = 1
    for i in range(1, n+1) :  
        fac[i] = fac[i - 1] * i % p  
  
    return (fac[n] * modInverse(fac[r], p) % p * 
                     modInverse(fac[n - r], p) % p) % p  
  
# Function to return the count of  
# odd numbers from 1 to n  
def countOdd(n) :  
  
    x = n // 2
    if (n % 2 == 1) :  
        x += 1
    return x  
  
# Function to return the count of  
# even numbers from 1 to n  
def counteEven(n) :  
  
    x = n // 2
    return x 
  
# Function to return the count  
# of the required sequences  
def CountEvenSumSequences(n) :  
  
    count = 0
  
    for i in range(n + 1) :  
  
        # Take i even and n - i odd numbers  
        even = i 
        odd = n - i  
  
        # Number of odd numbers must be even  
        if (odd % 2 == 1) :  
            continue
  
        # Total ways of placing n - i odd  
        # numbers in the sequence of n numbers  
        tot = (power(countOdd(n), odd, M) * 
                 nCrModPFermat(n, odd, M)) % M  
        tot = (tot * power(counteEven(n), i, M)) % M  
  
        # Add this number to the final answer  
        count += tot  
        count %= M  
      
    return count  
  
# Driver code  
n = 5
print(CountEvenSumSequences(n))  
  
# This code is contributed by 
# divyamohan123 

