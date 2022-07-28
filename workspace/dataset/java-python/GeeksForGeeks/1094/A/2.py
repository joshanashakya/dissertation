

# Python3 implementation of the approach  
  
from math import ceil, sqrt 
  
# Function to print all the perfect  
# squares from the given range  
def perfectSquares(l, r) :  
  
  
    # Getting the very first number  
    number = ceil(sqrt(l));  
  
    # First number's square  
    n2 = number * number;  
  
    # Next number is at the difference of  
    number = (number * 2) + 1;  
  
    # While the perfect squares  
    # are from the range  
    while ((n2 >= l and n2 <= r)) : 
  
        # Print the perfect square  
        print(n2, end= " ");  
  
        # Get the next perfect square  
        n2 = n2 + number;  
  
        # Next odd number to be added  
        number += 2;  
  
# Driver code  
if __name__ == "__main__" :  
  
    l = 2; r = 24;  
  
    perfectSquares(l, r);  
  
# This code is contributed by AnkitRai01 

