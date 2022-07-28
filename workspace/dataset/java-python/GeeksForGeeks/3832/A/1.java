

// Java program to find the maximum sum of strictly 
// increasing subarrays 
  
public class GFG { 
  
// Returns maximum sum of strictly increasing 
// subarrays 
    static int maxsum_SIS(int arr[], int n) { 
        // Initialize max_sum be 0 
        int max_sum = 0; 
  
        // Initialize current sum be arr[0] 
        int current_sum = arr[0]; 
  
        // Traverse array elements after first element. 
        for (int i = 1; i < n; i++) { 
            // update current_sum for strictly increasing subarray 
            if (arr[i - 1] < arr[i]) { 
                current_sum = current_sum + arr[i]; 
            } else // strictly increasing subarray break 
            { 
                // update max_sum and current_sum ; 
                max_sum = Math.max(max_sum, current_sum); 
                current_sum = arr[i]; 
            } 
        } 
  
        return Math.max(max_sum, current_sum); 
    } 
  
// driver program 
    public static void main(String[] args) { 
        int arr[] = {1, 2, 2, 4}; 
        int n = arr.length; 
        System.out.println("Maximum sum : " + maxsum_SIS(arr, n)); 
    } 
} 
  
// This code is contributed by 29AjayKumar  

