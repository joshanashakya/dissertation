

# python program to find if all 
# prime factors of y divide x. 
  
def gcd(a, b): 
    if(b == 0): 
        return a  
    else: 
        return gcd(b, a % b) 
      
# Returns true if all prime  
# factors of y divide x. 
def isDivisible(x,y): 
      
    if (y == 1): 
        return 1
  
    z = gcd(x, y); 
      
    if (z == 1): 
        return false; 
      
    return isDivisible(x, y / z); 
  
# Driver Code 
x = 18
y = 12
if (isDivisible(x, y)): 
    print("Yes") 
else: 
    print("No") 
  
# This code is contributed by Sam007 

