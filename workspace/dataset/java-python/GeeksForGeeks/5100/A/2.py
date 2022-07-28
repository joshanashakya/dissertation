

# Python3 implementation of the approach 
  
# Function to return the HCF of x and y 
def getHCF(x, y): 
  
    # Minimum of the two numbers 
    minimum = min(x, y) 
  
    # If both the numbers are divisible 
    # by the minimum of these two then 
    # the HCF is equal to the minimum 
    if (x % minimum == 0 and y % minimum == 0): 
        return minimum 
  
    # Highest number between 2 and minimum/2 
    # which can divide both the numbers 
    # is the required HCF 
    for i in range(minimum // 2, 1, -1): 
          
        # If both the numbers are divisible by i 
        if (x % i == 0 and y % i == 0): 
            return i 
  
    # 1 divides every number 
    return 1
  
# Driver code 
x, y = 16, 32
print(getHCF(x, y)) 
  
# This code is contributed by mohit kumar 

