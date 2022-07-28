

# Python3 program for the above approach 
  
# Creates a mul[] array for A[] and returns 
# it after filling initial values. 
def initialize(mul, div, size): 
  
    for i in range(1, size): 
        mul[i] = (mul[i] * mul[i - 1]) / div[i]; 
  
# Does range update 
def update(l, r, x, mul, div): 
    mul[l] *= x; 
    div[r + 1] *= x; 
  
# Prints updated Array 
def printArray(ar, mul, div, n): 
  
    for i in range(n): 
        ar[i] = ar[i] * mul[i]; 
        print(int(ar[i]), end = " "); 
  
# Driver code; 
if __name__ == '__main__': 
      
    # Array to be updated 
    ar = [ 10, 5, 20, 40 ]; 
    n = len(ar); 
  
    # Create and fill mul and div Array 
    mul = [0] * (n + 1); 
    div = [0] * (n + 1); 
  
    for i in range(n + 1): 
        mul[i] = div[i] = 1; 
  
    update(0, 1, 10, mul, div); 
    update(1, 3, 20, mul, div); 
    update(2, 2, 2, mul, div); 
  
    initialize(mul, div, n + 1); 
  
    printArray(ar, mul, div, n); 
  
# This code is contributed by Rajput-Ji 

