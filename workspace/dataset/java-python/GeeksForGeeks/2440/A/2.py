

# Python program to count natural 
# numbers whose factorials are  
# divisible by x but not y. 
  
# GCD function to compute the greatest 
# divisor among a and b 
def gcd(a, b): 
      
    if ((a % b) == 0): 
        return b 
      
    return gcd(b, a % b) 
  
# Returns first number whose factorial 
# is divisible by x. 
def firstFactorialDivisibleNumber(x): 
      
    # Result 
    i = 1 
    new_x = x 
      
    for i in range(1, x): 
          
        # Remove common factors 
        new_x /= gcd(i, new_x) 
  
        # We found first i. 
        if (new_x == 1): 
            break
          
    return i 
  
# Count of natural numbers whose  
# factorials are divisible by x but 
# not y. 
def countFactorialXNotY(x, y): 
  
    # Return difference between first  
    # natural number whose factorial  
    # is divisible by y and first  
    # natural number whose factorial 
    # is divisible by x. 
    return (firstFactorialDivisibleNumber(y) -
            firstFactorialDivisibleNumber(x)) 
              
# Driver code 
x = 15
y = 25
  
print(countFactorialXNotY(x, y)) 
  
# This code is contributed by Anant Agarwal. 

