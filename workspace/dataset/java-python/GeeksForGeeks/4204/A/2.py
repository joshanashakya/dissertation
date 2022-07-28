

# Python3 implementation of 
# above approach 
  
# from math lib import gcd method 
from math import gcd 
  
# Function to find the LCM  
def find_LCM(x, y) : 
  
    return (x * y) // gcd(x, y) 
  
# Function to count the pairs  
def CountPairs(n, m, A, B) : 
  
    cnt = 0
    lcm = find_LCM(A, B) 
  
    for i in range(1, n + 1) : 
        cnt += (m + (i % lcm)) // lcm 
  
    return cnt 
  
# Driver code      
if __name__ == "__main__" : 
  
    n, m, A, B = 60, 90, 5, 10
  
    print(CountPairs(n, m, A, B)) 
  
# This code is contributed 
# by ANKITRAI1 

