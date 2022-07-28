

# Python3 program to check whether the number  
# can be made perfect square after adding K  
from math import sqrt 
  
# Function to check whether the number  
# can be made perfect square after adding K  
def isPerfectSquare(x) :  
  
    # Computing the square root of  
    # the number  
    sr = int(sqrt(x));  
  
    # Print Yes if the number  
    # is a perfect square  
    if (sr * sr == x) : 
        print("Yes");  
    else : 
        print("No");  
  
# Driver code  
if __name__ == "__main__" :  
  
    n = 7; k = 2;  
    isPerfectSquare(n + k);  
  
# This code is contributed by Yash_R 

