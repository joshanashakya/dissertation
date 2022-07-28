

# Python3 implementation of the approach 
  
# Function to return the maximum 
# product of sum for any partition 
def maxProdSum(arr, n): 
    leftArraySum = 0; 
    maxProduct = 0; 
  
    # Traversing the array 
    for i in range(n): 
  
        # Compute left array sum 
        leftArraySum += arr[i]; 
  
        # Compute right array sum 
        rightArraySum = 0; 
        for j in range(i + 1, n): 
            rightArraySum += arr[j]; 
          
        # Multiplying left and right subarray sum 
        k = leftArraySum * rightArraySum; 
  
        # Checking for the maximum product 
        # of sum of left and right subarray 
        if (k > maxProduct): 
            maxProduct = k; 
          
    # Printing the maximum product 
    return maxProduct; 
  
# Driver code 
if __name__ == '__main__': 
    arr = [ 4, 10, 1, 7, 2, 9 ]; 
    n = len(arr); 
  
    print(maxProdSum(arr, n)); 
  
# This code is contributed by Rajput-Ji 

