

# Recursive python3 program to compute modular power 
  
def exponent(A, B): 
    # Base cases 
    if (A == 0): 
        return 0; 
    if (B == 0): 
        return 1; 
  
    # If B is even 
    if (B % 2 == 0): 
        y = exponent(A, B / 2); 
        y = (y * y); 
  
    # If B is odd 
    else: 
        y = A; 
        y = (y * exponent(A, B - 1)); 
  
    return y; 
  
# Function to return sum 
def sum(k, n): 
    sum = exponent(k, n + 1) - exponent(k - 1, n + 1); 
  
    return sum; 
  
# Driver code 
n = 3; 
K = 3; 
print(sum(K, n)); 
  
# This code has been contributed by 29AjayKumar 

