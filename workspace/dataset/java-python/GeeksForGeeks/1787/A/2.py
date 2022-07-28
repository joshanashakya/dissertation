

# Python3 implementation of the above approach  
from math import floor,ceil,log2 
  
# Function to return the lowest power  
# of 2 close to given positive number  
def powOfPositive(n) :  
  
    # Floor function is used to determine  
    # the value close to the number  
    pos = floor(log2(n));  
    return 2**pos;  
  
# Function to return the lowest power  
# of 2 close to given negative number  
def powOfNegative(n) : 
  
    # Ceil function is used for negative numbers  
    # as -1 > -4. It would be opposite  
    # to positive numbers where 1 < 4  
    pos = ceil(log2(n));  
      
    return (-1 * pow(2, pos));  
  
# Function to find the highest power of 2  
def highestPowerOf2(n) :  
  
    # To check if the given number  
    # is positive or negative  
    if (n > 0) : 
        print(powOfPositive(n));  
  
    else :  
          
        # If the number is negative,  
        # then the ceil of the positive number  
        # is calculated and  
        # negative sign is added  
        n = -n;  
        print(powOfNegative(n));  
  
# Driver code  
if __name__ == "__main__" :  
  
    n = -24;  
    highestPowerOf2(n);  
  
# This code is contributed by AnkitRai01 

