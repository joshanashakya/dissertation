

# Python3 Program to check Primorial Prime  
  
# from math lib import sqrt method 
from math import sqrt 
  
MAX = 100000
  
# Create a boolean array "prime[0..n]"  
# and initialize make all entries of  
# boolean array 'prime' as true.  
# A value in prime[i] will finally be  
# false if i is Not a prime, else true.  
prime = [True] * MAX
  
arr = [] 
  
# Utility function to generate 
# prime numbers  
def SieveOfEratosthenes() : 
  
    for p in range(2, int(sqrt(MAX)) + 1) : 
  
        # If prime[p] is not changed,  
        # then it is a prime  
        if prime[p] == True : 
  
            # Update all multiples of p  
            for i in range(p * 2 , MAX, p) : 
                prime[i] = False
  
    # store all prime numbers  
    # to list 'arr'  
    for p in range(2, MAX) : 
  
        if prime[p] : 
            arr.append(p) 
      
# Function to check the number  
# for Primorial prime  
def isPrimorialPrime(n) : 
  
    # If n is not prime Number  
    # return flase  
    if not prime[n] : 
        return False
  
    product, i = 1, 0
  
    # Multiply next prime number  
    # and check if product + 1 = n  
    # or Product-1 = n holds or not  
    while product < n : 
  
        product *= arr[i] 
  
        if product + 1 == n or product - 1 == n : 
            return True
  
        i += 1
  
    return False
  
# Driver code 
if __name__ == "__main__" : 
      
    SieveOfEratosthenes() 
      
    n = 31
  
    # Check if n is Primorial Prime  
    if (isPrimorialPrime(n)) : 
        print("YES")  
    else : 
        print("NO")  
      
# This code is contributed by ANKITRAI1 

