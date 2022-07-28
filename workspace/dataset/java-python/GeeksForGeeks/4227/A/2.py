

# Python program to Generating numbers that  
# are divisor of their right-rotations  
from math import log10 
  
# Function to generate m-digit 
# numbers which are divisor of 
# their right-rotation 
def generateNumbers(m): 
    numbers = [] 
      
    for y in range(1, 10): 
        k_max = ((10 ** (m - 2) *
                (10 * y + 1)) //
                (10 ** (m - 1) + y)) 
          
        for k in range(1, k_max + 1): 
            x = ((y * (10 ** (m - 1) - k)) 
                // (10 * k - 1)) 
              
            if ((y * (10 ** (m - 1) - k)) 
                % (10 * k - 1) == 0): 
                numbers.append(10 * x + y) 
      
    for n in sorted(numbers): 
        print(n) 
  
# Driver code 
m = 3
generateNumbers(m) 

