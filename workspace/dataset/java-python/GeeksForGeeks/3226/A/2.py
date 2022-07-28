

# Python3 implementation of the approach  
  
# Function to return the count of  
# operations required to update  
# the array such that it is possible  
# to move from index 0 to index n - 1  
def countOp(arr, n, k) : 
  
    operations = 0;  
    for i in range(1, n) : 
  
        # Current element needs to be updated  
        if (abs(arr[i] - arr[i - 1]) > k) : 
  
            # Get the absolute difference  
            absDiff = abs(arr[i] - arr[i - 1]);  
  
            # The value which needs to  
            # be added or subtracted  
            currOp = absDiff - k;  
  
            # Add value to arr[i]  
            if (arr[i] < arr[i - 1]) : 
                arr[i] += currOp;  
  
            # Subtract value from arr[i]  
            else : 
                arr[i] -= currOp;  
  
            # Update the operations  
            operations += currOp;  
  
    return operations;  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 1, 2, 5, 9 ];  
    n = len(arr);  
    k = 2;  
  
    print(countOp(arr, n, k));  
  
# This code is contributed by AnkitRai01 

