

# Python3 implementation of the approach  
  
# Function to return the count of  
# increasing subarrays of length k  
def cntSubArrays(arr, n, k) :  
  
    # To store the final result  
    res = 0;  
  
    i = 0;  
      
    # Two pointer loop  
    while (i < n) : 
  
        # Initialising j  
        j = i + 1;  
  
        # Looping till the subarray increases  
        while (j < n and arr[j] >= arr[j - 1]) : 
            j += 1;  
  
        # Updating the required count  
        res += max(j - i - k + 1, 0);  
  
        # Updating i  
        i = j;  
  
    # Returning res  
    return res;  
  
# Driver code  
if __name__ == "__main__" :  
      
    arr = [ 1, 2, 3, 2, 5 ];  
    n = len(arr);  
    k = 2;  
  
    print(cntSubArrays(arr, n, k));  
      
# This code is contributed by AnkitRai01 

