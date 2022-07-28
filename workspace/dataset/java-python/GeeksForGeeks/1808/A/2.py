

# Python 3 program to find if number N  
# is divisible by a number that contains  
# only a and b as it's digits 
  
# Function to check whether n is divisible  
# by a number whose digits are either a or b 
def isDivisibleRec(x, a, b, n): 
  
    # base condition 
    if (x > n): 
        return False
  
    if (n % x == 0): 
        return True
  
    # recursive call 
    return (isDivisibleRec(x * 10 + a, a, b, n) or 
            isDivisibleRec(x * 10 + b, a, b, n)) 
  
def isDivisible(a, b, n): 
  
    # Check for all numbers beginning 
    # with 'a' or 'b' 
    return (isDivisibleRec(a, a, b, n) or 
            isDivisibleRec(b, a, b, n)) 
  
# Driver Code 
a = 3; b = 5; n = 53; 
  
if (isDivisible(a, b, n)): 
    print("Yes") 
else: 
    print("No") 
  
# This code is contributed  
# by Akanksha Rai 

