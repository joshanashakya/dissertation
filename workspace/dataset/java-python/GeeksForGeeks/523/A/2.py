

# Python 3 program to find the number  
# of primitive roots modulo prime 
from math import gcd 
  
# Function to return the count of 
# primitive roots modulo p 
def countPrimitiveRoots(p): 
    result = 1
    for i in range(2, p, 1): 
        if (gcd(i, p) == 1): 
            result += 1
  
    return result 
  
# Driver code 
if __name__ == '__main__': 
    p = 5
  
    print(countPrimitiveRoots(p - 1)) 
  
# This code is contributed by 
# Surendra_Gangwar 

