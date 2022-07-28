

# Python3 program to compute 
# product of digits in the number. 
  
# Function to get product of digits  
def getProduct(n): 
  
    product = 1
  
    while (n != 0): 
        product = product * (n % 10) 
        n = n // 10
  
    return product 
  
# Driver Code 
n = 4513
print(getProduct(n)) 
  
# This code is contributed 
# by mohit kumar 

