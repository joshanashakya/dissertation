

# Python3 program for Nth odd fibonaci number 
  
# Function to find nth odd fibonaci number 
def oddFib(n): 
    n = (3 * n + 1) // 2
  
    a = -1
    b = 1
    c = 0
    for i in range(1, n + 1): 
        c = a + b 
        a = b 
        b = c 
  
    return c 
  
# Driver Code 
n = 4
  
print(oddFib(n)) 
  
# This code is contributed by mohit kumar 

