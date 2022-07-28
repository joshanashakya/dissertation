

# Python3 implementation of the approach  
import sys 
  
from math import sqrt 
  
# Function to return the minimum number  
# of moves required to reach the cell  
# containing N starting from (1, 1)  
def min_moves(n) : 
  
    # To store the required answer  
    ans = sys.maxsize;  
  
    # For all possible values of divisors  
    for i in range(1, int(sqrt(n)) + 1) : 
  
        # If i is a divisor of n  
        if (n % i == 0) : 
  
            # Get the moves to reach n  
            ans = min(ans, i + n // i - 2); 
  
    # Return the required answer  
    return ans;  
  
# Driver code  
if __name__ == "__main__" : 
  
    n = 10;  
  
    print(min_moves(n));  
  
# This code is contributed by AnkitRai01 

