

# Python3 implementation of the approach  
  
# Function to return the maximum average  
# of the sub-array with size  
# atleast x and atmost y  
def maxAvgSubArray(a, n, x, y) :  
  
    # Calculate the prefix sum array  
    prefix = [0] * n ; 
    prefix[0] = a[0]; 
    for i in range(1, n) : 
        prefix[i] = prefix[i - 1] + a[i]; 
          
    maximum = 0; 
      
    # Iterate over all sub-arrays 
    for i in range(n) : 
        j = i + x - 1
          
        # Sub-arrays of size X to Y 
        while(j < i + y and j < n) : 
              
            # Get the sum of the sub-array 
            sum = prefix[j]; 
              
            if (i > 0) : 
                sum -= prefix[i - 1]; 
              
            # Find average of sub-array  
            current = sum / (j - i + 1); 
          
            # Store the maximum of average 
            maximum = max(maximum, current); 
              
            j += 1
    return maximum;  
  
# Driver code  
if __name__ == "__main__" :  
  
    a = [ 6, 7, 8, 3, 2, 4, 2 ]; 
    X = 2; Y = 4; 
      
    n = len(a); 
    print(maxAvgSubArray(a, n, X, Y));  
  
# This code is contributed by Ryuga 

