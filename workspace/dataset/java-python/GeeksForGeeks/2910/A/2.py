

# Python implementation of the above approach 
  
# Function to count the number of 
# sub-arrays with sum strictly greater 
# than the remaining elements of array 
def Count_subarray(arr, n): 
    subarray_sum, remaining_sum, count = 0, 0, 0; 
  
    # For loop for begining poof a subarray 
    for i in range(n): 
  
        # For loop for ending poof the subarray 
        for j in range(i, n): 
  
            # Initialise subarray_sum and 
            # remaining_sum to 0 
            subarray_sum = 0; 
            remaining_sum = 0; 
  
            # For loop to calculate 
            # the sum of generated subarray 
            for k in range(i, j + 1): 
                subarray_sum += arr[k]; 
              
  
            # For loop to calculate the 
            # sum remaining array element 
            for l in range(i): 
                remaining_sum += arr[l]; 
            for l in range(j + 1, n): 
                remaining_sum += arr[l]; 
              
            # Checking for condition when 
            # subarray sum is strictly greater than 
            # remaining sum of array element 
            if (subarray_sum > remaining_sum): 
                count += 1; 
              
    return count; 
  
# Driver code 
if __name__ == '__main__': 
    arr = [ 10, 9, 12, 6]; 
    n = len(arr); 
    print(Count_subarray(arr, n)); 
      
# This code is contributed by 29AjayKumar 

