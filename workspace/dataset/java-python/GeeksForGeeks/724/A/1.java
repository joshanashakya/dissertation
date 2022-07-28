

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
  
// Utility function to return 
// the sum of the array 
static int sumArr(int arr[], int n) 
{ 
    int sum = 0; 
    for (int i = 0; i < n; i++) 
        sum += arr[i]; 
    return sum; 
} 
  
// Function to return the sum 
// of the modified array 
static int sumModArr(int arr[], int n) 
{ 
    for (int i = 0; i < n - 1; i++) 
    { 
  
        // Find the sum of the subarray 
        // arr[i+1...n-1] 
        int subSum = 0; 
        for (int j = i + 1; j < n; j++) 
        { 
            subSum += arr[j]; 
        } 
  
        // Subtract the subarray sum 
        arr[i] -= subSum; 
    } 
  
    // Return the sum of 
    // the modified array 
    return sumArr(arr, n); 
} 
  
// Driver code 
public static void main(String []args) 
{ 
    int arr[] = { 40, 25, 12, 10 }; 
    int n = arr.length; 
  
    System.out.println(sumModArr(arr, n)); 
} 
} 
  
// This code is contributed by Rajput-Ji 

