

# Python3 implementation of the approach 
  
# Function to return the  
# number of anomalies 
def countAnomalies(arr, n, k): 
  
    # To store the count of anomalies 
    cnt = 0
  
    # To store the Sum of  
    # the array elements 
    i, Sum = 0, 0
  
    # Find the Sum of the array elements 
    for i in range(n): 
        Sum += arr[i] 
  
    # Count the anomalies 
    for i in range(n): 
        if (abs(arr[i] - (Sum - arr[i])) > k): 
            cnt += 1
  
    return cnt 
  
# Driver code 
arr = [1, 3, 5] 
n = len(arr) 
k = 1
print(countAnomalies(arr, n, k)) 
  
# This code is contributed  
# by mohit kumar 

