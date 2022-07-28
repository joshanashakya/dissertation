

# Python3 implementation of above approach 
import math 
  
# Function to print the substrings of a number 
def printSubstrings(n): 
      
    # Calculate the total number of digits 
    s = int(math.log10(n)); 
  
    # 0.5 has been added because of it will 
    # return double value like 99.556 
    d = (math.pow(10, s)); 
    k = d; 
  
    while (n > 0): 
  
        # Print all the numbers from 
        # starting position 
        while (d > 0): 
            print(int(n // d)); 
            d = int(d / 10); 
  
        # Update the no. 
        n = int(n % k); 
  
        # Update the no.of digits 
        k = int(k // 10); 
        d = k; 
  
# Driver code 
if __name__ == '__main__': 
    n = 123; 
    printSubstrings(n); 
  
# This code is contributed by Rajput-Ji 

