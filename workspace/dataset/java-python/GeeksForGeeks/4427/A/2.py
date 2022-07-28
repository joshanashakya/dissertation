

# Pyhton 3 program to possible prime number 
from math import sqrt 
  
# Function to check if a  
# number is prime or not 
def Prime(n): 
    for j in range(2, int(sqrt(n)) + 1, 1): 
        if (n % j == 0): 
            return False
  
    return True
  
# Function to find possible prime number 
def find_prime(x, xsqmodp, y, ysqmodp): 
    n = x * x - xsqmodp 
    n1 = y * y - ysqmodp 
      
    # Find a possible prime number 
    for j in range(2, max(int(sqrt(n)),  
                          int(sqrt(n1))), 1): 
        if (n % j == 0 and (x * x) % j == xsqmodp and 
            n1 % j == 0 and (y * y) % j == ysqmodp): 
            if (Prime(j)): 
                return j 
                  
        j1 = n // j 
        if (n % j1 == 0 and (x * x) % j1 == xsqmodp and
            n1 % j1 == 0 and (y * y) % j1 == ysqmodp): 
            if (Prime(j1)): 
                return j1 
          
        j1 = n1 // j 
        if (n % j1 == 0 and (x * x) % j1 == xsqmodp and 
            n1 % j1 == 0 and (y * y) % j1 == ysqmodp): 
            if (Prime(j1)): 
                return j1 
      
    # Last condition 
    if (n == n1): 
        return n 
  
# Driver code 
if __name__ == '__main__': 
    x = 3
    xsqmodp = 0
    y = 5
    ysqmodp = 1
      
    # Function call 
    print(find_prime(x, xsqmodp, y, ysqmodp)) 
  
# This code is contributed by 
# Surendra_Gangwar 

