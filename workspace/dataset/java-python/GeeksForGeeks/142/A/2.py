

# Python3 implementation of the approach 
from math import factorial as fact 
  
# Function to return the count of pairs 
def countPairs(m, n): 
    ans = fact(2 * m + n-1)//(fact(n-1)*fact(2 * m)) 
    return (ans %(10**9 + 7)) 
  
# Driver code 
n, m = 5, 3
print(countPairs(m, n)) 

