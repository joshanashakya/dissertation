

# Python 3 program to 
# find log(n) using Recursion 
  
def Log2n(n): 
  
    return 1 + Log2n(n / 2) if (n > 1) else 0
  
# Driver code 
n = 32
print(Log2n(n)) 

