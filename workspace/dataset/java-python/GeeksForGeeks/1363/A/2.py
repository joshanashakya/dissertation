

# A optimised Python3 program to find  
# the number of digits in a factorial 
import math 
  
# Returns the number of digits present  
# in n! Since the result can be large 
# long long is used as return type 
def findDigits(n): 
      
    # factorial of -ve number  
    # doesn't exists 
    if (n < 0): 
        return 0; 
  
    # base case 
    if (n <= 1): 
        return 1; 
  
    # Use Kamenetsky formula to 
    # calculate the number of digits 
    x = ((n * math.log10(n / math.e) + 
              math.log10(2 * math.pi * n) /2.0)); 
  
    return math.floor(x) + 1; 
  
# Driver Code 
print(findDigits(1)); 
print(findDigits(50000000)); 
print(findDigits(1000000000)); 
print(findDigits(120)); 
      
# This code is contributed by mits 

