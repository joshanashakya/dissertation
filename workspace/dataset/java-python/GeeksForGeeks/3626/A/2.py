

# Python3 implementation of the approach  
MAX = 10
  
# Function that returns true  
# if n is a Factorion  
def isFactorion(n) :  
  
    # fact[i] will store i!  
    fact = [0] * MAX
    fact[0] = 1
    for i in range(1, MAX) :  
        fact[i] = i * fact[i - 1]  
  
    # A copy of the given integer  
    org = n  
  
    # To store the sum of factorials  
    # of the digits of n  
    sum = 0
    while (n > 0) :  
  
        # Get the last digit  
        d = n % 10
  
        # Add the factorial of the current  
        # digit to the sum  
        sum += fact[d]  
  
        # Remove the last digit  
        n = n // 10
          
    if (sum == org):  
        return True
  
    return False
  
# Driver code  
n = 40585
  
if (isFactorion(n)):  
    print("Yes")  
else: 
    print("No") 
      
# This code is contributed by 
# divyamohan123 

