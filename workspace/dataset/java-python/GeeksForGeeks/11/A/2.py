

# Simple Python 3 Program to find sum of largest 
# divisible powers of P in [L, R] 
  
def sumOfDivisblePowers(L, R, P):  
  
    # Traverse through all numbers from L to R 
    res = 0
    for i in range(L, R + 1): 
      
        # If P divides current number x, add  
        # largest power of P that divides x. 
        x = i 
        while (x % P == 0): 
          
            res += 1
            x /= P 
      
    return res 
  
  
# Driver code 
L = 1
R = 10
P = 2
print(sumOfDivisblePowers(L, R, P)) 
  
# This code is contributed by Smitha Dinesh Semwal 

