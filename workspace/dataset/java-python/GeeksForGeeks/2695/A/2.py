

# Python3 Program to count all even 
# decimal value substring 
import math 
  
# Generate all substring in arr[0..n-1] 
def evenDecimalValue(str, n) : 
      
    # Store the count 
    result = 0
  
    # Pick starting point 
    for i in range(0, n) : 
  
        # Pick ending point 
        for j in range(i, n): 
  
            decimalValue = 0; 
            powerOf2 = 1; 
  
            # Substring between current  
            # starting and ending points 
            for k in range(i, j + 1) : 
                decimalValue += ((int(str[k])- 0) * powerOf2) 
  
                # increment power of 2 by one 
                powerOf2 *= 2
              
  
            if (decimalValue % 2 == 0): 
                result += 1
          
    return result 
  
  
# Driver code 
str = "10010"
n = 5
print (evenDecimalValue(str, n)) 
      
# This code is contributed by Gitanjali. 

