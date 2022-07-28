

# Python3 implementation of above approach  
# Function to find the ratio 
  
from fractions import gcd 
def findRatio(m,n): 
    Am = m - 5
    An = n - 5
      
    # divide numerator by gcd to get  
    # smallest fractional value  
    numerator=Am//(gcd(Am,An)) 
  
    # divide denominator by gcd to get  
    #smallest fractional value  
    denominator = An // (gcd(Am, An)) 
    print(numerator,'/',denominator) 
      
# Driver code  
# let d=1 as d doesn't affect ratio  
if __name__=='__main__': 
    m = 10
    n = 20
    findRatio(m, n) 
  
# this code is contributed by sahilshelangia 

