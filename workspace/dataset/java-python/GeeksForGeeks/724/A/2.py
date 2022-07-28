

# Python3 implementation of the approach 
  
# Utility function to return 
# the sum of the array 
def sumArr(arr, n): 
    sum = 0
    for i in range(n): 
        sum += arr[i] 
    return sum
  
# Function to return the sum 
# of the modified array 
def sumModArr(arr, n): 
  
    for i in range(n - 1): 
  
        # Find the sum of the subarray 
        # arr[i+1...n-1] 
        subSum = 0
        for j in range(i + 1, n): 
            subSum += arr[j] 
              
        # Subtract the subarray sum 
        arr[i] -= subSum 
  
    # Return the sum of 
    # the modified array 
    return sumArr(arr, n) 
  
# Driver code 
arr = [40, 25, 12, 10] 
n = len(arr) 
  
print(sumModArr(arr, n)) 
  
# This code is contributed by Mohit Kumar 

