

# Python3 implementation of the approach 
  
# Function to return the count of 
# subarrays with negative product 
def negProdSubArr(arr, n): 
    positive = 1
    negative = 0
    for i in range(n): 
  
        # Replace current element with 1 
        # if it is positive else replace 
        # it with -1 instead 
        if (arr[i] > 0): 
            arr[i] = 1
        else: 
            arr[i] = -1
  
        # Take product with previous element 
        # to form the prefix product 
        if (i > 0): 
            arr[i] *= arr[i - 1] 
  
        # Count positive and negative elements 
        # in the prefix product array 
        if (arr[i] == 1): 
            positive += 1
        else: 
            negative += 1
  
    # Return the required count of subarrays 
    return (positive * negative) 
  
# Driver code 
arr = [5, -4, -3, 2, -5] 
n = len(arr) 
  
print(negProdSubArr(arr, n)) 
  
# This code is contributed by Mohit Kumar 

