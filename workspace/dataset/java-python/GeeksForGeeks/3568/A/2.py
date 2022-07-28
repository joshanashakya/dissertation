

# Python3 implementation of  
# the above approach  
from math import sqrt, floor 
  
# Function to find the minimum 
# no. of operations  
def minOperations( n, m) : 
  
    a = 0; k = 1;  
  
    # find the maximum of two and  
    # store it in p  
    p = max(n, m);  
  
    # increase it until it is achievable  
    # from given n and m  
    while (n != m) : 
  
        # Here value added to n and m will be  
        # S(n)=p-n+p-m;  
        # check whether integer value of n   
        # exist by the formula  
        # n=(-1+sqrt(1+8*S(n)))/2  
        s = float(p - n + p - m);  
        q = (-1 + sqrt(8 * s + 1)) / 2;  
        if (q - floor(q) == 0) : 
            a = q;  
            n = m;  
  
        p = p + 1;  
  
    return a;  
  
# Driver code  
if __name__ == "__main__" :  
  
    n = 1; m = 3;  
  
    # Function calling  
    print(minOperations(n, m));  
  
# This code is contributed by AnkitRai01 

