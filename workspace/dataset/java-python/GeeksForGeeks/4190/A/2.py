

# Python 3 program to find the minimum  
# absolute difference between a number  
# and its closest prime 
from math import sqrt 
  
# Function to check if a number is 
# prime or not  
def isPrime(N): 
    k = int(sqrt(N)) + 1
    for i in range(2, k, 1): 
        if (N % i == 0): 
            return False
          
    return True
  
# Function to find the minimum absolute  
# difference between a number and its  
# closest prime  
def getDifference(N): 
    if (N == 0): 
        return 2
    elif (N == 1): 
        return 1
    elif (isPrime(N)): 
        return 0
  
    # Variables to store first prime  
    # above and below N  
    aboveN = -1
    belowN = -1
          
    # Finding first prime number  
    # greater than N  
    n1 = N + 1
    while (True): 
        if (isPrime(n1)): 
            aboveN = n1  
            break
              
        else: 
            n1 += 1
  
    # Finding first prime number  
    # less than N  
    n1 = N - 1
    while (True): 
        if (isPrime(n1)): 
            belowN = n1  
            break
              
        else: 
            n1 -= 1
  
    # Variables to store the differences  
    diff1 = aboveN - N 
    diff2 = N - belowN  
  
    return min(diff1, diff2) 
      
# Driver code  
if __name__ == '__main__': 
    N = 25
    print(getDifference(N)) 
  
# This code is contributed by 
# Surendra_Gangwar 

