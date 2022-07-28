

# Python 3 program to find nth 
# term of the given series 
import math 
  
# Function to find nth term  
# of the given series 
def findNthTerm(n): 
  
    # Let us find roots of  
    # equation x * (x + 1)/2 = n 
    n = n * 2
    a = 1
    b = 1
    c = -1 * n 
    d = b * b - 4 * a * c 
    sqrt_val = math.sqrt(abs(d)) 
    x1 = (-b + sqrt_val) // (2 * a) 
    x2 = (-b - sqrt_val) // (2 * a) 
    x1 = int(x1) 
    x2 = int(x2) 
      
    # ASCII of 'a' is 97 
    if (x1 >= 1): 
        print(chr(97+x1)) 
    elif (x2 >= 1): 
        print(chr(97+x2)) 
  
# Driver Code 
if __name__ == "__main__": 
    n = 12
    findNthTerm(n) 
  
    n = 288
    findNthTerm(n) 
  
# This code is contributed 
# by ChitraNayal 

