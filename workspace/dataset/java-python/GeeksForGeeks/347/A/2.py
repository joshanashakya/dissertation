

# Python program to calculate 
# e raise to the power x 
  
# Function to calculate value 
# using sum of first n terms of  
# Taylor Series 
def exponential(n, x): 
  
    # initialize sum of series 
    sum = 1.0 
    for i in range(n, 0, -1): 
        sum = 1 + x * sum / i 
    print ("e^x =", sum) 
  
# Driver program to test above function 
n = 10
x = 1.0
exponential(n, x) 
  
# This code is contributed by Danish Raza 

