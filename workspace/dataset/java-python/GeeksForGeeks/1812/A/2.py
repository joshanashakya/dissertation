

# Ptyhon3 Implementation to find Nth digit 
# from right in base B 
  
# Function to compute Nth digit 
# from right in base B 
def nthDigit(a, n, b): 
  
    # Skip N-1 Digits in Base B 
    for i in range(1, n): 
        a = a // b 
  
    # Nth Digit from right in Base B 
    return a % b 
  
# Driver Code 
a = 100
n = 3
b = 4
print(nthDigit(a, n, b)) 
  
# This code is contributed by ApurvaRaj 

