

# Python3 program to find  
# if two numbers are 
# equivalent or not 
import math 
  
# Function to calculate sum  
# of all proper divisors 
# num --> given natural number 
def divSum(n): 
      
    # To store sum of divisors 
    sum = 1; 
  
    # Find all divisors 
    # and add them 
    i = 2; 
    while(i * i <= n): 
        if (n % i == 0): 
            sum = (sum + i +
                   math.floor(n / i)); 
        i += 1; 
  
    return sum; 
  
# Function to check  
# if both numbers 
# are equivalent or not 
def areEquivalent(num1, num2): 
    return divSum(num1) == divSum(num2); 
  
# Driver code 
num1 = 559;  
num2 = 703; 
  
if (areEquivalent(num1, num2) == True): 
    print("Equivalent"); 
else: 
    print("Not Equivalent"); 
              
# This code is contributed by mits 

