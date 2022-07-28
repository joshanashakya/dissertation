

# Python 3 implementation of the approach 
  
# Utility function to return the sum 
# of the array elements 
def sumArr(arr, n): 
    sum = 0
    for i in range(n): 
        sum += arr[i] 
  
    return sum
  
# Function to return the maximized sum 
# of the array after performing 
# the given operation exactly k times 
def maxSum(arr, n, k): 
      
    # Sort the array elements 
    arr.sort(reverse = False) 
  
    i = 0
      
    # Change signs of the negative elements 
    # starting from the smallest 
    while (i < n and k > 0 and arr[i] < 0): 
        arr[i] *= -1
        k -= 1
        i += 1
  
    # If a single operation has to be 
    # performed then it must be performed 
    # on the smallest positive element 
    if (k % 2 == 1): 
          
        # To store the index of the 
        # minimum element 
        min = 0
        for i in range(1, n): 
              
            # Update the minimum index 
            if (arr[min] > arr[i]): 
                min = i 
  
        # Perform remaining operation 
        # on the smallest element 
        arr[min] *= -1
  
    # Return the sum of the updated array 
    return sumArr(arr, n) 
  
# Driver code 
if __name__ == '__main__': 
    arr = [-5, 4, 1, 3, 2] 
    n = len(arr) 
    k = 4
  
    print(maxSum(arr, n, k)) 
  
# This code is contributed by 
# Surendra_Gangwar 

