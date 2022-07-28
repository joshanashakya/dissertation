

# Python3 implementation of the 
# above approach 
import math 
  
# Function to return the minimum  
# difference between N and a power of 2 
def minAbsDiff(n): 
      
    # Power of 2 closest to n on its left 
    left = 1 << (int)(math.floor(math.log2(n))) 
  
    # Power of 2 closest to n on its right 
    right = left * 2
  
    # Return the minimum abs difference 
    return min((n - left), (right - n)) 
  
# Driver code 
if __name__ == "__main__": 
    n = 15
    print(minAbsDiff(n)) 
  
# This code is contributed  
# by 29AjayKumar 

