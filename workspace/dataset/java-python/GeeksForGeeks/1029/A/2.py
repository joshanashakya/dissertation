

# python program to count total divisors 
# of 'a' or 'b' in a given range  
  
def __gcd(x, y): 
  
    if x > y: 
        small = y 
    else: 
        small = x 
    for i in range(1, small+1): 
        if((x % i == 0) and (y % i == 0)): 
            gcd = i 
              
    return gcd 
      
# Utility function to find LCM of two 
# numbers 
def FindLCM(a, b): 
    return (a * b) / __gcd(a, b); 
  
  
# Function to calculate all divisors in 
# given range 
def rangeDivisor(m, n, a, b): 
      
    # Find LCM of a and b 
    lcm = FindLCM(a, b) 
  
    a_divisor = int( n / a - (m - 1) / a) 
    b_divisor = int(n / b - (m - 1) / b) 
      
    # Find common divisor by using LCM 
    common_divisor =int( n / lcm - (m - 1) / lcm) 
  
    ans = a_divisor + b_divisor - common_divisor 
    return ans 
  
# Driver code 
m = 3
n = 11
a = 2
b = 3; 
print(rangeDivisor(m, n, a, b)) 
m = 11
n = 1000000
a = 6
b = 35
print(rangeDivisor(m, n, a, b)) 
  
# This code is contributed by Sam007 

