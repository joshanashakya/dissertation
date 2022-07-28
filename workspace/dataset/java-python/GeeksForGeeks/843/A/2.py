

# Python3 implementation for the above approach 
  
# Function to find factorial of a number 
def factorial(n): 
  
    if (n <= 1): 
        return 1; 
    return n * factorial(n - 1); 
  
# Function to find nCr 
def nCr(n, r): 
  
    return (factorial(n) / 
           (factorial(n - r) * factorial(r))); 
  
# Function to find the number of ways  
# to arrange 2*N persons 
def NumberOfWays(n, x, y): 
  
    return (nCr(2 * n - x - y, n - x) * 
            factorial(n) * factorial(n));  
  
# Driver code 
n, x, y = 5, 4, 2; 
  
# Function call 
print(int(NumberOfWays(n, x, y))); 
  
# This code is contributed by PrinciRaj1992 

