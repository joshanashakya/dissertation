

# Python3 implementation of the approach 
  
# Function to find the required subarray 
def findSubArr(arr, n) : 
  
    # For every two consecutive element subarray 
    for i in range(n - 1) : 
  
        # If the current pair of consecutive 
        # elements satisfies the given condition 
        if (abs(arr[i] - arr[i + 1]) >= 2) : 
            print(arr[i] ,arr[i + 1],end=""); 
            return; 
  
    # No such subarray found 
    print(-1); 
  
# Driver code 
if __name__ == "__main__" : 
    arr = [ 1, 2, 4, 6, 7 ]; 
    n = len(arr); 
  
    findSubArr(arr, n); 
  
# This code is contributed by AnkitRai01 

