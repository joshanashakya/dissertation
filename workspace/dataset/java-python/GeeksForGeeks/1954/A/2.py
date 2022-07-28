

# Python3 program to implement Boole's Rule 
# on the given function 
  
# In order to represent the implementation, 
# a function f(x) = 1/(1 + x) is considered 
# in this program 
  
# Function to return the value of f(x) 
# for the given value of x 
def y(x): 
    return (1 / (1 + x)) 
  
# Function to computes the integrand of y 
# at the given intervals of x with 
# step size h and the initial limit a 
# and final limit b 
def BooleRule(a, b): 
      
    # Number of intervals 
    n = 4
  
    # Computing the step size 
    h = ((b - a) / n) 
    sum = 0
  
    # Substituing a = 0, b = 4 and h = 1 
    bl = (7 * y(a) + 32 * y(a + h) + 12 * 
        y(a + 2 * h)+32 * y(a + 3 * h)+7 * 
        y(a + 4 * h))* 2 * h / 45
  
    sum = sum + bl 
    return sum
  
# Driver code 
if __name__ == '__main__': 
    lowlimit = 0
    upplimit = 4
    print("f(x) =",round(BooleRule(0, 4),4)) 
  
# This code is contributed by Surendra_Gangwar 

