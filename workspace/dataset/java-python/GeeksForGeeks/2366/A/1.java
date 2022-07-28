

// Java program to count number of subarrays 
// whose maximum element is greater than K. 
import java.util.*; 
  
class GFG { 
  
    // Return number of subarrays whose maximum 
    // element is less than or equal to K. 
    static int countSubarray(int arr[], int n, int k) 
    { 
  
        // To store count of subarrays with all 
        // elements less than or equal to k. 
        int s = 0; 
  
        // Traversing the array. 
        int i = 0; 
        while (i < n) { 
  
            // If element is greater than k, ignore. 
            if (arr[i] > k) { 
                i++; 
                continue; 
            } 
  
            // Counting the subarray length whose 
            // each element is less than equal to k. 
            int count = 0; 
            while (i < n && arr[i] <= k) { 
                i++; 
                count++; 
            } 
  
            // Suming number of subarray whose 
            // maximum element is less than equal to k. 
            s += ((count * (count + 1)) / 2); 
        } 
  
        return (n * (n + 1) / 2 - s); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
  
        int arr[] = { 1, 2, 3 }; 
        int k = 2; 
        int n = arr.length; 
        System.out.print(countSubarray(arr, n, k)); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

