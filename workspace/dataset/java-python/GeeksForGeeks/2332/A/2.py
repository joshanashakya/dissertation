

# Python 3 implementation  
# of above approach 
import math 
  
# Function that traverses digits  
# in a number and modifies  
# frequency count array 
def countDigits(val, arr): 
      
    while (val > 0) : 
        digit = val % 10
        arr[int(digit)] += 1
        val = val // 10
          
    return; 
  
def countFrequency(x, n): 
      
    # Array to keep count of digits 
    freq_count = [0] * 10
  
    # Traversing through x^1 to x^n 
    for i in range(1, n + 1) : 
          
        # For power function,  
        # both its parameters  
        # are to be in double 
        val = math.pow(x, i) 
          
        # calling countDigits  
        # function on x^i 
        countDigits(val, freq_count) 
          
    # Printing count of digits 0-9 
    for i in range(10) : 
        print(freq_count[i], end = " "); 
  
# Driver code 
if __name__ == "__main__": 
      
    x = 15
    n = 3
    countFrequency(x, n) 
  
# This code is contributed  
# by ChitraNayal 

