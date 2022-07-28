

# Python3 implementation of the above approach  
  
def Count_subarray(arr, n) :  
  
    total_sum = 0;  
    count = 0;  
  
    # Calculating total sum of given array  
    for i in range(n) : 
        total_sum += arr[i];  
      
    # For loop for begining point of a subarray  
    for i in range(n) :  
  
        # initialise subarray_sum to 0  
        subarray_sum = 0;  
  
        # For loop for calculating  
        # subarray_sum and remaining_sum  
        for j in range(i, n) :  
  
            # Calculating subarray_sum  
            # and corresponding remaining_sum  
            subarray_sum += arr[j];  
            remaining_sum = total_sum - subarray_sum;  
  
            # Checking for the condition when  
            # subarray sum is strictly greater than  
            # the remaining sum of the array element  
            if (subarray_sum > remaining_sum) : 
                count += 1;  
          
    return count;  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 10, 9, 12, 6 ];  
    n = len(arr);  
    print(Count_subarray(arr, n));  
  
# This code is contributed by AnkitRai01 

