

# Python 3 program to find the sum of  
# all multiples of A and B below N 
from math import gcd,sqrt 
  
# Function to find sum of AP series 
def sumAP(n, d): 
      
    # Number of terms 
    n = int(n / d) 
  
    return (n) * (1 + n) * d / 2
  
# Function to find the sum of all 
# multiples of A and B below N 
def sumMultiples(A, B, n): 
      
    # Since, we need the sum of 
    # multiples less than N 
    n -= 1
  
    # common factors of A and B 
    common = int((A * B) / gcd(A, B)) 
  
    return (sumAP(n, A) + sumAP(n, B) - 
            sumAP(n, common)) 
  
# Driver code 
if __name__ == '__main__': 
    n = 100
    A = 5
    B = 10
  
    print("Sum =", int(sumMultiples(A, B, n))) 
  
# This code is contributed by 
# Surendra_Gangwar 

