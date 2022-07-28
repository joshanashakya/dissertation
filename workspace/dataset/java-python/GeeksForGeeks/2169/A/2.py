

# Python3 implementation to find the number of  
# grey tiles  
  
# from math lib import gcd method 
from math import gcd 
  
# Function to count the numbe of grey tiles  
def findTileCount(x, y, l, r) : 
  
    lcm = (x * y) // gcd(x, y) 
  
    # Number multiple of lcm less than L  
    count1 = (l - 1) // lcm 
  
    # Number of multiples of lcm less than R+1  
    countr = r // lcm 
  
    return countr - count1 
  
  
  
# Driver code 
if __name__ == "__main__" : 
  
    x, y, l, r = 2, 3, 6, 18
    print(findTileCount(x, y, l, r)) 
  
# This code is contributed by  
# ANKITRAI1 

