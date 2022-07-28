

// Java implementation of above approach 
import java.io.*; 
  
class GFG  
{ 
  
// Function to find a subarray 
// whose sum is a multiple of N 
static void CheckSubarray(int arr[], int N) 
{ 
  
    // Prefix sum array to store cumulative sum 
    int presum[] = new int[N + 1]; 
  
    // Single state dynamic programming 
    // relation for prefix sum array 
    for (int i = 1; i <= N; i += 1) 
    { 
  
        presum[i] = presum[i - 1] + arr[i - 1]; 
    } 
  
    // Generating all sub-arrays 
    for (int i = 1; i <= N; i += 1) 
    { 
  
        for (int j = i; j <= N; j += 1)  
        { 
  
            // If the sum of the sub-array[i:j] 
            // is a multiple of N 
            if ((presum[j] - presum[i - 1]) % N == 0) 
            { 
                System.out.print((i - 1) + " " + (j - 1)); 
                return; 
            } 
        } 
    } 
  
    // If the function reaches here it means 
    // there are no subarrays with sum 
    // as a multiple of N 
    System.out.print(-1); 
} 
  
// Driver code 
public static void main (String[] args) 
{ 
    int []arr = { 7, 5, 3, 7 }; 
  
    int N = arr.length; 
  
    CheckSubarray(arr, N); 
  
} 
} 
  
// This code is contributed by anuj_67.. 

