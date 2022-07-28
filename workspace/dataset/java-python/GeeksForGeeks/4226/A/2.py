

# Python program to Generating numbers that are 
# divisor of their right-rotations 
  
from math import log10 
  
# Function to check if N is a 
# divisor of its right-rotation 
def rightRotationDivisor(N): 
    lastDigit = N % 10
    rightRotation = (lastDigit * 10 ** int(log10(N)) 
                    + N // 10) 
    return rightRotation % N == 0
  
# Function to generate m-digit 
# numbers which are divisor of 
# their right-rotation 
def generateNumbers(m): 
    for i in range(10 ** (m - 1), 10 ** m): 
        if rightRotationDivisor(i): 
            print(i) 
  
# Driver code 
m = 3
generateNumbers(m) 

