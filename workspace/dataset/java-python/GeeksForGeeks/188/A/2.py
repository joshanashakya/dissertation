

# Python 3 program to represent K^N 
# as the sum of exactly N numbers 
from math import pow
  
# Function to print N numbers whose 
# sum is a power of K 
def printf(n, k): 
      
    # Printing K ^ 1 
    print(int(k),end = " ") 
  
    # Loop to print the difference of 
    # powers from K ^ 2 
    for i in range(2, n + 1, 1): 
        x = pow(k, i) - pow(k, i - 1) 
        print(int(x),end= " ") 
  
# Driver code 
if __name__ == '__main__': 
    N = 3
    K = 4
    printf(N, K) 
  
# This code is contributed by Surendra_Gangwar 

