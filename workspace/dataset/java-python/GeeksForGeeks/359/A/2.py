

# Python3 implementation of above approach  
  
# from math lib import sqrt  
# and gcd function 
from math import sqrt, gcd 
  
# Function to return the count of  
# prime factors of a number  
def countFactors(n) :  
    factors = 0;  
  
    for i in range(2, int(sqrt(n)) + 1) : 
        while (n % i == 0) :  
            n //= i  
            factors += 1
  
    if (n != 1) : 
        factors += 1
  
    return factors  
  
# Function to return the minimum number of  
# given operations required to convert A to B  
def minOperations(A, B) : 
      
    g = gcd(A, B) 
  
    # Eliminate the common  
    # factors of A and B  
    A //= g 
    B //= g 
  
    # Sum of prime factors  
    return countFactors(A) + countFactors(B)  
  
# Driver code  
if __name__ == "__main__" :  
  
    A, B = 10, 15
  
    print(minOperations(A, B)) 
  
# This code is contributed by Ryuga 

