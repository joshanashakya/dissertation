

// java program to find Maximum number of partitions 
// such that we can get a sorted array 
  
import java.io.*; 
  
class GFG  
{ 
    // Function to find maximum partitions. 
    static int maxPartitions(int arr[], int n) 
    { 
        int ans = 0, max_so_far = 0; 
        for (int i = 0; i < n; ++i) { 
      
            // Find maximum in prefix arr[0..i] 
            max_so_far = Math.max(max_so_far, arr[i]); 
      
            // If maximum so far is equal to index, 
            // we can make a new partition ending at 
            // index i. 
            if (max_so_far == i) 
                ans++; 
        } 
        return ans; 
    } 
      
    // Driver code 
    public static void main (String[] args)  
    { 
        int arr[] = { 1, 0, 2, 3, 4 }; 
        int n = arr.length; 
        System.out.println (maxPartitions(arr, n)); 
              
    } 
}  
  
// This code is contributed by vt_m. 

