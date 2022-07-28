

# Python 3 program to find number of ways to express  
# a number as sum of n-th powers of numbers. 
from math import pow, floor 
  
res = 0
def checkRecursive(num, x, k, n): 
    global res 
    if (x == 0): 
        res += 1
      
    r = floor(pow(num, (1 / n))); 
  
    for i in range(k + 1, r + 1, 1): 
        a = x - int(pow(i, n)) 
        if (a >= 0): 
            checkRecursive(num, x - int(pow(i, n)), i, n) 
    return res 
  
# Wrapper over checkRecursive() 
def check(x, n): 
    return checkRecursive(x, x, 0, n) 
  
# Driver Code 
if __name__ == '__main__': 
    print(check(10, 2)) 
          
# This code is contributed by 
# Surendra_Gangwar 

