

# Python 3 implementation of above approach 
  
# Function to sum the digits until  
# it becomes a single digit 
def repeatedSum(n): 
    if (n == 0): 
        return 0
    return 9 if(n % 9 == 0) else (n % 9) 
  
# Function to product the digits  
# until it becomes a single digit 
def repeatedProduct(n): 
    prod = 1
  
    # Loop to do sum while 
    # sum is not less than 
    # or equal to 9 
    while (n > 0 or prod > 9) : 
        if (n == 0) : 
            n = prod 
            prod = 1
              
        prod *= n % 10
        n //= 10
      
    return prod 
  
# Function to find the maximum among 
# repeated sum and repeated product 
def maxSumProduct(N): 
  
    if (N < 10): 
        return N 
  
    return max(repeatedSum(N),  
               repeatedProduct(N)) 
  
# Driver code 
if __name__ == "__main__": 
  
    n = 631
    print(maxSumProduct(n)) 
  
# This code is contributed  
# by ChitraNayal 

