

# Python3 implementation of the  
# above approach 
  
# Function to find the element 
def findThirdDigit(n): 
  
    # if n < 3 
    if n < 3: 
        return 0
  
    # If n is even return 6 
    # If n is odd return 1 
    return 1 if n and 1 else 6
  
# Driver code 
n = 7
print(findThirdDigit(n)) 
  
# This code is contributed  
# by Shrikant13 

