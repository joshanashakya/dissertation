

# Python implementation of the approach 
import sys 
  
# Recursive function to return gcd of a and b 
def __gcd(a, b): 
      
    # Everything divides 0 
    if (a == 0): 
        return b; 
    if (b == 0): 
        return a; 
  
    # base case 
    if (a == b): 
        return a; 
  
    # a is greater 
    if (a > b): 
        return __gcd(a - b, b); 
    return __gcd(a, b - a); 
  
# Function to return the LCM of a and b 
def lcm(a, b): 
    return (a / __gcd(a, b) * b); 
  
# Function to return the minimized value 
def getMinValue(c): 
    ans = sys.maxsize; 
  
    # To find the factors 
    for i in range(1, int(pow(c, 1/2)) + 1): 
  
        # To check if i is a factor of c and 
        # the minimum possible number 
        # satisfying the given conditions 
        if (c % i == 0 and lcm(i, c / i) == c): 
  
            # Update the answer 
            ans = min(ans, max(i, c / i)); 
    return int(ans); 
  
# Driver code 
if __name__ == '__main__': 
    c = 6; 
  
    print(getMinValue(c)); 
      
# This code is contributed by 29AjayKumar 

