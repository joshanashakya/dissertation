

# Python3 implementation of the approach 
import math 
  
# Function to return the required gcd  
def max_gcd(n, p):  
  
    count = 0;  
    gcd = 1;  
  
    # Count the number of times 2 divides p  
    while (p % 2 == 0):  
      
        # Equivalent to p = p / 2;  
        p >>= 1;  
        count = count + 1;  
      
    # If 2 divides p  
    if (count > 0):  
        gcd = gcd * pow(2, count // n);  
  
    # Check all the possible numbers  
    # that can divide p  
    for i in range(3, (int)(math.sqrt(p)), 2):  
      
        count = 0;  
        while (p % i == 0):  
          
            count = count + 1;  
            p = p // i;  
          
        if (count > 0): 
          
            gcd = gcd * pow(i, count // n);  
          
    # If n in the end is a prime number  
    if (p > 2) :  
        gcd = gcd * pow(p, 1 // n);  
  
    # Return the required gcd  
    return gcd;  
  
# Driver code  
n = 3;  
p = 80;  
print(max_gcd(n, p));  
  
# This code is contributed by Shivi_Aggarwal 

