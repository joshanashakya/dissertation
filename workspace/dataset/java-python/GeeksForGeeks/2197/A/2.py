

# Python3 implementation of the approach  
from math import ceil 
  
# Function to print the largest and  
# the smallest n-digit perfect cube  
def nDigitPerfectCubes(n):  
  
    # Smallest n-digit perfect cube  
    print(pow(ceil((pow(10, (n - 1))) **
                       (1 / 3)), 3), end = " ")  
  
    # Largest n-digit perfect cube  
    print(pow(ceil((pow(10, (n))) ** 
                       (1 / 3)) - 1, 3))  
  
# Driver code  
if __name__ == "__main__": 
  
    n = 3
    nDigitPerfectCubes(n)  
  
# This code is contributed by Rituraj Jain 

