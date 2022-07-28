

# Python 3 program to find N-th  
# term in the series  
  
# import sqrt method from math module 
from math import sqrt 
  
# Globally declare constant value 
MAX = 1000
  
# Function to find Nth Prime Number 
def NthPrime(n) : 
      
    count = 0
    for i in range(2, MAX + 1) : 
          
        check = 0
        for j in range(2, int(sqrt(i)) + 1) : 
              
            if i % j == 0 : 
                check = 1
                break
  
        if check == 0 : 
            count += 1
  
        if count == n : 
            return i 
            break
  
# Function to find Nth Fibonacci Number 
def NthFib(n) : 
  
    # Create a list of size n+2 
    # to store Fibonacci numbers.  
    f = [0] * (n + 2) 
  
    # 0th and 1st number of the  
    # series are 0 and 1  
    f[0], f[1] = 0, 1
  
    for i in range(2, n + 1) : 
  
        f[i] = f[i - 1] + f[i - 2] 
  
    return f[n] 
  
# Function to find N-th  
# term in the series  
def findNthTerm(n) : 
  
    # If n is even  
    if n % 2 == 0 : 
        n //= 2
        n = NthPrime(n) 
        print(n) 
  
    # If n is odd 
    else : 
        n = (n // 2) + 1
        n = NthFib(n - 1) 
        print(n) 
  
# Driver code 
if __name__ == "__main__" : 
  
    X = 5
  
    # function calling 
    findNthTerm(X) 
  
    X = 10
    findNthTerm(X) 
      
# This code is contributed by ANKITRAI1 

