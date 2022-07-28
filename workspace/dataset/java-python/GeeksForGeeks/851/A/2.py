

# Python 3 program to implement above approach 
  
# Function to compute the number of combination 
# of r objects out of n objects. 
# nCr(n, n) = 1, nCr(n, 0) = 1, and these are 
# the base cases. 
  
def nCr(n, r): 
    if(n == r): 
        return 1
    if(r == 0): 
        return 1
    # nCr(n, r) = nCr(n - 1, r - 1) + nCr(n - 1, r) 
    return nCr(n - 1, r - 1) + nCr(n - 1, r) 
      
# This function is used to calculate the  
# factorial of a number n.  
def factorial(n): 
    res = 1
      
    # 1 ! = 0 ! = 1 
    if(n <= 1): 
        return res 
    for i in range(1, n + 1): 
        res *= i 
    return res 
      
# Main function to calculate the Stirling numbers. 
# the base cases which were discussed above are 
# handled to stop the recursive call, n can't be 
# more than r, s(r, 0) = 0. 
# s(r, r) = 1. s(r, 1) = (r - 1)!. 
# s(r, r - 1) = nCr(r, 2) 
# else as we proved, s(r, n) = s(r - 1, n - 1)  
# + (r - 1) * s(r - 1, n)  
  
def stirlingNumber(r, n): 
    if(r == n): 
        return 1
    if(n == 0): 
        return 0
    if(n == r -1): 
        return nCr(r, 2) 
    if(r - n == 1): 
        return factorial(r - 1) 
    return (stirlingNumber(r - 1, n - 1)  
        + (r - 1) * stirlingNumber(r - 1, n)) 
          
r, n = 9, 2
  
print(stirlingNumber(r, n)) 

