

# Python3 program to change value of x 
# according to its current value. 
  
# Function to alternate the values 
def alternate(a, b, x): 
    x = a ^ b ^ x 
    print("After exchange") 
    print("x is", x) 
  
# Driver code 
a = -10
b = 15
x = a 
print("x is", x) 
alternate(a, b, x) 
  
# This code is contributed  
# by Shrikant13 

