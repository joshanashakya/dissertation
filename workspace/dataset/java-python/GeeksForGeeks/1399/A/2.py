

# Python 3 program to find nth 
# Hermite number 
from math import pow
  
# Utility function to calculate 
# double factorial of a number 
def doubleFactorial(n): 
    fact = 1
  
    for i in range(1, n + 1, 2): 
        fact = fact * i 
  
    return fact 
  
# Function to return nth Hermite number 
def hermiteNumber(n): 
      
    # If n is even then return 0 
    if (n % 2 == 1): 
        return 0
  
    # If n is odd 
    else: 
          
        # Calculate double factorial of (n-1) 
        # and multiply it with 2^(n/2) 
        number = ((pow(2, n / 2)) * 
                   doubleFactorial(n - 1)) 
  
        # If n/2 is odd then nth Hermite  
        # number will be negative 
        if ((n / 2) % 2 == 1): 
            number = number * -1
  
        # Return nth Hermite number 
        return number 
      
# Driver Code 
if __name__ == '__main__': 
    n = 6
  
    # Print nth Hermite number 
    print(int(hermiteNumber(n))) 
  
# This code is contributed by 
# Surendra_Gangwar 

