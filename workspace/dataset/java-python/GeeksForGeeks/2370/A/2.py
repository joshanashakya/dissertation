

# Python3 Program to find the  
# Discount Percentage 
  
# Function to find the  
# Discount Percentage 
def discountPercentage(S, M): 
  
    # Calculating discount 
    discount = M - S 
  
    # Calculating discount percentage 
    disPercent = (discount /M) * 100
  
    return disPercent 
  
  
# Driver code 
if __name__=='__main__': 
    M = 120
    S = 100
  
    print(discountPercentage(S, M), "%") 
  
    M = 1000
    S = 500
  
    print(discountPercentage(S, M), "%") 
  
# This code is contribute  
# by ihritik 

