

# Recursive Python 3 program to  
# implement Stein's Algorithm 
  
# Function to implement  
# Stein's Algorithm 
def gcd(a, b) : 
      
    if (a == b) : 
        return a 
  
    # GCD(0, b) == b; GCD(a, 0) == a,  
    # GCD(0, 0) == 0  
    if (a == 0) : 
        return b 
  
    if (b == 0) : 
        return a 
  
    # look for factors of 2 
    # a is even 
    if ((~a & 1)== 1 ) :      
          
        # b is odd 
        if ((b & 1)== 1) :      
            return gcd(a >> 1, b) 
        else : 
            # both a and b are even 
            return (gcd(a >> 1, b >> 1) << 1) 
      
    # a is odd, b is even 
    if ((~b & 1)== 1) :  
        return gcd(a, b >> 1) 
  
    # reduce larger number 
    if (a > b) : 
        return gcd((a - b) >> 1, b) 
  
    return gcd((b - a) >> 1, a) 
  
# Driver code 
a, b = 34, 17
print("Gcd of given numbers is ",  
                       gcd(a, b)) 
  
# This code is contributed  
# by Nikita Tiwari. 

