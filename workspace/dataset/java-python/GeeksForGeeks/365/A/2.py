

# Python3 program to Implement Weedle's Rule 
  
# A sample function f(x) = 1/(1+x^2) 
def y(x): 
    num = 1; 
    denom = float(1.0 + x * x); 
  
    return num / denom; 
  
# Function to find the integral value 
# of f(x) with step size h, with 
# intial lower limit and upper limit 
# a and b 
def WeedleRule(a, b): 
      
    # Find step size h 
    h = (b - a) / 6; 
      
    # To store the final sum 
    sum = 0; 
      
    # Find sum using Weedle's Formula 
    sum = sum + (((3 * h) / 10) * (y(a) 
            + y(a + 2 * h) 
            + 5 * y(a + h) 
            + 6 * y(a + 3 * h) 
            + y(a + 4 * h) 
            + 5 * y(a + 5 * h) 
            + y(a + 6 * h))); 
  
    # Return the final sum 
    return sum; 
  
# Driver Code 
if __name__ == '__main__': 
      
    # lower limit and upper limit 
    a = 0; 
    b = 6; 
  
    # Function Call 
    num = WeedleRule(a, b); 
    print("f(x) = {0:.6f}".format(num)); 
  
# This code is contributed by sapnasingh4991 

