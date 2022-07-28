

// Java program to find minimum difference  
// of maximum and minimum of K number. 
import java.util.*; 
  
class GFG { 
      
// Return minimum difference of  
// maximum and minimum of k  
// elements of arr[0..n-1]. 
static int minDiff(int arr[], int n, int k) { 
    int result = Integer.MAX_VALUE; 
  
    // Sorting the array. 
    Arrays.sort(arr); 
  
    // Find minimum value among  
    // all K size subarray. 
    for (int i = 0; i <= n - k; i++) 
    result = Math.min(result, arr[i + k - 1] - arr[i]); 
  
    return result; 
} 
  
// Driver code 
public static void main(String[] args) { 
    int arr[] = {10, 100, 300, 200, 1000, 20, 30}; 
    int n = arr.length; 
    int k = 3; 
  
    System.out.println(minDiff(arr, n, k)); 
} 
} 
  
// This code is contributed by Anant Agarwal. 

