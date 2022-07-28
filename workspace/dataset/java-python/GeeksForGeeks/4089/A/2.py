

# Python3 implementation of the above approach  
  
# Recursive function to find  
# gcd using euclidean algorithm  
def gcd(a, b) :  
  
    if (a == 0) :  
        return b;  
          
    return gcd(b % a, a);  
  
# Function to find lcm  
# of two numbers using gcd  
def lcm(n, m) : 
  
    return (n * m) // gcd(n, m);  
  
  
# Driver code  
if __name__ == "__main__" :  
  
    n = 2; m = 3; k = 5;  
  
    print(k // lcm(n, m));  
  
# This code is contributed by AnkitRai01 

