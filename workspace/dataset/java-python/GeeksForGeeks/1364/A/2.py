

# Python3 program to find the  
# number of digits in a factorial 
import math 
  
# This function receives an integer  
# n, and returns the number of 
# digits present in n! 
  
def findDigits(n): 
      
    # factorial exists only for n>=0 
    if (n < 0): 
        return 0; 
  
    # base case 
    if (n <= 1): 
        return 1; 
  
    # else iterate through n and  
    # calculate the value 
    digits = 0; 
    for i in range(2, n + 1): 
        digits += math.log10(i); 
  
    return math.floor(digits) + 1; 
  
# Driver code  
print(findDigits(1)); 
print(findDigits(5)); 
print(findDigits(10)); 
print(findDigits(120)); 
  
# This code is contributed by mits 

