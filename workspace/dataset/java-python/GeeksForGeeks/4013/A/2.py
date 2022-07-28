

# python3 program for Babylonian  
# method for square root 
  
# Returns the square root of n. 
# Note that the function 
# will not work for numbers  
# which are not perfect squares 
  
def squareRoot(n): 
    x = n; 
    y = 1; 
    while(x > y): 
        x = (x + y) / 2; 
        y = n / x; 
    return x; 
  
# Driver Code 
n = 49; 
print("root of", n, "is", squareRoot(n)); 
  
# This code is contributed by mits. 

