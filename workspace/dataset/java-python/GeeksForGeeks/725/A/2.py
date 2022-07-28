

# Python3 implementation of the approach 
  
# Utility function to return 
# the sum of the array 
def sumArr(arr, n): 
  
    sum = 0; 
    for i in range(n): 
        sum += arr[i]; 
    return sum; 
  
# Function to return the sum 
# of the modified array 
def sumModArr(arr, n): 
  
    subSum = arr[n - 1]; 
    for i in range(n - 2, -1, -1): 
  
        curr = arr[i]; 
  
        # Subtract the subarray sum 
        arr[i] -= subSum; 
  
        # Sum of subarray arr[i...n-1] 
        subSum += curr; 
  
    # Return the sum of 
    # the modified array 
    return sumArr(arr, n); 
  
# Driver code 
arr = [40, 25, 12, 10 ]; 
n = len(arr); 
  
print(sumModArr(arr, n)); 
  
# This code is contributed by 29AjayKumar 

