

# Python implementation of the approach 
  
# Function that returns true if the product 
# of even positioned digits is equal to 
# the product of odd positioned digits in n 
def productEqual(n): 
    if n < 10: 
        return False
    prodOdd = 1; prodEven = 1
  
    # Take two consecutive digits 
    # at a time 
    # First digit 
    while n > 0: 
        digit = n % 10
        prodOdd *= digit 
        n = n//10
  
        # If n becomes 0 then 
        # there's no more digit 
        if n == 0: 
            break; 
        digit = n % 10
        prodEven *= digit 
        n = n//10
  
    # If the products are equal 
    if prodOdd == prodEven: 
        return True
  
    # If the products are not equal 
    return False
  
# Driver code 
n = 4324
if productEqual(n): 
    print("Yes") 
else: 
    print("No") 
  
# This code is contributed by Shrikant13 

