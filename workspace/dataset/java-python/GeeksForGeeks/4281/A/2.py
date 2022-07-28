

# Python3 implementation of the approach  
from math import gcd 
  
# Function to return the maximum profit  
def maxProfit(n, a, b, x, y) :  
      
    res = x * (n // a);  
    res += y * (n // b);  
  
    # min(x, y) * n / lcm(a, b)  
    res -= min(x, y) * (n // ((a * b) // 
                           gcd(a, b)));  
    return res;  
  
# Driver code  
if __name__ == "__main__" :  
  
    n = 6 ;a = 6; b = 2; x = 8; y = 2;  
      
    print(maxProfit(n, a, b, x, y));  
      
# This code is contributed by Ryuga 

