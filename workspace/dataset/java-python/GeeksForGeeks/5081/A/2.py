

# Python3 implementation of the approach  
from math import sqrt 
  
# Utility function to print the array  
def printArr(arr, n) :  
  
    for i in range(n) : 
        print(arr[i], end = " ");  
  
# Function to generate the original  
# array from the pair-product array  
def constructArr(pair, n) :  
  
    size = int((1 + sqrt(1 + 8 * n)) // 2);  
    arr = [0] * (size);  
  
    # First element of the resulting array  
    arr[0] = int(sqrt((pair[0] * pair[1]) / 
                       pair[size - 1]));  
  
    # Find all the other elements  
    for i in range(1, size) : 
        arr[i] = pair[i - 1] // arr[0];  
  
    # Print the elements of the generated array  
    printArr(arr, size);  
  
# Driver code  
if __name__ == "__main__" :  
  
    pair = [ 48, 18, 24, 24, 32, 12 ]; 
    n = len(pair);  
  
    constructArr(pair, n);  
  
# This code is contributed by AnkitRai01 

