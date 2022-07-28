

# Python3 implementation of the approach  
import math 
  
# Function to return the count of common factors  
# of a and b such that all the elements  
# are co-prime to one another  
def maxCommonFactors(a, b):  
      
    # GCD of a and b  
    gcd = math.gcd(a, b)  
  
    # Include 1 initially  
    ans = 1;  
  
    # Find all the prime factors of the gcd 
    i = 2
    while (i * i <= gcd):  
        if (gcd % i == 0):  
            ans += 1
            while (gcd % i == 0):  
                gcd = gcd // i 
        i += 1    
                  
    # If gcd is prime  
    if (gcd != 1):  
        ans += 1
  
    # Return the required answer  
    return ans 
      
# Driver code  
a = 12
b = 18
print(maxCommonFactors(a, b))  
  
# This code is contributed by 
# divyamohan123 

