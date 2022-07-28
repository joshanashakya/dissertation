

# Python 3 program to find the 
# Modulus of a Complex Number 
from math import sqrt 
  
# Function to find modulus 
# of a complex number 
def findModulo(s): 
    l = len(s) 
    modulus = 0
  
    # Storing the index of '+' 
    if ( '+' in s ): 
        i = s.index('+') 
  
    # Storing the index of '-' 
    else: 
        i = s.index('-') 
  
    # Finding the real part 
    # of the complex number 
    real = s[0:i] 
  
    # Finding the imaginary part 
    # of the complex number 
    imaginary = s[i + 1:l - 1] 
  
    x = int(real) 
    y = int(imaginary) 
  
    print(int(sqrt(x * x + y * y))) 
  
# Driver code 
if __name__ == '__main__': 
    s = "3+4i"
  
    findModulo(s) 
  
# This code is contributed by Surendra_Gangwar 

