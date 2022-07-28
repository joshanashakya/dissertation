

# Python3 implementation of the approach 
  
# Function to return the nth 
# Fibonacci number 
def fib(n): 
    phi = ((1 + (5 ** (1 / 2))) / 2); 
    return round((phi ** n) / (5 ** (1 / 2))); 
  
# Function to return the required sum 
def calculateSum(l, r): 
      
    # To store the sum 
    sum = 0; 
  
    # Calculate the sum 
    for i in range(l, r + 1): 
        sum += fib(i); 
  
    return sum; 
  
# Driver Code 
if __name__ == '__main__': 
    l, r = 4, 8; 
    print(calculateSum(l, r)); 
  
# This code contributed by Rajput-Ji 

