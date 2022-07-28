

# Python3 program for Alcuin’s Sequence 
from math import ceil, floor 
  
# find the nth term of 
# Alcuin's sequence 
def Alcuin(n): 
  
    _n = n 
    ans = 0
  
    ans = (round((_n * _n) / 12) - 
            floor(_n / 4) * 
            floor((_n + 2) / 4)) 
  
    # return the ans 
    return ans 
  
# print first n terms of Alcuin number 
def solve(n): 
  
    for i in range(1, n + 1): 
  
        # display the number 
        print(Alcuin(i), end = ", ") 
      
# Driver code 
n = 15
solve(n) 
  
# This code is contributed by Mohit Kumar 

