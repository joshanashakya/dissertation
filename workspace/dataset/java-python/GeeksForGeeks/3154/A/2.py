

# Python3 program to determine the number  
# of squares that line will pass through  
from math import gcd 
  
# Function to return the required position  
def noOfSquares(x1, y1, x2, y2) :  
  
    dx = abs(x2 - x1);  
    dy = abs(y2 - y1);  
  
    ans = dx + dy - gcd(dx, dy);  
  
    print(ans);  
  
# Driver Code  
if __name__ == "__main__" :  
  
    x1 = 1; y1 = 1; x2 = 4; y2 = 3;  
  
    noOfSquares(x1, y1, x2, y2);  
  
# This code is contributed by Ryuga 

