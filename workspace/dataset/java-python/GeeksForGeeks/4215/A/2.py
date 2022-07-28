

# Python3 implementation of the approach  
  
# Function to return the required count  
def findCnt(arr, n, k) : 
  
    # To store the final result  
    ret = 0;  
  
    # Two pointer loop  
    i = 0;  
    while (i < n) : 
  
        # Initialising j  
        j = i + 1;  
  
        # Looping till the subarray increases  
        while (j < n and arr[j] >= arr[j - 1]) : 
            j += 1;  
              
        x = max(0, j - i - k);  
  
        # Update ret  
        ret += ((j - i) * (j - i + 1)) // 2 - \ 
                          (x * (x + 1)) / 2;  
  
        # Update i  
        i = j;  
  
    # Return ret  
    return ret;  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 1, 2, 3 ];  
    n = len(arr);  
    k = 2;  
  
    print(findCnt(arr, n, k));  
  
# This code is contributed by AnkitRai01 

