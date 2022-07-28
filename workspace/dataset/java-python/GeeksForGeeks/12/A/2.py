

# Efficient Python 3 Program to find sum of  
# largest divisible powers of P in [L, R] 
  
# Implements Lagrange's theorem (Finds largest 
# power of P that divides x! 
def largestPower(x, P): 
  
    # Calculate x/p + x/(p^2) + x/(p^3) + .... 
    res = 0
    while (x): 
      
        x = int(x / P) 
        res += x 
      
    return res 
  
  
# Returns sum of largest powers of P that divide 
# numbers in range from L to R. 
def sumOfDivisblePowers( L, R, P) : 
    return largestPower(R, P) - largestPower(L-1, P) 
  
  
# Driver code 
L = 1
R = 10
P = 2
print(sumOfDivisblePowers(L, R, P)) 
  
# This code is contributed by Smitha Dinesh Semwal 

