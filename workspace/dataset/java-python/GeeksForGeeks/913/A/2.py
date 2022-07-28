

# Python3 program to find  
# number of digits in 2^n 
import math 
  
# Function to find number  
# of digits in 2^n 
def countDigits(n): 
    return int(n * math.log10(2) + 1); 
  
# Driver code 
n = 5; 
print(countDigits(n)); 
  
# This code is contributed  
# by mits 

