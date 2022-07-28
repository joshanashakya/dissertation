

# Efficient CPP Program to find the  
# largest divisor not divisible by any 
# perfect square greater than 1 
import math 
  
# Function to find the largest 
# divisor not divisible by any 
# perfect square greater than 1 
def findLargestDivisor( n): 
  
    for i in range (2, int(math.sqrt(n)) + 1) :  
          
        # If the number is divisible 
        # by i*i, then remove one i 
        while (n % (i * i) == 0) : 
            n = n // i 
      
    # Now all squares are removed from n 
    return n 
  
# Driver Code 
if __name__ == "__main__": 
  
    n = 12
    print (findLargestDivisor(n)) 
  
    n = 97
    print (findLargestDivisor(n)) 
  
# This code is contributed by ita_c 

