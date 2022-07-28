

# Python3 Implementation to Compute Sum of 
# Digits of Number N in Base B 
  
# Function to compute sum of 
# Digits of Number N in base B 
def sumOfDigit(n, b): 
  
    # Initilize sum with 0 
    unitDigit = 0
    sum = 0
    while (n > 0): 
          
        # Compute unit digit of the number 
        unitDigit = n % b 
  
        # Add unit digit in sum 
        sum += unitDigit 
  
        # Update value of Number 
        n = n // b 
  
    return sum
  
# Driver code 
n = 50
b = 2
print(sumOfDigit(n, b)) 
  
# This code is contributed by ApurvaRaj 

