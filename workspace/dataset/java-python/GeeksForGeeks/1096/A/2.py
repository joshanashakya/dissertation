

# Python3 implementation of the approach 
import math 
  
# Function to print the largest and 
# the smallest n-digit perfect squares 
def nDigitPerfectSquares(n): 
  
    # Smallest n-digit perfect square 
    print(pow(math.ceil(math.sqrt(pow(10, n - 1))), 2),  
                                            end = " "); 
  
    # Largest n-digit perfect square 
    print(pow(math.ceil(math.sqrt(pow(10, n))) - 1, 2)); 
  
# Driver code 
n = 4; 
nDigitPerfectSquares(n); 
  
# This code is contributed by mits 

