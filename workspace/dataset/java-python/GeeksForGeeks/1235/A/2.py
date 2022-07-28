

import math 
# Python3 implementation of above approach 
  
# Function to find the ratio 
def printRatio(a, b, c, d): 
    if (b * c > a * d): 
        swap(c, d) 
        swap(a, b) 
      
    # LCM of numerators 
    lcm = (a * c) / math.gcd(a, c) 
  
    x = lcm / a 
    b = int(b * x) 
  
    y = lcm / c 
    d = int(d * y) 
  
    # Answer in reduced form 
    k = math.gcd(b,d) 
    b =int(b / k) 
    d = int(d / k) 
  
    print(b,":",d) 
  
# Driver code 
if __name__ == '__main__': 
    a = 4
    b = 3
    c = 2
    d = 2
  
    printRatio(a, b, c, d) 
  
# This code is contributed by  
# Surendra_Gangwar 

