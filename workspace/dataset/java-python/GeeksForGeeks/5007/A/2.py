

# Python3 implementation of the approach 
  
# Function to find A, B and C 
def MinimumValue(x, y): 
  
    # Keep minimum number in x 
    if (x > y): 
        x, y = y, x 
  
    # Find the numbers 
    a = 1
    b = x - 1
    c = y - b 
  
    print(a, b, c) 
  
# Driver code 
x = 123
y = 13
  
# Function call 
MinimumValue(x, y) 
  
# This code is contributed by Mohit Kumar 

