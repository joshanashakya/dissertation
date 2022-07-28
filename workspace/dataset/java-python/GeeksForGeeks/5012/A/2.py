

# Python 3 implementation of compution 
# of arithmetic mean, geometric mean 
# and harmonic mean 
  
import math  
  
# Function to calculate arithmetic  
# mean, geometric mean and harmonic mean 
def compute( a, b) : 
    AM = (a + b) / 2
    GM = math.sqrt(a * b) 
    HM = (GM * GM) / AM 
    return HM 
  
# Driver function 
a = 5
b = 15
HM = compute(a, b) 
print("Harmonic Mean between " , a, 
      " and ", b , " is " , HM ) 
  
  
# This code is contributed by Nikita Tiwari. 

