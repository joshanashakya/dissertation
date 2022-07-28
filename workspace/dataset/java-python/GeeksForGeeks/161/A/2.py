

# Python3 code to find the 
# Largest Coprime Divisor 
  
# Recursive function to return 
# gcd of a and b 
def gcd (a, b): 
      
    # Everything divides 0 
    if a == 0 or b == 0: 
        return 0
      
    # base case 
    if a == b: 
        return a 
          
    # a is greater 
    if a > b: 
        return gcd(a - b, b) 
      
    return gcd(a, b - a) 
  
# function to find largest 
# coprime divisor 
def cpFact(x, y): 
    while gcd(x, y) != 1: 
        x = x / gcd(x, y) 
    return int(x) 
      
# divisor code 
x = 15
y = 3
print(cpFact(x, y)) 
x = 14
y = 28
print(cpFact(x, y)) 
x = 7
y = 3
print(cpFact(x, y)) 
  
# This code is contributed by "Sharad_Bhardwaj". 

