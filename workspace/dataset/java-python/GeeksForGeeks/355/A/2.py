

# Python3 implementation of the approach  
from math import sqrt 
  
# Function to return the Least number  
def nearest(n) :  
  
    # Get the perfect square  
    # before and after N  
    prevSquare = int(sqrt(n));  
    nextSquare = prevSquare + 1;  
    prevSquare = prevSquare * prevSquare;  
    nextSquare = nextSquare * nextSquare;  
  
    # Check which is nearest to N  
    ans    = (prevSquare - n) if (n - prevSquare) < (nextSquare - n) else (nextSquare - n);  
  
    # return the result  
    return ans;  
  
# Driver code  
if __name__ == "__main__" :  
  
    n = 14;  
    print(nearest(n)) ;  
  
    n = 16;  
    print(nearest(n));  
  
    n = 18;  
    print(nearest(n));  
  
# This code is contributed by AnkitRai01 

