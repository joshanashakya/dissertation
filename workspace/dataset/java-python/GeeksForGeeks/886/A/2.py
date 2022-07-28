

# Python3 Program to find  
# minimum value of X 
# in equation X = P * A + Q * B  
  
# Function to return gcd of a and b 
def gcd(a, b):  
    if a == 0 : 
        return b       
    return gcd(b % a, a) 
   
a = 2
b = 4
print(gcd(a, b)) 

