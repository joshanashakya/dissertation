

// Java implementation of the above approach 
class GFG 
{ 
  
static int Count_subarray(int arr[], int n) 
{ 
    int total_sum = 0, subarray_sum, 
        remaining_sum, count = 0; 
  
    // Calculating total sum of given array 
    for (int i = 0; i < n; i++) 
    { 
        total_sum += arr[i]; 
    } 
  
    // For loop for begining point of a subarray 
    for (int i = 0; i < n; i++)  
    { 
        // initialise subarray_sum to 0 
        subarray_sum = 0; 
  
        // For loop for calculating 
        // subarray_sum and remaining_sum 
        for (int j = i; j < n; j++) 
        { 
  
            // Calculating subarray_sum 
            // and corresponding remaining_sum 
            subarray_sum += arr[j]; 
            remaining_sum = total_sum - subarray_sum; 
  
            // Checking for the condition when 
            // subarray sum is strictly greater than 
            // the remaining sum of the array element 
            if (subarray_sum > remaining_sum)  
            { 
                count += 1; 
            } 
        } 
    } 
    return count; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 10, 9, 12, 6 }; 
    int n = arr.length; 
    System.out.print(Count_subarray(arr, n)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

