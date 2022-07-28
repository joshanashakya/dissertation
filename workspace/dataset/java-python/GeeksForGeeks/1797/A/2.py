

# Python3 implementation of the approach 
  
# Function to print the good permutation 
# of first N natural numbers 
def printPermutation(n): 
      
    # If n is odd 
    if (n % 2 != 0): 
        print(-1); 
  
    # Otherwise 
    else: 
        for i in range(1, (n // 2) + 1): 
            print((2 * i), (2 * i - 1), end = " "); 
  
# Driver code 
n = 4; 
printPermutation(n); 
  
# This code is contributed by mits 

