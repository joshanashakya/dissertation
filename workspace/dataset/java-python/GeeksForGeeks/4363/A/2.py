

# Python 3 code for above 
# program to find product 
# under modulo. 
  
MOD = 1000000007
  
def product(ar, n): 
  
    result = 1
    for i in range(0, n): 
        result = (result * ar[i]) % MOD 
    return result 
  
  
# driver code for the 
# above program 
ar = [1, 2, 3, 4, 5]  
n = len(ar)  
  
print(product(ar, n)) 
  
# This code is contributed by 
# Smitha Dinesh Semwal 

