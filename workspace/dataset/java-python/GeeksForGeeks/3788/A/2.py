

# Python3 implementation of the approach 
  
# Function to return the length  
# of the largest subsequence with  
# minimum possible LCM  
def maxLen(arr, n) : 
  
    # Minimum value from the array  
    min_val = min(arr);  
  
    # To store the frequency of the  
    # minimum element in the array  
    freq = 0;  
  
    for i in range(n) : 
  
        # If current element is equal  
        # to the minimum element  
        if (arr[i] == min_val) : 
            freq += 1; 
  
    return freq;  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 1, 3, 1 ];  
      
    n = len(arr);  
  
    print(maxLen(arr, n));  
  
# This code is contributed by AnkitRai01 

