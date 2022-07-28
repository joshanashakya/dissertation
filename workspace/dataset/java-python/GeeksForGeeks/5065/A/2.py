

# Python3 implementation of the approach  
  
# Function to return the maximum  
# required sum of the pairs  
def maxSum(a, n) : 
  
    # Sort the array  
    a.sort();  
  
    # To store the sum  
    sum = 0;  
  
    # Start making pairs of every two  
    # consecutive elements as n is even  
    for i in range(0, n - 1, 2) :  
  
        # Minimum element of the current pair  
        sum += a[i];  
  
    # Return the maximum possible sum  
    return sum;  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 1, 3, 2, 1, 4, 5 ];  
    n = len(arr);  
  
    print(maxSum(arr, n)); 
  
# This code is contributed by AnkitRai01 

