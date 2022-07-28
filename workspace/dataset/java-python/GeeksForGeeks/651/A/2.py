

# Python3 implementation of the approach  
  
# Function to return the maximum length  
# of the sub-array such that the  
# absolute difference between every two  
# consecutive elements is either 1 or 0  
def getMaxLength(arr, n) : 
      
    l = n;  
    i = 0; maxlen = 0; 
      
    while (i < l) : 
        j = i;  
        while (i + 1 < l and
              (abs(arr[i] - arr[i + 1]) == 1 or
               abs(arr[i] - arr[i + 1]) == 0)) : 
          
            i += 1;  
          
        # Length of the valid sub-array  
        # currently under cosideration  
        currLen = i - j + 1;  
  
        # Update the maximum length  
        if (maxlen < currLen) :  
            maxlen = currLen;  
  
        if (j == i) : 
            i += 1;  
      
    # Any valid sub-array cannot be of length 1  
    # maxlen = (maxlen == 1) ? 0 : maxlen;  
  
    # Return the maximum possible length  
    return maxlen;  
      
# Driver code  
if __name__ == "__main__" : 
  
    arr = [ 2, 4 ];  
    n = len(arr)  
    print(getMaxLength(arr, n));  
  
# This code is contributed by Ryuga 

