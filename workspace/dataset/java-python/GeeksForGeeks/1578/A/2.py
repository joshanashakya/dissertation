

# Recursive function to return gcd of a and b 
def gcd(a,b): 
      
    # Everything divides 0  
    if (a == 0 or b == 0): 
            False
    # base case 
    if (a == b): 
        return a 
  
    # a is greater 
    if (a > b): 
        return gcd(a-b, b) 
    return gcd(a, b-a) 
  
# Driver program to test above function 
a = 98
b = 56
if(gcd(a, b)): 
    print('GCD of', a, 'and', b, 'is', gcd(a, b)) 
else: 
    print('not found') 
  
# This code is contributed by Danish Raza 
