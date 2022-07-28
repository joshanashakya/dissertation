

// Java program to count 
// subarrays having sum 
// less than k. 
import java.io.*; 
  
class GFG { 
  
    // Function to find number 
    // of subarrays having sum 
    // less than k. 
    static int countSubarray(int arr[], 
                             int n, int k) 
    { 
        int start = 0, end = 0; 
        int count = 0, sum = arr[0]; 
  
        while (start < n && end < n) { 
  
            // If sum is less than k, 
            // move end by one position. 
            // Update count and sum 
            // accordingly. 
            if (sum < k) { 
                end++; 
  
                if (end >= start) 
                    count += end - start; 
  
                // For last element, 
                // end may become n. 
                if (end < n) 
                    sum += arr[end]; 
            } 
  
            // If sum is greater than or 
            // equal to k, subtract 
            // arr[start] from sum and 
            // decrease sliding window by 
            // moving start by one position 
            else { 
                sum -= arr[start]; 
                start++; 
            } 
        } 
  
        return count; 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        int array[] = { 1, 11, 2, 3, 15 }; 
        int k = 10; 
        int size = array.length; 
        int count = countSubarray(array, size, k); 
        System.out.println(count); 
    } 
} 
  
// This code is contributed by Sam007 

