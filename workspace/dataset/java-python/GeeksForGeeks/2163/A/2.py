

# Python implementation of above approach 
  
# Function taking coefficient of  
# each term of equation as input 
def sumProductDifference(a, b, c, d, e): 
  
    # Finding sum of roots 
    rootSum = (-1 * b)/a  
  
    # Finding product of roots 
    rootProduct = e / a  
  
    # Absolute difference 
    return abs(rootSum-rootProduct)  
  
print(sumProductDifference(8, 4, 6, 4, 1)) 

