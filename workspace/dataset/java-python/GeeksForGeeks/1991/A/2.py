

# Python3 implementation of the above approacdh 
import math as mt 
  
# Function to calculate gcd of two number 
def gcd( a, b): 
  
    if (b == 0): 
        return a 
    else: 
        return gcd(b, a % b) 
  
  
# Function to check if two numbers are coprime or not 
def coPrime( n1, n2): 
  
    # two numbers are coprime if their gcd is 1 
    if (gcd(n1, n2) == 1): 
        return True
    else: 
        return False
  
  
# Function to find largest integer less 
# than or equal to N/2 and coprime with N 
def largestCoprime( N): 
  
    half = mt.floor(N / 2) 
  
    # Check one by one a numbers 
    # less than or equal to N/2 
    while (coPrime(N, half) == False): 
        half -= 1
  
    return half 
  
  
# Driver code 
  
n = 50
print( largestCoprime(n)) 
  
#This code is contributed by Mohit kumar 29 

