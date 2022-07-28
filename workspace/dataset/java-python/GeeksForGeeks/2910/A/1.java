

// Java implementation of the above approach 
import java.util.*; 
  
class GFG 
{ 
  
// Function to count the number of 
// sub-arrays with sum strictly greater 
// than the remaining elements of array 
static int Count_subarray(int arr[], int n) 
{ 
    int subarray_sum, remaining_sum, count = 0; 
  
    // For loop for begining point of a subarray 
    for (int i = 0; i < n; i++)  
    { 
  
        // For loop for ending point of the subarray 
        for (int j = i; j < n; j++) 
        { 
  
            // Initialise subarray_sum and 
            // remaining_sum to 0 
            subarray_sum = 0; 
            remaining_sum = 0; 
  
            // For loop to calculate 
            // the sum of generated subarray 
            for (int k = i; k <= j; k++) 
            { 
                subarray_sum += arr[k]; 
            } 
              
            // For loop to calculate the 
            // sum remaining array element 
            for (int l = 0; l < i; l++)  
            { 
                remaining_sum += arr[l]; 
            } 
            for (int l = j + 1; l < n; l++) 
            { 
                remaining_sum += arr[l]; 
            } 
              
            // Checking for condition when 
            // subarray sum is strictly greater than 
            // remaining sum of array element 
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
  
// This code is contributed by PrinciRaj1992 

