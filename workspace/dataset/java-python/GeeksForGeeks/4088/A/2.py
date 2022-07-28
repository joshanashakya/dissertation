

# Python3 implementation of the approach 
  
# Function to print the count of 
# a, b and c after n seconds 
import math 
def findCount(n): 
    a, b, c = 1, 0, 0; 
  
    # Number of multiples of 60 below n 
    x = (int)(n / 60); 
    a = int(math.pow(32, x)); 
  
    # Multiple of 60 nearest to n 
    x = 60 * x; 
  
    for i in range(x + 1, n + 1): 
  
        # Change all a to b 
        if (i % 2 == 0): 
            b += a; 
            a = 0; 
  
        # Change all b to c 
        if (i % 5 == 0): 
            c += b; 
            b = 0; 
  
        # Change each c to two a 
        if (i % 12 == 0): 
            a += (2 * c); 
            c = 0; 
  
    # Print the updated values of a, b and c 
    print("a =", a, end = ", "); 
    print("b =", b, end = ", "); 
    print("c =", c); 
      
# Driver code 
if __name__ == '__main__': 
    n = 72; 
    findCount(n); 
  
# This code is contributed  
# by 29AjayKumar 

