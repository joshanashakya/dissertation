

# Python 3 program to find sum of proper  
# divisor of factorial of a number  
  
# function to calculate factorial  
def fact(n): 
      
    if (n == 0): 
        return 1
    return n * fact(n - 1) 
  
# function to calculate sum  
# of divisor  
def div(x): 
    ans = 0; 
    for i in range(1, x + 1): 
        if (x % i == 0): 
            ans += i 
    return ans 
  
# Returns sum of divisors of n!  
def sumFactDiv(n): 
    return div(fact(n)) 
  
# Driver Code 
n = 4
print(sumFactDiv(n)) 
  
# This code is contributed 
# by Rajput-Ji 

