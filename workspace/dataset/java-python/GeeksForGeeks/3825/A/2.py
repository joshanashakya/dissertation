

# Python3 program to find the minimum  
# value of m that satisfies ax + by = m  
# and all values after m also satisfy 
  
# Recursive function to return  
# gcd of a and b 
def __gcd(a, b): 
      
    # Everything divides 0  
    if (a == 0 or b == 0): 
        return 0; 
  
    # base case 
    if (a == b): 
        return a; 
  
    # a is greater 
    if (a > b): 
        return __gcd(a - b, b); 
    return __gcd(a, b - a); 
  
def findMin( a, b): 
      
    # If GCD is not 1, then  
    # there is no such value, 
    # else value is obtained  
    # using "a*b-a-b+1' 
    if(__gcd(a, b) == 1): 
        return (a * b - a - b + 1)  
    else: 
        return -1
  
# Driver code 
a = 4;  
b = 7; 
print(findMin(a, b)); 
      
# This code is contributed by mits 

