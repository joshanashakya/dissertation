

# Python3 implementation of the approach 
  
# Function to return the maximum bitwise OR 
# for any pair of the given array 
def maxOR(arr, n): 
      
    # To store the maximum OR value 
    maxVal = 0; 
  
    # For every possible pair 
    for i in range(n - 1): 
        for j in range(i + 1, n): 
              
            # Update the maximum OR value 
            maxVal = max(maxVal, arr[i] | arr[j]); 
  
    return maxVal; 
  
# Driver code 
if __name__ == '__main__': 
    arr = [4, 8, 12, 16]; 
    n = len(arr); 
  
    print(maxOR(arr, n)); 
  
# This code is contributed by 29AjayKumar 

