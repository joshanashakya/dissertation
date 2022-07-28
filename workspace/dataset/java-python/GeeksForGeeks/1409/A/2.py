

# Python3 implementation of the approach  
  
# Function to return the sum of the elements  
# of all possible pairs from the array  
def sumPairs(arr, n) :  
  
    # To store the required sum  
    sum = 0;  
  
    # For every element of the array  
    for i in range(n) : 
  
        # It appears (2 * n) times  
        sum = sum + (arr[i] * (2 * n)); 
  
    return sum;  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 1, 2, 3 ];  
    n = len(arr);  
  
    print(sumPairs(arr, n));  
  
# This code is contributed by AnkitRai01 

