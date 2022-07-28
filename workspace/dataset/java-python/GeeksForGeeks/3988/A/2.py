

# python Code For Smallest number  
# divisible by n and has 
# at-least k trailing zeros 
  
# Function to find gcd 
def gcd(a, b): 
      
    # Everything divides 0  
    if (a == 0 or b == 0): 
        return 0
              
    # base case 
    if (a == b): 
        return a 
              
    # a is greater 
    if (a > b): 
        return gcd(a - b, b) 
          
    return gcd(a, b - a) 
          
# Function to compute the  
# rounded value 
def getRounding(n, k): 
      
    rounding = pow(10, k); 
  
    # Computing GCD 
    result = gcd(rounding, n) 
  
    # Returning LCM (GCD * LCM 
    # = n * k) 
    return ((rounding * n) / result) 
  
# Driver Code 
  
n = 375
k = 4
  
# Function call 
print( int(getRounding(n, k))) 
  
# This code is contributed by Sam007 

